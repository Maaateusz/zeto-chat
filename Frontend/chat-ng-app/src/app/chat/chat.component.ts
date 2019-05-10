import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../user";

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {
  users: User[] = [];
  message='...';

  constructor(private http: HttpClient) { }

  ngOnInit()  //przy uruchomieniu strony
  {
    this.getAllUsers();
  }

  sendMessage()
  {
    alert("wysłano!");
  }

  getAllUsers()
  {
    let url = "http://localhost:8080/user/all";
    this.http.get<User[]>(url).subscribe(
      res => {
        this.users = res; },
      err => {
        alert("Errorrinhoo!") }
    );
  }

  fileContent: string = '';

  public onChange(fileList: FileList): void {
    let file = fileList[0];
    let fileReader: FileReader = new FileReader();
    let self = this;
    fileReader.onloadend = function(x) {
      self.fileContent = fileReader.result;
    }
    fileReader.readAsText(file);
  }

}
