   class Date {
        int day;
        int month;
        int year;
        Date (int day,int month,int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }
    }
        class Entry {
            Date d;
            double distance;//in miles
            int duration;// in minutes
            String comment;

            Entry(Date d, double distance, int duration, String comment) {
                this.d = d;
                this.distance = distance;
                this.duration = duration;
                this.comment = comment;
            }

            // Entry -> Number
            // computes the pace.
            //(floor (/ t d)) (floor (* (- (/ t d) (floor (/ t d))) 60))))
            // (floor (* (- (/ t d) (floor (/ t d))) 60))))
            Pace getPace() {
                return  new Pace((Math.round(Math.floor(this.duration / this.distance))),
                        (Math.round(Math.floor(((this.duration / this.distance) - (Math.floor(this.duration / this.distance))) * 60))));

            }
        }

        class Pace {
            long  minutes;
            long seconds;

            Pace(long minutes, long seconds) {
                this.minutes = minutes;
                this.seconds = seconds;
            }
        }