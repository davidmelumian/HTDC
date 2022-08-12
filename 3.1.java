class REA {
String type;
Room   r;
int p;
Adress a;

REA (String type, Room r, int p, Adress a) {
this.type = type;
this.r = r;
this.p = p;
this.a = a;
}}

class Room {
int n;
String ROOMS = "rooms";

Room (int n){
this.n = n;
}}

class Adress {
int b;
String st;
String c;

Adress (int b, String st, String c){
this.b = b;
this.st = st;
this.c = c;
}}

class REAexp {
Room r1 = new Room (7);
Room r2 = new Room (9);
Room r3 = new Room (6);
Adress a1 = new Adress (83, "Maple Street", "Brookline");
Adress a2 = new Adress (5, "Joye  Road","Newton");
Adress a3 = new Adress (6, "Winslow Road","Waltham");
REA  rea1 = new REA ("Ranch",this.r1,375000,this.a1);
REA  rea2 = new REA ("Colonial",this.r2,450000,this.a2);
REA  rea3 = new REA ("Cape", this.r3, 235000, this.a3);
REAexp () {}
}



             
