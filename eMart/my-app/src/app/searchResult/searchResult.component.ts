import { Component, OnInit } from '@angular/core';

import { items } from '../items';

@Component({
  selector: 'app-searchResult',
  templateUrl: './searchResult.component.html',
  styleUrls: ['./searchResult.component.css']
})
export class SearchResultComponent implements OnInit {

  items = items; // dummy data

  constructor() { }

  ngOnInit() {
  }

}
