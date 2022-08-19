class Date {
    int day;
    int month;
    int year;
    Date(int day, int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

}
class Entry {
    Date d;
    double distance;
    int duration;
    String comment;
    double pace;

    Entry(Date d, double distance, int duration, String comment,double pace) {
        this.d = d;
        this.distance = distance;
        this.duration = duration;
        this.comment = comment;
        this.pace=pace;
    }
    double getPace() {
        return  (Math.floor(this.duration/this.distance))+
                (((Math.round(Math.floor(((this.duration / this.distance) - (Math.floor(this.duration / this.distance))) * 60))))/100F);
}}

interface ILog {
//sorts the given list of entries
    ILog sort ();
// adds an Entry to the given list of entries.
    ILog add (Entry e);
//  computes the pace, and creates a new instance of entry by substitute
    ILog addpace();

}
class  Empty implements  ILog{
    Empty (){}
    //returns an empty list with an entry
    ILog add (Entry e) {
    return new Cons(e,this);}
    ILog sort (){
        return  this;
    }
    ILog addpace (){
        return this;
    }
}

class Cons implements ILog{
    Entry fst;
    ILog rst;
    Cons (Entry fst, ILog rst){
        this.fst=fst;
        this.rst=rst;
    }
    ILog add (Entry e) {
        if (e.pace>=this.fst.pace){
            return new Cons(e,this);}
            else { return  new Cons(this.fst,this.rst.add(e));
        }
    }
    ILog sort (){
        return this.rst.sort().add(this.fst);
    }
    ILog addpace (){
    return  new Cons(new Entry(this.fst.d,this.fst.distance,this.fst.duration,this.fst.comment,(this.fst.getPace())),this.rst.addpace());
}
    }

class Examples {
    Date d1= new Date(5,6,2003);
    Date d2= new Date(6,6,2003);
    Date d3= new Date(23,6,2003);
    Entry e1 = new Entry(new Date(5,6,2003), 5.0,25,"feeling good",0.0);
    Entry e2 = new Entry(new Date(6,6,2003),3.0,24,"feeling tired",0.0);
    Entry e3 = new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted",0.0);
    ILog i1 = new Empty();
    ILog i2 = new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good",0.0), new Empty());

    ILog i3 = new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired",0.0),
            new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good",0.0), new Empty()));

    ILog i4 =new Cons(new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted",0.0),
            new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired",0.0),
                    new Cons (new Entry(new Date(5,6,2003), 5.0,25,"feeling good",0.0), new Empty())));
    Examples (){}
}



