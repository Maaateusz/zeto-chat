import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {

  constructor(private http: HttpClient) { } //nie usuwać

  ngOnInit() {
  }

  password2 = '';  //Confirmation password wiadomo o co chodzi

  //nie usuwać
  user: User =
    {
      name: '',
      password: '',
    };

  //zapytanie do serwera; nie usuwać
  registration(): void {
    let url = "http://localhost:8080/user/registration";
    this.http.post(url, this.user).subscribe(
      isValid => {
        if (isValid) { //gdy stworzy się nowe konto
          location.assign("/login?message=Now you can login");
        }
        else { //gdy się nie stworzy konta
          alert("Error"); 
        }
      }
      /*res => { 
        location.assign("/login?message=Now you can login"); },
      err => {
        alert("Error"); }*/
    );
  }

}

//nie usuwać
export interface User {
  name: string;
  password: string;
}
