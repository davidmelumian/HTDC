class CartPt {
    int x;
    int y;
    CartPt (int x, int y){
        this.x=x;
        this.y=y;
    }
    // to compute the distance of this project to the origin
    double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    boolean same (CartPt p){
        return this.x==p.x&&this.y==p.y;
    }
    double distancehelper(CartPt p){
    return  Math.sqrt( Math.pow((this.x - p.x),2) + Math.pow ((this.y-p.y),2));
    }
    //create a point that is deltax pixels (up,left) from this
    CartPt translate (int delta){
        return new CartPt(this.x - delta,this.y -delta);
    }
}
interface IShape {
    //to compute the area of this shape
    double area();
    double distance();
    // is the given point within the bounds of this shape?
    boolean in (CartPt p);
    //compute  the bounding box for this shae
    Square bb();
    // compute the perimeter of this shape
    double perimeter();



}
class Dot implements  IShape{
    CartPt loc;
    Dot (CartPt loc){
        this.loc=loc;
    }
    double area (){
        return 0;
    }
    double distance() {
    return this.loc.distance();}
    boolean in(CartPt p){
        return this.loc.same(p);

    }
    Square bb(){
        return new Square(this.loc,1);
    }
    double perimeter() {
        return 0 ;
    }
}

class Square implements  IShape{
    CartPt loc;
    int size;
    Square (CartPt loc, int size) {
        this.loc=loc;
        this.size=size;
    }
    double area (){
        return  this.size*this.size;}
    double distance (){
        return  this.loc.distance();}
    boolean in (CartPt p){
        return  this.between(this.loc.x,p.x,this.size)&& this.between(this.loc.y,p.y,this.size);
    }
    boolean between (int lft,int x, int wdth){
        return lft <=x&&x<=lft+wdth;
    }
    Square bb (){
        return this;
    }
    double perimeter (){
        return  this.size*this.size;
    }
    }




class Circle implements  IShape {
    CartPt loc;
    int radius;

    Circle(CartPt loc, int radius) {
        this.loc = loc;
        this.radius = radius;
    }
    double area (){
        return (Math.PI*this.radius*this.radius);}
    double distance (){
        return this.loc.distance()-this.radius;
    }
    boolean in (CartPt p){
        return this.loc.distancehelper(p)<=this.radius;
    }
    Square bb (){
        return new Square(this.loc.translate (- this.radius),2*this.radius);
    }
    double perimeter (){
        return Math.PI*(this.radius*this.radius);
    }
}