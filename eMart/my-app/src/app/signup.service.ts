import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from './../environments/environment';
import {Buyer} from './models/buyer';
import {Seller} from './models/seller';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http: HttpClient) { }

  public get currentUserToken(): string {
    return sessionStorage.getItem('token');
  }

  postBuyerSignUp(buyer) {
    return this.http.post(`${environment.baseUrl}/emart-user-service/api/user/buyerSignUp`, JSON.stringify(buyer), httpOptions);
  }

  postSellerSignUp(seller) {
    return this.http.post(`${environment.baseUrl}/emart-user-service/api/user/sellerSignUp`, JSON.stringify(seller), httpOptions);
  }

}
