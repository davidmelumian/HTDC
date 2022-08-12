
class ClockTime {
    int hour;
    int minute;
    ClockTime (int hour, int minute) {
        this.hour= hour;
        this.minute=minute ;
    }
}

class  Schedule {
    ClockTime departure;
    ClockTime arrival;
    Schedule (ClockTime departure, ClockTime arrival){
        this.departure = departure;
        this.arrival = arrival;
    }
}

class Route {
    String origin;
    String destination;
    Route (String origin, String destination) {
        this.origin = origin;
        this.destination = destination;

    }
}

class Local {
    boolean value;
    Local (boolean value){
        this.value=value;
    }
}
class  Express {
    boolean value;
    Express (boolean value){
        this.value =value;
    }
}

class  Train {
    Route r;
    Schedule s;
    Local b;
    Train (Route r, Schedule s, Local b){
        this.r = r;
        this.s = s;
        this.b = b;
    }
}
class  Train2 {
    Route r;
    Schedule s;
    Express b;
    Train2 (Route r, Schedule s, Express b){
        this.r = r;
        this.s = s;
        this.b = b;
    }
}

class Examples {
    ClockTime c1 = new ClockTime(10,5);
    ClockTime c2 = new ClockTime(19,20);
    ClockTime c3 = new ClockTime(6,30);
    ClockTime c4 = new ClockTime(13,37);
    ClockTime c5 = new ClockTime(22,30);
    ClockTime c6 = new ClockTime(4,10);
    Schedule  s1 = new Schedule(this.c1,this.c2);
    Schedule  s2 = new Schedule(this.c3,this.c4);
    Schedule  s3 = new Schedule(this.c5, this.c6);
    Route  r1 = new Route("Kyiv", "Kharkiv");
    Route  r2 = new Route("Odessa","Dnipro");
    Route  r3 = new Route("Kherson", "Moscow");
    Local l1 = new Local(false);
    Express e1 = new Express(true);
    Train t1 = new Train(this.r1,this.s1,this.l1);
    Train2 t2 = new Train2(this.r2,this.s2,this.e1);
    Train  t3 = new Train(this.r3,this.s3,this.l1);
Examples () {}}