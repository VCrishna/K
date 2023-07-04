import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Explore } from '../models/explore.model';

@Injectable({
  providedIn: 'root'
})
export class ExploreService {

  private baseUrl = 'http://localhost:8080/api/explore';

  constructor(private http: HttpClient) { }

  getExplore(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createExplore(explore: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, explore);
  }

  updateExplore(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteExplore(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getExploreList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}