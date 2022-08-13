
class Pebble {
    String color;
    Pebble(String color){
        this.color=color;
    }
}

interface wallet {}

class Empty implements  wallet{
    Empty () {}
}

class Cons implements  wallet {
    Pebble fst;
    wallet rst;
    Cons (Pebble fst, wallet rst){
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
    wallet w0 = new Empty();
    wallet w1 = new Cons(this.p0,this.w0);
    wallet w2 = new Cons(this.p1,this.w1);
    wallet w3 = new Cons(this.p2,this.w2);
    wallet w4 = new Cons(this.p3,this.w3);
    wallet w5 = new Cons(this.p4,this.w4);
    Examples () {}
    
}