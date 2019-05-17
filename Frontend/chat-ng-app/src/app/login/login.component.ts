import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

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

  //zapytanie do serwera; nie usuwać
  login(): void {
    let url = "http://localhost:8080/user/login";
    this.http.post(url, this.user).subscribe(
      isValid => {
        if (isValid) { //gdy się zalogujemy
          location.assign("/chat");
          /*localStorage.setItem('currentUser', JSON.stringify({ token: token, name: name }));*/
        }
        else { //gdy się nie zalogujemy
          alert("Error");
        }
      }
      /*res => {
        localStorage.setItem(this.userS, JSON.stringify(this.user));
        alert("ASD");
        location.assign("/chat"); },
      err => {
        alert("Error!"); }*/
    );
  }

}

//nie usuwać
export interface User {
  name: string;
  password: string;
}
