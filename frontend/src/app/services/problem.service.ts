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

  createProblem(problem: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, problem);
  }

  updateProblem(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteProblem(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getProblemsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}