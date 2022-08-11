#lang profj/beginner
class Time {
    int hour;
    int minute;
    Time (int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
}
class Departure{
    String station;
    Time  d;
    Departure (String station, Time d){
        this.station=station;
        this.d= d;
    }
}

class  Arrival {
    String station;
    Time d;

    Arrival(String station, Time d) {
        this.station = station;
        this.d = d;

    }
}


class Stop {
    String stop;
    Stop (String stop){
        this.stop=stop;
    }
}
interface LStop {}

class  Empty implements  LStop {
        Empty() {}
}


class  Cons implements  LStop {
    Stop fst;
    LStop rst;
    Cons (Stop fst, LStop rst){
        this.fst = fst;
        this.rst = rst;
    }
}

class Schedule {
    Departure d;
    Arrival a;
    LStop s;
    Schedule (Departure d, Arrival a, LStop s){
        this.d=d;
        this.a=a;
        this.s=s;
    }
}

class Examples {
    Time t0 = new Time(13,0);
    Time t1 = new Time(22,20);
    Time t2 = new Time(11, 20);
    Time t3 = new Time(14,30);
    Time t4 = new Time(19,30);
    Time t5 = new Time(23,0);

    Departure d0 = new Departure("Teatralna", this.t0);
    Departure d1 = new Departure("Palats Sportu",this.t1);
    Departure d2 = new Departure("Vydubichi",this.t2);
    Arrival   a0 = new Arrival("Olimpiyska",this.t3);
    Arrival   a1 = new Arrival("Libidksya",this.t4);
    Arrival a2 = new Arrival("Druzbi Narodiv",this.t5);
    Stop s0 = new Stop("Poznyaki");
    Stop s1 =new Stop("Slavutich");
    Stop s2 = new Stop("Kharkivska");
    Stop s3 = new Stop("Klovska");
    LStop ls0 = new Empty();
    LStop ls1 = new Cons(this.s0,this.ls0);
    LStop ls2 = new Cons(this.s1,this.ls1);
    LStop ls3 = new Cons(this.s2,this.ls2);
    LStop ls4 = new Cons(this.s3,this.ls3);
    Schedule sc0 = new Schedule(this.d0,this.a0,this.ls0);
    Schedule sc1 = new Schedule(this.d1,this.a1,this.ls1);
    Schedule sc2 = new Schedule(this.d2,this.a2,this.ls4);
    
    Examples () {}
}