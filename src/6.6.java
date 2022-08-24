
class Item {
    int catalog;
    String title;
    Item (int catalog,String title){
        this.catalog = catalog;
        this.title = title;
    }
}

interface  checkout {}
class Book implements  checkout {
    Item i;
    String author;
    int release;
    Book (Item i, String author, int release){
        this.i=i;
        this.author=author;
        this.release= release;
    }

}

class CD implements  checkout {
    Item i;
    String artist;
    int tracknumbers;
    CD (Item i,String artist, int tracknumbers){
        this.i=i;
        this.artist=artist;
        this.tracknumbers= tracknumbers;
    }
}

class DVD implements  checkout{
    Item i;
    String type;
    int length;
    DVD (Item i, String type,int length){
        this.i=i;
        this.type=type;
        this.length=length;
    }
}

interface  Library {}

class Empty implements  Library {
    Empty (){}
}

class Cons implements  Library{
    checkout fst;
    Library rst;
    Cons (checkout fst, Library rst) {
        this.fst= fst;
        this.rst= rst;
    }
}

class Examples {
    Item i0 = new Item(0,"How to Design Programs");
    checkout c0 = new Book(this.i0,"Matthias Fellensein",2018);
    Item i1 = new Item(1,"Meteora");
    checkout c1 = new CD(this.i1,"Linkin Park",14);
    Item i2 = new Item(2,"F.R.I.E.N.D.S");
    checkout c2 = new DVD(this.i2,"Comedy",30000);
    Library l0 = new Empty();
    Library l1 = new Cons(this.c0,this.l0);
    Library l2 = new Cons(this.c1,this.l1);
    Library l3 = new Cons(this.c2,this.l2);
    Examples(){}
}