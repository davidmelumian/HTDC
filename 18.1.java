
class ClockTime {
    int hour;
    int minute;
    ClockTime (int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }
}

class Schedule {
    ClockTime departure;
    ClockTime arrival;
    Schedule(ClockTime departure,ClockTime arrival){
        this.departure=departure;
        this.arrival=arrival;
    }
}

class Route {
    String origin;
    String destination;
    Route (String origin,String destination){
        this.origin=origin;
        this.destination=destination;
    }
}



class Train {
    Schedule s;
    Route r;
    Train (Schedule s,Route r){
        this.s=s;
        this.r=r;
    }
}


interface  Stops{}


class Cons implements  Stops{
    String fst;
    Stops rst;
    Cons (String fst, Stops rst){
        this.fst=fst;
        this.rst=rst;
    }
}

class Empty implements  Stops {
    Empty (){}
}

class ExpressTrain extends Train {
    Stops st;
    String name;
    ExpressTrain (Schedule s,Route r, Stops st, String name){
        super (s,r);
        this.st=st;
        this.name=name;
    }
}
 
class Place {
    String street;
    int house;
    Place (String street,int house){
        this.street=street;
        this.house=house;
    }
}



class Restaurant {
    String name;
    String price;
    Place place;

    Restaurant(String name, String price, Place place) {
        this.name = name;
        this.price = price;
        this.place = place;
    }
}

class ChineseRestaurant  extends  Restaurant{
   boolean UsesMSG;
   ChineseRestaurant( String name,String price, Place p,boolean UsesMSG) {
       super (name,price,p);
       this.UsesMSG=UsesMSG;
    }
}



class Vehicle {
    int mileage;
    int price;
    Vehicle (int mileage,int price){
        this.mileage=mileage;
        this.price=price;
    }
}

class Sedan extends  Vehicle {
    Sedan(int mileage, int price){
        super (mileage, price);
    }
}

/*new ExpressTrain(new Schedule(new ClockTime(20, 20), new ClockTime(30, 30)), new Route("Kyiv", "Odessa"),
        new Cons("Kharkiv",new Cons("Mykolaiv",new Empty())),"Intercity")

new ChineseRestaurant("Four Dragons","expensive",new Place("wutang",23),false)
new Sedan(45000,20000)*/



