import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemaddService } from '../itemAdd.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-viewstock',
  templateUrl: './viewstock.component.html',
  styleUrls: ['./viewstock.component.css']
})
export class ViewstockComponent implements OnInit {

  constructor(private router: Router, private itemaddService: ItemaddService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
       this.itemaddService.postViewStock(value).subscribe(
         data => {
           console.log(JSON.stringify(data));
           const info: any = data;
           if (200 === info.code) {
              console.log('Item Add Success!');
              $("#noOfStockItems").val(data.items.stockNumber);
              // $("#noOfSoldItems").val(data.items.stockNumber);
           } else {
             console.log('Item Add');
           }
         }
       );
      console.log('Item Add Success');
   }

}
