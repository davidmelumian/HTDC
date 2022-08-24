    class Recording {
        int high;
        int today;
        int low;
        Recording(int high,int today,int low) {
            this.high = high;
            this.today = today;
            this.low = low;
        }
        int dHigh() {
            return this.high-this.today;
        }
        int dLow() {
            return this.today-this.low;
        }
        String asString() {
            return
                    String.valueOf(high).concat("-").concat(String.valueOf(low));
        }
    }
        class Pressure extends Recording {
            Pressure(int high,int today,int low) {
                super(high,today,low);
            }
            String asString() {
                return super.asString()
                        .concat("mm");
            }
        }
        class Temperature extends Recording {
            Temperature(int high,int today,int low) {
                super(high,today,low);
            }
            String asString() {
                return super.asString()
                        .concat("F");
            }}

    class  Wind extends  Recording {
        String direction;

        Wind(int high, int today, int low, String direction) {
            super(high, today, low);
            this.direction = direction;
        }
        String asString (){
        return String.valueOf(today).concat("/").concat("mph  ").concat(String.valueOf(direction));
    }}
    