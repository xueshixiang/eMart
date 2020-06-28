import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from './../environments/environment';
import {User} from './models/user';
import { userInfo } from 'os';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class PurchaseHistoryService {

  constructor(private http: HttpClient) { }

  public get currentUserToken(): string {
    return sessionStorage.getItem('token');
  }

  postPurchaseHistory() {

    var inputData = {};

    inputData["userName"] = sessionStorage.getItem('userName');
    inputData["password"] = sessionStorage.getItem('password');
    return this.http.post(`${environment.baseUrl}/emart-buyer-service/api/buyer/searchpurchaseHistory`, JSON.stringify(inputData), httpOptions);
  }

}
