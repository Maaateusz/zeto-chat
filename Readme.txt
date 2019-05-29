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
/message/id wiadomo�ci z pokoju o id
/message/add dodanie wiadomo�ci 
itp. 

=> Dzia�a rejestracja, logowanie, wiadomo�ci i pokoje.

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
- w wiadomo�ci minimum 1 znak
tylko po spe�nieniu tych warunk�w fronted wysy�a ��danie do backendu!
W kodzie mo�ecia edytowa� wszystko, dodawa�, usuwa� co chcecie, byle by dzia�a�o dobrze.
W Readme te� mo�ecie dodawa� jakie� informacje.

W razie pyta� piszcie.



PRZYGOTOWANIE
Mi�so pokroi� w kostk�. Cebul� pokroi� w kosteczk� i zeszkli� na oleju w du�ym garnku. Doda� mi�so i dok�adnie je obsma�y�.
Wla� 2 szklanki gor�cej wody, posoli�, doprawi� pieprzem i zagotowa�. Nast�pnie doda� po�amane suszone grzyby, przykry�, zmniejszy� ogie� i gotowa� przez ok. 45 minut.
Doda� listek laurowy, ziela angielskie, kminek, majeranek, powid�a �liwkowe lub posiekane �liwki, obrane i pokrojone w kosteczk� obrane jab�ko i wymiesza�.
Doda� kiszon� kapust� (je�li jest kwa�na nale�y j� wcze�niej wyp�uka� na sitku), wla� szklank� wody, wymiesza�, przykry� i gotowa� do mi�kko�ci kapusty przez ok. 45 minut. Mniej wi�cej w po�owie gotowania doda� obran� i pokrojon� na kawa�eczki kie�bas�. Pod koniec doda� koncentrat pomidorowy.
M�k� podsma�y� na suchej patelni, gdy zacznie br�zowie� doda� �y�k� mas�a i miesza� a� mas�o si� rozpu�ci. Trzymaj�c patelni� na ogniu doda� stopniowo kilka �y�ek kapusty ca�y czas mieszaj�c. Prze�o�y� zawarto�� patelni z powrotem do garnka, wymiesza� i zagotowa�.


