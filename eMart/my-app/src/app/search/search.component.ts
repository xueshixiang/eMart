import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { SearchService } from '../search.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  name = new FormControl('');

  constructor(private router: Router, private searchService: SearchService) { }

  ngOnInit() {
  }

  search() {
    let value = $("#inputItemname").val();
  //     // this.searchService.postItemList(value).subscribe(
  //     //   data => {
  //     //     console.log(JSON.stringify(data));
  //     //     const info: any = data;
  //     //     if (200 === info.code) {
  //     //         console.log('Sign in success!');
  //     //         this.router.navigate(['/login']);
  //     //     } else {
  //     //       console.log('Sign in ');
  //     //       this.alerts.push({type : 'danger', message: 'username or password error!'});

  //     //     }
  //     //   }
  //     // );
    console.log('Search Success');
    this.router.navigate(['/searchResult']);
  }

}
