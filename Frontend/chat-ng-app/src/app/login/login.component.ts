import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { RegisterComponent } from '../register/register.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  constructor(private http: HttpClient) { } //nie usuwać

  ngOnInit() {
  }

  message: 'k';

  //nie usuwać
  user: User =
    {
      name: '',
      password: '',
    };
  
  setLocal()
  {
    //localStorage.setItem('id', this.user.id);
    localStorage.setItem('name', this.user.name);
    localStorage.setItem('password', this.user.password);
  }

  //zapytanie do serwera; nie usuwać
  login(): void {
    let url = "http://localhost:8080/user/login";
    this.http.post(url, this.user).subscribe(
      isValid => {
        if (isValid) { //gdy się zalogujemy
          this.setLocal();
          location.assign("/chat");
        }
        else { //gdy się nie zalogujemy
          alert("Error");
        }
      },
      err => {this.setLocal(); location.assign("/chat");}
    );
  }

}

//nie usuwać
export interface User {
  name: string;
  password: string;
}
