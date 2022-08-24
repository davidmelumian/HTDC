    class Date {
        int day;
        int month;
        int year;
        Date (int day,int month,int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        boolean earlierThan (Date that){
            return (this.year>that.year)||(this.year==that.year)&& (this.month>that.month)||(this.month==that.month)
                &&(this.day>that.day);
        }
    }