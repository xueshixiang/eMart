import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemaddService } from '../itemAdd.service';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})
export class ReportComponent implements OnInit {

  constructor(private router: Router, private itemaddService: ItemaddService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
    // if (this.validInput(value)) {
  //     // this.itemaddService.postReport(value).subscribe(
  //     //   data => {
  //     //     console.log(JSON.stringify(data));
  //     //     const info: any = data;
  //     //     if (200 === info.code) {
  //     //         console.log('Report success!');
  //     //     } else {
  //     //       console.log('Report ');
  //     //     }
  //     //   }
  //     // );
      console.log('Report Success');
  // }
  }

}
