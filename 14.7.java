class About {
    String name;
    double weight; // in grams
    int price; // in cents per gram.
   About (String name, double weight, int price){
   this.name=name;
   this.weight=weight;
   this.price=price;}
}

interface  Item {
    double unitPrice();
    boolean lowerUnitPrice (double d);
    boolean cheaperThan (Item i);

}

class Icecream implements  Item {
    About a;
    String flavor;
    Icecream (About a, String flavor) {
        this.a=a;
        this.flavor=flavor;
    }
    double unitPrice (){
        return this.a.price*this.a.weight;
    }
    boolean lowerUnitPrice(double p) {
        return  this.unitPrice()<p;
    }
    boolean cheaperThan (Item a) {
        return  this.unitPrice()<a.unitPrice();
    }
}
class Coffee implements  Item {
    About a;
    String label;
    Coffee (About a, String label){
        this.a=a;
        this.label=label;
    }
    double unitPrice (){
        return this.a.price*this.a.weight;
    }
    boolean lowerUnitPrice(double p) {
        return  this.unitPrice()<p;
    }
    boolean cheaperThan (Item a) {
        return  this.unitPrice()<a.unitPrice();
    }
    
}

class Juice implements  Item{
    About a;
    String flavor;
    String pack;
    Juice (About a, String flavor, String pack){
        this.a=a;
        this.flavor=flavor;
        this.pack=pack;
    }
    double unitPrice (){
        return this.a.price*this.a.weight;
    }
    boolean lowerUnitPrice(double p) {
        return  this.unitPrice()<p;
    }
    boolean cheaperThan (Item a) {
        return  this.unitPrice()<a.unitPrice();
    }
}