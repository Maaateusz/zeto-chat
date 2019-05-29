import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Room } from "../room";
import { Message } from "../message";
import { ACTIVE_INDEX } from '@angular/core/src/render3/interfaces/container';
import { template } from '@angular/core/src/render3';
import { analyzeAndValidateNgModules } from '@angular/compiler';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {

  rooms: Room[] = [];
  messages: Message[] = [];
  roomId: number;
  messageContent: string = '';
  name: string = '';
  password: string = '';
  refresh;
  senderHidden = true;
  path = "http://localhost:8080/";

  /*room: Room =
    {
      id: 1,
      name: ''
    };*/

  message: Message;

  constructor(private http: HttpClient) { }

  ngOnInit()  //przy uruchomieniu strony
  {
    this.getLocal();
    this.checkSession();
    this.getAllRooms();
    this.refresh = setInterval(() => {
      this.getMessages(this.roomId);
    }, 1500); //interval 1,5 sek
    //clearInterval(this.refresh);
  }

  checkSession() {
    if (this.name == null || this.name == '') {
      location.assign("/login");
    }
  }

  getLocal() {
    this.name = localStorage.getItem('name');
    this.password = localStorage.getItem('password');
  }

  logout() {
    localStorage.clear();
    location.assign("/login");
  }

  setMessage() {
    this.message =
    {
      user: this.name,
      content: this.messageContent.replace(new RegExp('\n', 'g'), "\\n"),
      roomId: this.roomId
    };
    this.messageContent = '';
  }

  sendMessage() {
    let url = this.path + "message/add";
    
    if (this.messageContent != '')
    {
      this.setMessage();
      this.http.post(url, this.message).subscribe(
        isValid => {
          if (isValid) { //gdy wysyłamy
            //alert("wysłano");       //tu coś nie działa
          }
          else {
            //alert("Error");
          }
        }
      );
    }
    
  }

  getAllRooms() {
    let url = this.path + "room/all";
    this.http.get<Room[]>(url).subscribe(
      res => {
        this.rooms = res;
      },
      err => {
        //alert("Errorrinhoo!")
      }
    );
  }

  getMessages(id) {
    //this.senderHidden = false;
    this.roomId = id;
    let url = this.path + "/message/" + id;
    this.http.get<Message[]>(url).subscribe(
      res => {
        this.messages = res;
        console.log(res);
      },
      err => {
        //alert("Errssss!")
      }
    );
    document.getElementById("messageBody").scrollTop = document.getElementById("messageBody").scrollHeight;
  }

  activateButton(r) {
    for (let r2 of this.rooms)
    {
      r2.active = false;
    }

    if (!r.active) r.active = !r.active;
  }

}
