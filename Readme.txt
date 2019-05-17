Spring Boot 2.1.4
Java 12
NodeJS 12.2.0
Angular CLI: 7.3.9

/========================================\
Database:
Na XAMPP phpMyAdmin: database.sql

/========================================\
Spring Boot:
http://localhost:8080/
/user/all wszyscy u¿ytkownicy
/user/{id} user o id
/user/registration dodaje usera
/user/login do logowania
/room/all
/room/{id}

=> Dzia³a rejestracja i logowanie, jeszcze muszê ogarn¹æ zmienne sesyjne w angularze i zajmê siê wiadomoœciami.

/========================================\
Angular:
Pobieramy NodeJS
Instalujemy
node -v w konsoli do sprawdzenia wersji
npm install npm -g instalacja npm menager
npm install npm -g @angular/cli instalacja CLI
npm new my-app tworzenie nowego projektu lub \/
ng new my-app tworzenie nowego projektu lub /\
ng build 
ng serve --open skompilowanie i uruchomienie
http://localhost:4200/
/login
/registration
/chat

=> przy instalacji na nowym u¿¹dzeniu: folder node_modules usuwamy i uruchamiamy npm install w konsoli, jeœli go nie ma to tylko instalujemy, zajmuje 200MB wiêck wysy³amy na GitHuba bez niego !

Poradnik jakiœ: https://www.youtube.com/playlist?list=PLVApX3evDwJ2keNFsQ4PhA1yVaXpto2oN

/========================================\
GitHub:

=>¯eby ignorowaæ node_modules mo¿na storzyæ plik .gitignore w katalogu projektu (touch .gitignore) i wpisujemy tam node_modules.










