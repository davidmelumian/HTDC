    class Date {
        int day;
        int month;
        int year;

        Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        boolean daterange1(int day, int month, int year) {
            return (this.day >= day) && (this.month >= month) && (this.year >= year);
        }

        boolean daterange2(int day, int month, int year) {
            return (this.day <= day) && (this.month <= month) && (this.year <= year);
        }
    }
        class Entry {
            Date d;
            double distance;
            int duration;
            String comment;

            Entry(Date d, double distance, int duration, String comment) {
                this.d = d;
                this.distance = distance;
                this.duration = duration;
                this.comment = comment;
            }
            boolean daterange1 (int day,int month,int year){
                return this.d.daterange1(day,month,year);}
            boolean daterange2 (int day,int month,int year) {
                return  this.d.daterange2(day,month,year);}
            boolean smaller (double distance){
                return  this.distance<distance;
            }
        }



        interface  ILog {
            ILog datequery (int d1, int m1, int y1, int d2, int m2, int y2);
            double highest();
            boolean smaller(double distance);
        }
        class Cons implements ILog {
            Entry fst;
            ILog rst;
            Cons (Entry fst, ILog rst){
                this.fst=fst;
                this.rst=rst;
            }
              ILog datequery (int d1, int m1, int y1, int d2, int m2, int y2){
                if (this.fst.daterange1(d1, m1, y1)&&(this.fst.daterange2 (d2, m2, y2))){
                    return  new Cons(this.fst,this.rst.datequery(d1,m1,y1,d2,m2,y2));}
                else { return this.rst.datequery(d1,m1,y1,d2,m2,y2);}
            }
            double highest (){
                if (this.fst.distance<=this.rst.highest()){
                    return this.rst.highest();}
                else { return  this.fst.distance;}
            }
            boolean smaller (double distance){
                return this.fst.smaller(distance);
            }
        }


        class  Empty implements ILog {
            Empty (){}
             ILog datequery(int d1, int m1, int y1, int d2, int m2, int y2){
                return  new Empty();
            }
            double highest (){
                return 0.0;
            }
            boolean smaller (double distance){
              return  true;}

        }

        class Examples {
            Date d1= new Date(5,6,2003);
            Date d2= new Date(6,6,2003);
            Date d3= new Date(23,6,2003);
            Entry e1 = new Entry(new Date(5,6,2003), 5.0,25,"feeling good");
            Entry e2 = new Entry(new Date(6,6,2003),3.0,24,"feeling tired");
            Entry e3 = new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted");
            ILog i1 = new Empty();
            ILog i2 = new Cons(new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty());

            ILog i3 = new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired"),
                    new Cons(new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty()));

            ILog i4 =new Cons(new Entry(new Date(23,6,2003), 26.0,156,"feeling exhausted"),
                    new Cons(new Entry(new Date(6,6,2003),3.0,24,"feeling tired"),
                            new Cons(new Entry(new Date(5,6,2003), 5.0,25,"feeling good"), new Empty())));
            Examples (){}
        }