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

=> Dzia³a rejestracja i logowanie.

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

Poradnik: https://www.youtube.com/playlist?list=PLVApX3evDwJ2keNFsQ4PhA1yVaXpto2oN

/========================================\
GitHub:
git clone https://github.com/Maaateusz/zeto-chat.git pobranie aktualnego repozytorium 
git add -A dodaje pliki do œledzenia
git commit -m "komentarz w apostrofach" aktualizuje pliki lokalne, komentarz jakie zmiany wprowadzono
git push wys³anie zmian na GitHuba

Poradnik: https://stormit.pl/git/#pracana-zmianach

=>¯eby ignorowaæ node_modules mo¿na storzyæ plik .gitignore w katalogu projektu (touch .gitignore) i wpisujemy tam node_modules.

/========================================\
Inne:
=>Po wpowadzeniu jakichœ zmian napiszcie na Facebooku.
Trzeba popracowaæ nad ca³ym wygl¹dem. 
Mo¿e byæ jakiœ Bootstap albo nie, co tam chcecie.
Obs³uga validacji inputów:
- brak polskich i innych dziwnych znaków,
- nazwa min 3 znaki max 15,
- has³o min 3 max 20,
- w rejestracji: zgodnoœæ has³a z has³em2
tylko po spe³nieniu tych warunków fronted wysy³a ¿¹danie do backendu!
W kodzie mo¿ecia edytowaæ wszystko, dodawaæ, usuwaæ co chcecie, byle by dzia³a³o dobrze.
W Readme te¿ mo¿ecie dodawaæ jakieœ informacje.

W razie pytañ piszcie.






