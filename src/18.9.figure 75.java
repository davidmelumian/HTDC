    class Recording {
        int high;
        int today;
        int low;
        String unit;
        Recording(int high,int today,int low,String unit) {
            this.high = high;
            this.today = today;
            this.low = low;
            this.unit = unit;
        }
        int dHigh() {
            return  this.high-this.today;
        }
        int dLow() {
            return  this.low-this.today;
        }
        String asString() {
            return
                    String.valueOf(high).concat("-").concat(String.valueOf(low)).concat(this.unit);
        }
    }
        class Pressure extends Recording {
            Pressure(int high,int today,int low) {
                super(high,today,low,"mm");
            }
        }
        class Temperature extends Recording {
            Temperature(int high,int today,int low) {
                super(high,today,low,"F");
            }
        }
        class  Wind extends  Recording {
            String direction;
            Wind(int high, int today, int low, String direction) {
                super(high, today, low,"mph ");
                this.direction = direction;
            }
            String asString (){
             return  String.valueOf(today).concat("/").concat(this.unit).concat(this.direction);

            }}