interface BookStore {
    BookStore thisAuthor(Author a);}


interface Authors {
boolean same (Author a);}

class Author {
    String name;
    String surname;
    Author (String name,String surname){
        this.name=name;
        this.surname=surname;
    }
}

class ConsAuthor implements  Authors {
    Author fst;
    Authors rst;
    
    ConsAuthor(Author fst, Authors rst){
        this.fst=fst;
        this.rst=rst;
    }
    boolean same (Author a){
        return this.fst.name.equals(a.name)&&this.fst.surname.equals(a.surname);
    }
    
}

class EmptyAuthor implements  Authors{
    EmptyAuthor (){}
    boolean same (Author a){
        return false;
    }
}

class Record {
    String title;
    Authors a;
    int price ;
    int year;
    Record (String title, Authors  a, int price, int year ) {
        this.title=title;
        this.a=a;
        this.price=price;
        this.year=year;
    }
}

class Cons implements BookStore{
    Record fst;
    BookStore rst;
    Cons (Record fst,BookStore rst){
        this.fst=fst;
        this.rst=rst;

    }
    BookStore thisAuthor (Author a){
        if (this.fst.a.same(a)){
            return  new Cons(this.fst,this.rst.thisAuthor(a));}
            else {return  this.rst.thisAuthor(a);
            }
        }
    }
    




class Empty implements  BookStore {
    Empty() {
    }
    BookStore thisAuthor (Author a){
        return new Empty();
    }
}

/* new Cons (new Record ("How to Design Programs",new ConsAuthor(new Author("Matthias","Fellensein"),
                new ConsAuthor(new Author("Matthew","Flatt"),new EmptyAuthor())),0,2018),
                new Cons (new Record("How to Design Classes",new ConsAuthor(new Author("Matthias","Fellensein"),
                        new ConsAuthor(new Author("Matthew","Flatt"),new EmptyAuthor())),0,2018),
                        new  Cons (new Record ("Harry Potter and the Philosopher's Stone",new ConsAuthor(new Author("J.K","ROWING"),
                                new EmptyAuthor()),0,2018),new Empty()))).thisAuthor(new Author("J.K","ROWING")) */