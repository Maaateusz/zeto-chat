import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  password2='';  //Confirmation password wiadomo o co chodzi

  model:User =
  {
    name:'',
    password:'',
  };

  sendRegistration():void
  {
    let url = "http://localhost:8080/user/add";
    this.http.post(url, this.model).subscribe(
      res => {
        location.reload(); },
      err => {
        alert("Error"); }
    );
  }

}

export interface User
{
  name:string;
  password:string;
}
