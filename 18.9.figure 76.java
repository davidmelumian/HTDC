    abstract class ARecording {
        int high;
        int today;
        int low;
        ARecording(int high,int today,int low) {
            this.high = high;
            this.today = today;
            this.low = low;
        }
        int dHigh() {return  this.high-this.today; }
        int dLow() {return  this.today-this.low;}
        String asString() {
            return
                    String.valueOf(high).concat("-").concat(String.valueOf(low)).concat(this.unit());
        }
        abstract String unit();
    }
        class Temperature extends ARecording {
            Temperature(int high,int today,int low) {
                super(high,today,low);
            }
            String unit() {
                return "F";
            }
        }
        class Pressure extends ARecording {
            Pressure(int high,int today,int low) {
                super(high,today,low);
            }
            String unit() {
                return "hPa";
            }
        }

        class  Wind extends  ARecording {
            String direction;

            Wind(int high, int today, int low, String direction) {
                super(high, today, low);
                this.direction = direction;
            }

            String unit() {
                return "mph ";
            }

            String asString() {
                return String.valueOf(today).concat("/").concat(this.unit()).concat(this.direction);
            }
        }