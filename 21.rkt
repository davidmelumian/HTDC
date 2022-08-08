#lang profj/beginner
class GPSLocation {
double latitude;
double longtitude;

GPSLocation (double latitude, double longtitude){
this.latitude = latitude;
this.longtitude = longtitude;
}}

class GPSExamples {
GPSLocation  var1 =  new GPSLocation  (33.5,86.8);
GPSLocation  var2 =  new GPSLocation  (40.2,72.4);
GPSLocation  var3 = new GPSLocation (49.0,110.3);
GPSExamples () {}
}





