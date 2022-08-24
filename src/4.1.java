
//Cartesian points on a computer monitor
class CartPt {
int x;
int y;

CartPt (int x, int y){
this.x = x;
this.y = y;
}}

//a dot shape
class Dot 
implements IShape {
CartPt loc;
Dot(CartPt loc) {
this.loc = loc;}}                 

//a square shape
class Square
implements IShape{
CartPt loc;
int size;
Square(CartPt loc, int size){
this.loc = loc;
this.size = size;}}

//a circle shape
class Circle 
implements IShape {
CartPt loc;
int radius;

Circle (CartPt loc, int radius) {
this.loc = loc ;
this.radius = radius ;
}}

// geometric shapes
interface IShape {}

class Examples {
CartPt d1 = new CartPt (20,50);
CartPt d2 = new CartPt (0,0);
CartPt d3 = new CartPt (100,200);
CartPt d4 = new CartPt (-3, 4);
CartPt d5 = new CartPt (12,5);
CartPt d6 = new CartPt (30,-60);

IShape s = new Square (this.d1,30);
IShape c = new Circle (this.d2,20);
IShape d = new Dot (this.d3);
IShape g0 = new Dot (this.d4);
IShape g1 = new Circle (this.d5,10);
IShape g2 = new Square (this.d6, 20);
Examples () {}}




