    class Date {
        int day;// between 1 and 31
        int month; // between 1 and 12
        int year;// equal or greater than 1900

        Date(int day, int month, int year) {
            if (this.valid(day,month,year)) {
                this.day = day;
                this.month = month;
                this.year = year;
            } else {throw new java.lang.Error("this is very bad");
            }
        }
        boolean valid (int day, int month,int year){
         return    (((1<=day&&day<=29)&&(1<=month&&month<=12))|
                 ((30==day)&&(4==month|6==month|9==month|11==month)) |
                 (((31==day)&&(1==month|3==month|5==month|7==month|8==month
                 |10==month|12==month))))&&(1900<=year);
        }
        String asString (){
            return String.valueOf(day).concat(" ").concat(String.valueOf(month)).concat(" ").concat(String.valueOf(year));
        }
    }

