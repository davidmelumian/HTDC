class Item {
    int weight;
    int price;
    String quality;
    Item(int w,int p,String q) { this.weight = w;
        this.price = p;
        this.quality = q;
    }
    Item(int w,int p) { this.weight = w;
        this.price = p;
        this.quality = "standard";
    }
    Item(int p,String q) { this.weight = 0;
        this.price = p;
        this.quality = q;
    }
    String asString (){
        return String.valueOf(weight).concat(" ").concat(String.valueOf(price)).concat(" ").concat(String.valueOf(quality));
    }
}

/*class Select { . . . new Item(w,p,q) . . . }
it uses 3 arguments,therefore it invokes the first constructor
 */
/* class Presentation { int p;
. . .
boolean draw(String s) { . . . new Item(p,s) . . .
}. . .
}
it uses 2 arguments,which are price (p) and String (s), therefore it invokes the third constructor
 */

/* class Factory { . . .
int inquireInt(String s) { . . . }
Item create(. . . ) { . . . new Item(
inquireInt("pounds"),
inquireInt("cents")) . . .
}. . .
}
it uses 2 arguments, which method is int, therefore it invokes the second constructor
 */
