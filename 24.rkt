#lang profj/beginner
class Automobile {
String model;
int price;//[in models]
double mileage;// [in miles per galloon]
boolean used;

Automobile (String model, int price, double mileage, boolean used){
this.model = model;
this.price = price;
this.mileage = mileage;
this.used = used;
}}

class Garage {
Automobile ferrari = new Automobile ("Ferrari",60000,1.8,false);
Automobile bugatti = new Automobile ("Buggati",4000,1.8,false);
Automobile mercedes = new Automobile ("Mercedes",2000,1.1,true);
Garage () {}
}


