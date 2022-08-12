

// a runner's log
interface ILog {}

// the empty log
class MTLog implements  ILog {
    MTLog(){}
}

//adding an entry to a log
class ConsLog implements  ILog {
    Entry fst;
    ILog rst;
    ConsLog (Entry fst, ILog rst){
        this.fst=fst;
        this.rst= rst;
    }


}
class Date {
    int day;
    int month;
    int year;

    Date (int day, int month , int year) {
        this.day= day;
        this.month=month;
        this.year=year;
    }
}

class Entry {
    Date d;
    double distance;//in miles
    int duration;// in minutes
    String comment;
    Entry (Date d, double distance,int duration, String comment){
        this.d=d;
        this.distance=distance;
        this.duration=duration;
        this.comment=comment;
    }
}

class Examples{
    Date d1 = new Date(5, 6,2003);
    Date d2 = new Date(6,6,2003);
    Date d3 = new Date(23,6,2003);
    Entry e1 = new Entry(this.d1,5.3,27, "feeling good");
    Entry e2 = new Entry(this.d2,2.8,24,"feeling tired");
    Entry e3 = new Entry(this.d3,26.2,150,"feeling exhausted");

    ILog i1 = new MTLog();
    ILog i2 = new ConsLog(this.e1,this.i1);
    ILog i3 = new ConsLog(this.e2,this.i2);
    ILog i4 = new ConsLog(this.e3,this.i3);
    Ilog i5 = new ConsLog(this.e3,this.i1);
    Ilog i6 = new ConsLog(this.e3,this.i2);
    Examples () {}
}

// (Ilog i1 = ())
// (Ilog I2 = (Entry (Date 05,06,2003) 5.3 miles, 27 minutes, "feeling good") ();
// (Ilog I3 = (Entry (Date 06,06,2003) 2.8 miles, 24 minutes, "feeling tired") I2)
// (Ilog i4 = (Entry (Date 23,06,2003) 26.2 miles, 150 minutes, "feeling exhausted") I3)
// (Ilog i5 = (Entry (Date 23,06,2003) 26.2 miles, 150 minutes, "feeling exhausted"),I1)
// (Ilog i6 = (Entry (Date 23,06,2003) 26.2 miles, 150 minutes, "feeling exhausted"),I2)