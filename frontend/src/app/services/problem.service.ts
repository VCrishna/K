import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Problem } from '../models/problem.model';

@Injectable({
  providedIn: 'root'
})
export class ProblemService {

  private baseUrl = 'http://localhost:8080/api/problems';

  constructor(private http: HttpClient) { }

  getProblem(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createProblem(problem: Problem): Observable<any> {
    return this.http.post(`${this.baseUrl}`, problem);
  }

  updateProblem(id: number, value: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteProblem(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getProblemsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getProblemsByUser(userId: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/user/${userId}`);
  }

  getSolvedProblems(): Observable<any> {
    return this.http.get(`${this.baseUrl}/solved`);
  }

  getNewProblems(): Observable<any> {
    return this.http.get(`${this.baseUrl}/new`);
  }
}