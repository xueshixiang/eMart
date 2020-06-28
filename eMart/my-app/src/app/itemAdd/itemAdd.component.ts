import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemaddService } from '../itemAdd.service';

@Component({
  selector: 'app-itemAdd',
  templateUrl: './itemAdd.component.html',
  styleUrls: ['./itemAdd.component.css']
})
export class ItemAddComponent implements OnInit {

  constructor(private router: Router, private itemaddService: ItemaddService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
    // if (this.validInput(value)) {
  //     // this.itemaddService.postItemAdd(value).subscribe(
  //     //   data => {
  //     //     console.log(JSON.stringify(data));
  //     //     const info: any = data;
  //     //     if (200 === info.code) {
  //     //         console.log('Sign in success!');
  //     //         this.router.navigate(['/products']);
  //     //     } else {
  //     //       console.log('Sign in ');
  //     //       this.alerts.push({type : 'danger', message: 'username or password error!'});
  //     //     }
  //     //   }
  //     // );
      console.log('Item Add Success');
      this.router.navigate(['/search']);
    // }
  }

}
