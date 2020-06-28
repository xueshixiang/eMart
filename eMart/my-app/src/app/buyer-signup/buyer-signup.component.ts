import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SignupService } from '../signup.service';

interface Alert {
  type: string;
  message: string;
}

const ALERTS: Alert[] = [];

@Component({
  selector: 'app-buyer-signup',
  templateUrl: './buyer-signup.component.html',
  styleUrls: ['./buyer-signup.component.css']
})
export class BuyerSignupComponent implements OnInit {

  alerts: Alert[];

  constructor(private router: Router, private signupService: SignupService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
    if (this.validInput(value)) {
  //     // this.signupService.postBuyerSignUp(value).subscribe(
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
      console.log('Buyer SignUp Success');
      this.router.navigate(['/login']);
    }
  }

  validInput(value: any): boolean {
    this.reset();
    let result = true
    if (!value.name) {
      this.alerts.push({type : 'danger', message: 'username required!'});
      result = false;
    }

    if (!value.password) {
      this.alerts.push({type : 'danger', message: 'password required!'});
      result =  false;
    }

    if (value.password.length < 6) {
      this.alerts.push({type : 'danger', message: 'password length must be greater than 6!'});
      result =  false;
    }

    if (!value.email) {
      this.alerts.push({type : 'danger', message: 'email required!'});
      result = false;
    }

    if (!value.mobile) {
      this.alerts.push({type : 'danger', message: 'mobile required!'});
      result = false;
    }
    return result;
  }

  close(alert: Alert) {
    this.alerts.splice(this.alerts.indexOf(alert), 1);
  }

  reset() {
    this.alerts = Array.from(ALERTS);
  }

}
