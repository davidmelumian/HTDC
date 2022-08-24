// the daily percipitation of three consecutive days
    class Preciption {
        int day1;
        int day2;
        int day3;
        Preciption (int day1, int day2,int day3){
            this.day1=day1;
            this.day2=day2;
            this.day3=day3;
        }
        // how much did it rain during these three days??
        int cumulative (){
            return this.day1+this.day2+this.day3;}
        int average (){
            return this.cumulative()/3;}//for the given definition of the class, there is no way, to define a method,
        //that counts the number of fields. It is only available, if we represent int as list or array
    }