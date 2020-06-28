import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { items } from '../items';

import { CartService } from '../cart.service';

@Component({
  selector: 'app-itemDetail',
  templateUrl: './itemDetail.component.html',
  styleUrls: ['./itemDetail.component.css']
})
export class ItemDetailComponent implements OnInit {
  item;

  constructor(
    private route:ActivatedRoute,
    private cartService:CartService
  ) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.item = items[+params.get('itemId')];
    });
  }

  addToCart(item) {
    window.alert('Your product has been added to the cart!');
    this.cartService.addToCart(item);
  }

}
