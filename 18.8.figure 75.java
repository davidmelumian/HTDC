abstract  class ARecording {
    int high;
    int today;
    int low;
    ARecording (int high, int today, int low){
        this.high=high;
        this.today=today;
        this.low=low;
    }
    int dHigh (){
        return this.high - this.today;
    }
    int dLow (){
        return  this.today - this.low;
    }
    String asString(){
        return String.valueOf(low)
                .concat("-")
                .concat(String.valueOf(high))
                .concat(this.unit());
    }
    abstract String unit ();
}

class Pressure extends  ARecording{
    Pressure (int high, int today, int low){
        super (high,today,low);
    }
    String unit(){
        return  "hPa";
    }
}

abstract class ATemperature extends  ARecording{
    ATemperature (int high, int today,int low){
        super (high,today,low);
    }
    String unit (){
        return  "degrees".concat(this.name());
    }
    abstract String name ();
}

class Precipitation extends  ARecording {
    Precipitation(int high, int today) {
        super(high, today, 0);
    }
    String asString (){
        return "up to".concat(String.valueOf(high)).concat(this.unit());
    }
    String unit() {
        return "mm";
    }
}

interface Temperature {}
class Celcius extends ATemperature implements  Temperature{
    Celcius (int high, int today, int low){
        super (high,today,low);
    }
    String name () {
        return  "Celcius";
    }
}

class Fahrenheit extends  ATemperature implements  Temperature{
    Fahrenheit (int high, int today, int low){
        super (high,today,low);
    }
    String name (){
        return  "Fahrenheit";
    }
}

