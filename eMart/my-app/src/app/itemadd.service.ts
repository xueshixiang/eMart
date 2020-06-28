import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from './../environments/environment';
import {Item} from './models/item';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class ItemaddService {

  constructor(private http: HttpClient) { }

  public get currentUserToken(): string {
    return sessionStorage.getItem('token');
  }

  postItemAdd(item) {
    return this.http.post(`${environment.baseUrl}/emart-seller-service/api/seller/addItems`, JSON.stringify(item), httpOptions);
  }

  postViewStock(item) {
    return this.http.post(`${environment.baseUrl}/emart-seller-service/api/seller/viewStock`, JSON.stringify(item), httpOptions);
  }

  postReport(item) {
    return this.http.post(`${environment.baseUrl}/emart-seller-service/api/seller/report`, JSON.stringify(item), httpOptions);
  }

}
