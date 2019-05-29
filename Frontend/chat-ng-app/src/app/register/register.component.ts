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
  path = "http://localhost:8080/";

  //nie usuwać
  user: User =
    {
      name: '',
      password: '',
    };

  //zapytanie do serwera; nie usuwać
  registration(): void {
    this.user.name = this.user.name.trim();
    let url = this.path + "user/registration";
    if (this.user.password == this.password2) //jeśli wszystkie pola są poprawne
    {
      this.http.post(url, this.user).subscribe(
        isValid => {
          if (isValid) { //gdy stworzy się nowe konto
            location.assign("/login?message=Now you can login");
          }
          else { //gdy się nie stworzy konta
            //alert("Error");
          }
        }
        /*res => { 
          location.assign("/login?message=Now you can login"); },
        err => {
          alert("Error"); }*/
      );
    }
    //else alert("Hasła się nie zgadzają!");
  }

}

//nie usuwać
export interface User {
  name: string;
  password: string;
}
