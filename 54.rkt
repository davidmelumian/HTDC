#lang profj/beginner
class BookStore {
    String author ;
    String title;
    double price;
    int year;

    BookStore (String author, String title, double price, int year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }}

class BookExamples {
    BookStore var1= new BookStore ("Daniel Defoe","Robinson Crusoe",15.50,1719);
    BookStore var2= new BookStore ("Joseph Conrad","Heart of Darkness",12.80,1902);
    BookStore var3= new BookStore ("Pat Conroy", "Beach Music", 9.50,1996);
    BookStore var4= new BookStore("Matthias Fellensein","How to Design Programs",0,2018);
    LoBS   l0 = new Empty();
    LoBS l1 = new Cons(this.var1,this.l0);
    LoBS l2 = new Cons(this.var2,this.l1);
    LoBS l3 = new Cons(this.var3,this.l2);
    LoBS l4 = new Cons(this.var4,this.l3);
    BookExamples () {}
}
interface  LoBS {}

class Empty implements LoBS{  
        Empty (){}
}

class Cons implements  LoBS {
    BookStore fst;
    LoBS  rst;
    Cons (BookStore fst, LoBS rst){
        this.fst=fst;
        this.rst=rst;
    }
}