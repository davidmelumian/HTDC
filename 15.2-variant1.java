class Date {
    int day;
    int month;
    int year;
    Date(int day, int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    // is this date in the given month and year?
    boolean sameMonthAndYear(int month, int year){
        return  (this.month==month)&&(this.year==year);
    }
}
class Entry {
    Date d;
    double distance;
    int duration;
    String comment;
    Entry ( Date d,double distance,int duration, String comment){
        this.d=d;
        this.distance=distance;
        this.duration=duration;
        this.comment=comment;
    }
    // was this entry made in the given month and year?
    boolean sameMonthAndYear (int month,int year) {
        return this.d.sameMonthAndYear(month,year);
    }}

interface ILog {
    //to compute the total number of miles recorded in this log
    double miles ();
    // to extract those entries in this log for the given month and year
    ILog oneMonth (int month, int year);

}
class  Empty implements  ILog{
    Empty (){}
    double miles(){
        return 0;
    }
    ILog oneMonth (int m,int y) {
        return  new Empty();
    }
   
}

class Cons implements ILog{
    Entry fst;
    ILog rst;
    Cons (Entry fst, ILog rst){
        this.fst=fst;
        this.rst=rst;
    }
    double miles (){
        return  this.fst.distance+this.rst.miles();
    }
    ILog oneMonth (int m,int y){
        if (this.fst.sameMonthAndYear(m,y)) {
            return  new Cons (this.fst,this.rst.oneMonth(m,y));}
        else {
            return  this.rst.oneMonth(m,y);
        }
    }
   

}

class Examples {
    Date d1= new Date(5,6,2003);
    Date d2= new Date(6,6,2003);
    Date d3= new Date(23,6,2003);
    Entry e1 = new Entry(new Date(5,6,2003), 5.0,25,"feeling good");
    Entry e2 = new Entry(new Date(6,6,2003),3.0,24,"feeling tired");
    Entry e3 = new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted");
    ILog i1 = new Empty();
    ILog i2 = new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty());

    ILog i3 = new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired"),
            new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty()));

    ILog i4 =new Cons(new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted"),
            new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired"),
                    new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty())));
    Examples (){}
}
/*new Cons(new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted"),
            new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired"),
                    new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), 
  new Empty()))).oneMonth (6,2003).miles () 
  /*
  