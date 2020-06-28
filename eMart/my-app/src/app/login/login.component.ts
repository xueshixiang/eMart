import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

interface Alert {
  type: string;
  message: string;
}

const ALERTS: Alert[] = [];

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  alerts: Alert[];
  signinForm;

  constructor(private router: Router, private userService:UserService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
    if (this.validInput(value)) {
      this.userService.postSignIn(value).subscribe(
        data => {
          console.log(JSON.stringify(data));
          const info: any = data;
          if (200 === info.code) {
              console.log('Sign in success!');
              sessionStorage.setItem('token', info.result.token);
              sessionStorage.setItem('userName', value.name);
              sessionStorage.setItem('password', value.password);
              this.router.navigate(['/products']);
          } else {
            console.log('Sign in ');
            this.alerts.push({type : 'danger', message: 'username or password error!'});
          }
        }
      );
      console.log('Sign In Success');
      if (value.userType == '1') {
        this.router.navigate(['/search']);
      } else {
        this.router.navigate(['/itemAdd']);
      }
    }
  }
  
  validInput(value: any): boolean {
    this.reset();
    let result = true
    if (!value.userType) {
      this.alerts.push({type : 'danger', message: 'usertype required!'});
      result = false;
    }
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
    return result;
  }

  close(alert: Alert) {
    this.alerts.splice(this.alerts.indexOf(alert), 1);
  }

  reset() {
    this.alerts = Array.from(ALERTS);
  }

}
