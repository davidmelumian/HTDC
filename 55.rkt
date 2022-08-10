#lang profj/beginner
class Date {
int day;
int month;
int year;
Date (int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;

}
}

class TemperatureRange {
    int high;
    int low;

    TemperatureRange(int high, int low) {
        this.high= high;
        this.low = low;
    }
}


class WeatherRecord {
    Date d;
    TemperatureRange today;
    TemperatureRange normal;
    TemperatureRange record;
    WeatherRecord (Date d, TemperatureRange today, TemperatureRange normal,TemperatureRange record){
            this.d = d;                                                                                        
            this.today= today;
            this.normal= normal;
            this.record= record ;}
}

interface  IWR {}

class MTWR implements IWR {
    MTWR () {}
}

class ConsWR implements  IWR {

     WeatherRecord fst;
     IWR  rst;
     ConsWR (WeatherRecord fst, IWR rst){
         this.fst = fst;
         this.rst = rst;
     }
}

class  Examples {
    Date d1 = new Date(15,5,1997);
    Date d2 = new Date(12,11,2011);
    Date d3 = new Date(8,8,2022);
    TemperatureRange t1 = new TemperatureRange(15,10);
    TemperatureRange t2 = new TemperatureRange(10,5);
    TemperatureRange t3 = new TemperatureRange(30, 25);
    TemperatureRange t4 = new TemperatureRange(4, -2);
    TemperatureRange t5 = new TemperatureRange(10, 5);
    TemperatureRange t6 = new TemperatureRange(17,15);
    WeatherRecord w1 = new WeatherRecord(this.d1,this.t1,this.t2,this.t3);
    WeatherRecord w2 = new WeatherRecord(this.d2,this.t1,this.t2,this.t3);
    WeatherRecord w3 = new WeatherRecord(this.d3,this.t4,this.t5,this.t6);
    IWR i1 = new MTWR();
    IWR i2 = new ConsWR(this.w1,this.i1);
    IWR i3 = new ConsWR(this.w2,this.i2);
    IWR i4 = new ConsWR(this.w3,this.i3);
    Examples () {}
}