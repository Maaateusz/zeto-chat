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
/user/all wszyscy u�ytkownicy
/user/{id} user o id
/user/registration dodaje usera
/user/login do logowania
/room/all
/room/{id}

=> Dzia�a rejestracja i logowanie.

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

=> przy instalacji na nowym u��dzeniu: folder node_modules usuwamy i uruchamiamy npm install w konsoli, je�li go nie ma to tylko instalujemy, zajmuje 200MB wi�ck wysy�amy na GitHuba bez niego !

Poradnik: https://www.youtube.com/playlist?list=PLVApX3evDwJ2keNFsQ4PhA1yVaXpto2oN

/========================================\
GitHub:
git clone https://github.com/Maaateusz/zeto-chat.git pobranie aktualnego repozytorium 
git add -A dodaje pliki do �ledzenia
git commit -m "komentarz w apostrofach" aktualizuje pliki lokalne, komentarz jakie zmiany wprowadzono
git push wys�anie zmian na GitHuba

Poradnik: https://stormit.pl/git/#pracana-zmianach

=>�eby ignorowa� node_modules mo�na storzy� plik .gitignore w katalogu projektu (touch .gitignore) i wpisujemy tam node_modules.

/========================================\
Inne:
=>Po wpowadzeniu jakich� zmian napiszcie na Facebooku.
Trzeba popracowa� nad ca�ym wygl�dem. 
Mo�e by� jaki� Bootstap albo nie, co tam chcecie.
Obs�uga validacji input�w:
- brak polskich i innych dziwnych znak�w,
- nazwa min 3 znaki max 15,
- has�o min 3 max 20,
- w rejestracji: zgodno�� has�a z has�em2
tylko po spe�nieniu tych warunk�w fronted wysy�a ��danie do backendu!
W kodzie mo�ecia edytowa� wszystko, dodawa�, usuwa� co chcecie, byle by dzia�a�o dobrze.
W Readme te� mo�ecie dodawa� jakie� informacje.

W razie pyta� piszcie.






