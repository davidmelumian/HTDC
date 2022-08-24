
interface Assist {}

class Place {
    String street;
    int number;
    Place (String street, int number){
        this.street=street;
        this.number=number;
    }
}

class  Restaurant implements Assist{
    String name;
    String kind;
    String pricing;
    Place p;
    Restaurant (String name,String kind,String  pricing,Place p){
        this.name=name;
        this.kind=kind;
        this.pricing=pricing;
        this.p=p;
    }
}
class Hours {
    int opening;
    int closing;
    Hours (int opening, int closing){
        this.opening=opening;
        this.closing = closing;
    }
}

class Museum implements  Assist{
    String name;
    int price;
    Hours  h;
    Place p;
    Museum (String name,int price, Hours h,Place p){
        this.name=name;
        this.price=price;
        this.h=h;
        this.p=p;

    }
}

class Shops implements  Assist {
    String name;
    String kind;
    Hours h;
    Place p;
    Shops (String name, String kind,Hours h, Place p) {
        this.name = name;
        this.kind = kind;
        this.h = h;
        this.p = p;
    }
}

class Examples {
    Place p0 = new Place("Velika Vailkivskya",3);
    Place p1 =new Place( "Istoricna",4);
    Place p2 =new Place("Insitutska",5);
    Hours h0 = new Hours(9,17);
    Assist r0 = new Restaurant("Kaif","French","expensive",this.p0);
    Assist m0 = new Museum("JetBrains",10,this.h0, this.p1);
    Assist s0 = new Shops("Galicina","Weapons",this.h0,this.p2);
    Examples () {}
}
