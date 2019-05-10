import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit
{

  model:User =
  {
    name:'',
    password:''
  };

  constructor() { }

  ngOnInit() {
  }

  sendLogin():void
{
  alert(this.model.name);
}

}

export interface User
{
  name:string;
  password:string;
}
