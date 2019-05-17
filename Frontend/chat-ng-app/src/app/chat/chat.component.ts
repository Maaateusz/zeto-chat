import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Room } from "../room";

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {
  rooms: Room[] = [];
  message = '...';

  room: Room =
    {
      id: 1,
      name: ''
    };

  constructor(private http: HttpClient) { }

  ngOnInit()  //przy uruchomieniu strony
  {
    this.getAllRooms();
    //this.setUser();
  }

  setUser() {
    //this.user=JSON.parse(localStorage.getItem(userS));
  }

  sendMessage() {
    alert("wysłano!");
  }

  getAllRooms() {
    let url = "http://localhost:8080/room/all";
    this.http.get<Room[]>(url).subscribe(
      res => {
        this.rooms = res;
      },
      err => {
        alert("Errorrinhoo!")
      }
    );
  }

  fileContent: string = '';

  public onChange(fileList: FileList): void {
    let file = fileList[0];
    let fileReader: FileReader = new FileReader();
    let self;
    fileReader.onloadend = function (x) {
      self = fileReader.result;
    }
    fileReader.readAsText(file);
  }

}
