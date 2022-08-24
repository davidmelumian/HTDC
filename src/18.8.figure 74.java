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
            }
        }
        class Precipitation extends  Recording {
          Precipitation(int high,int today) {
              super(high,today,0);
        }
        String asString () {
        return   String.valueOf(low).concat("-").concat(String.valueOf(high));
        }}




