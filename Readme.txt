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
/message/id wiadomoœci z pokoju o id
/message/add dodanie wiadomoœci 
itp. 

=> Dzia³a rejestracja, logowanie, wiadomoœci i pokoje.

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
- w wiadomoœci minimum 1 znak
tylko po spe³nieniu tych warunków fronted wysy³a ¿¹danie do backendu!
W kodzie mo¿ecia edytowaæ wszystko, dodawaæ, usuwaæ co chcecie, byle by dzia³a³o dobrze.
W Readme te¿ mo¿ecie dodawaæ jakieœ informacje.

W razie pytañ piszcie.



PRZYGOTOWANIE
Miêso pokroiæ w kostkê. Cebulê pokroiæ w kosteczkê i zeszkliæ na oleju w du¿ym garnku. Dodaæ miêso i dok³adnie je obsma¿yæ.
Wlaæ 2 szklanki gor¹cej wody, posoliæ, doprawiæ pieprzem i zagotowaæ. Nastêpnie dodaæ po³amane suszone grzyby, przykryæ, zmniejszyæ ogieñ i gotowaæ przez ok. 45 minut.
Dodaæ listek laurowy, ziela angielskie, kminek, majeranek, powid³a œliwkowe lub posiekane œliwki, obrane i pokrojone w kosteczkê obrane jab³ko i wymieszaæ.
Dodaæ kiszon¹ kapustê (jeœli jest kwaœna nale¿y j¹ wczeœniej wyp³ukaæ na sitku), wlaæ szklankê wody, wymieszaæ, przykryæ i gotowaæ do miêkkoœci kapusty przez ok. 45 minut. Mniej wiêcej w po³owie gotowania dodaæ obran¹ i pokrojon¹ na kawa³eczki kie³basê. Pod koniec dodaæ koncentrat pomidorowy.
M¹kê podsma¿yæ na suchej patelni, gdy zacznie br¹zowieæ dodaæ ³y¿kê mas³a i mieszaæ a¿ mas³o siê rozpuœci. Trzymaj¹c patelniê na ogniu dodaæ stopniowo kilka ³y¿ek kapusty ca³y czas mieszaj¹c. Prze³o¿yæ zawartoœæ patelni z powrotem do garnka, wymieszaæ i zagotowaæ.


