
    class TemperatureRange {
        int high;
        int low;

        TemperatureRange (int high, int low) {
            this.high = high;
            this.low = low;
        }
        boolean comparemain (TemperatureRange ga){
            return this.high <= ga.high && this.low<= ga.low;
        }
        boolean comparealt (TemperatureRange tp) {
            return this.high > tp.high || this.low>tp.low;
        }
    }

        class Date {
            int day;
            int month;
            int year;

            Date (int day, int month, int year){
                this.day = day;
                this.month = month;
                this.year = year;}}


        class WeatherRecord {
            Date d;
            TemperatureRange today;
            TemperatureRange normal;
            TemperatureRange record;
            double precipitation;

            WeatherRecord (Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation){
                this.d = d;
                this.today = today;
                this.normal = normal;
                this.record = record;
                this.precipitation = precipitation;
            }
            boolean withinRange (){
                return this.today.comparemain(this.normal);
            }
            boolean rainyDay (double n) {
                return this.precipitation>n;
            }
            boolean recordDay (){
                return  this.today.comparealt(this.record);
            }
        }