import { Injectable } from '@angular/core';

// import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  items = [];
  // totalPrice = 0;
  addToCart(item) {
    this.items.push(item);
  }

  getItems() {
    return this.items;
  }

  clearCart() {
    this.items = [];
    return this.items;
  }

  deleteItem(itemId) {
    this.items.splice(itemId, 1);
  }

  calculateTotalPrice() {
    let totalPrice = 0;
    this.items.forEach((val, idx, array) => {
      totalPrice += val.price;
    });
    return totalPrice;
  }

constructor(
  // private http: HttpClient
) { }

}
