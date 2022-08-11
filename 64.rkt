#lang profj/beginner

class Room {
    int n;
    String ROOMS = "rooms";

    Room (int n){
        this.n = n;
    }}

class Adress {
    int b;
    String street;
    String city;

    Adress (int b, String st, String c){
        this.b = b;
        this.street = st;
        this.city = c;
    }}

class Property {
    Adress a;
    int area;
    int price;

    Property(Adress a, int area, int price) {
        this.a = a;
        this.area = area;
        this.price = price;
    }
}

interface  IREA {}


class Empty implements IREA {
    Empty () {}
}

class Cons implements   IREA {
    REA fst;
    IREA rst;
    Cons (REA fst, IREA rst){
    this.fst = fst;
    this.rst = rst;

}

}

interface  REA {}
class FamilyHouse implements  REA{
    Property p;
    Room r;
    int area;

    FamilyHouse (Property p,Room r,int area ){
        this.p=p;
        this.r=r;
        this.area= area;
    }
}

class Condominium implements  REA{
    Property p;
    Room r;
    boolean access;

    Condominium (Property p, Room r,boolean access ){
        this.p=p;
        this.r= r;
        this.access= access;

    }

}

class Town implements  REA{
    Property p;
    Room r;
    int area;
    Town (Property p,Room r, int area){
        this.p=p;
        this.r=r;
        this.area=area;
    }
}

class REAexp {
    Room r1 = new Room (7);
    Room r2 = new Room (2);
    Room r3 = new Room (4);
    Adress a1 = new Adress (83, "Maple Street", "Brookline");
    Adress a2 = new Adress (5, "Joye  Road","Newton");
    Adress a3 = new Adress (6, "Winslow Road","Waltham");
    Property p1 = new Property(this.a1,50,450000);
    Property p2 = new Property(this.a2,25,250000);
    Property p3 = new Property(this.a3, 100,1000000);
    REA re1 = new FamilyHouse(this.p1,this.r3,100);
    REA re2 = new Condominium(this.p2,this.r2,true);
    REA re3 = new Town(this.p3,this.r1,40);
    IREA ir1 = new Empty();
    IREA ir2 = new Cons(this.re1,this.ir1);
    IREA ir3 = new Cons(this.re2,this.ir2);
    IREA ir4 = new Cons(this.re3,this.ir3);
    REAexp () {}
    }