#lang profj/beginner

class TemperatureRange {
int high;
int low;

TemperatureRange (int high, int low) {
this.high = high;
this.low = low;
}}

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

WeatherRecord (Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record){
this.d = d;
this.today = today;
this.normal = normal;
this.record = record;
}}


class exp {
Date d1 = new Date (15,5,1997);
Date d2 = new Date (12,11,2011);
Date d3 = new Date (8,8,2022);
TemperatureRange t1 = new TemperatureRange (10,15);
TemperatureRange t2 = new TemperatureRange (5,10);
TemperatureRange t3 = new TemperatureRange (25,30);
WeatherRecord w1 = new WeatherRecord (this.d1,this.t2,this.t1,this.t3);
exp () {}
}