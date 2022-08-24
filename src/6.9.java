
class Pebble {
    String color;
    Pebble(String color){
        this.color=color;
    }
}

class cardcolor {
    Pebble a;
    Pebble b;
    Pebble c;
    Pebble d;
    Pebble e;
    cardcolor (Pebble a, Pebble b, Pebble c, Pebble d , Pebble e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }
}
interface  Card{}

class normal implements  Card {
    String NORMAL = "normal";
    cardcolor c ;
    normal (cardcolor c){
        this.c=c;
    }
}

class high implements  Card{
    String HIGH = "High";
    cardcolor c ;
    high (cardcolor c){
        this.c=c;
    }
}

class ssuper implements  Card {
    String SUPER = "super";
    cardcolor c ;
    ssuper (cardcolor c) {
        this.c = c;
    }
}

interface  test {}

class Empty implements  test {
    Empty (){}
}

class Cons implements  test {
    Card fst;
    test rst;
    Cons (Card fst, test rst){
        this.fst=fst;
        this.rst=rst;
    }
            
}

class Examples {
    Pebble p0 = new Pebble("red");
    Pebble p1 = new Pebble("blue");
    Pebble p2 = new Pebble("green");
    Pebble p3 = new Pebble("yellow");
    Pebble p4 = new Pebble("orange");
    Pebble p5 =new Pebble( "black");
    Pebble p6 = new Pebble( "white");
    Pebble p7 = new Pebble( "magenta");
    Pebble p8 = new Pebble( "darkgreen");
    Pebble p9 = new Pebble( "Azure");
    cardcolor c = new cardcolor(this.p0, this.p1, this.p2, this.p3, this.p4);
    cardcolor ca = new cardcolor(this.p5,this.p6,this.p7,this.p8,this.p9);
    Card c0 = new normal(this.c);
    Card c1 = new normal(this.ca);
    test t = new Empty() ;
    test t1 = new Cons(this.c1,this.t);
    test t2 = new Cons(this.c0,this.t);
    Examples() {}
}