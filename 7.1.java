/*
interface Automobile { }
class Automobile { int consumption; // miles per gallon
    Automobile( int consumption) {
        this.consumption = consumption;
    }
} 
It is incorrect. Interface name and class name are the same,so it  violates the constraint.*/

/* 
interface IVehicle { }
class automobile implements IVehicle { int Consumption; // miles per gallon
automobile(int Consumption) {
this.Consumption = Consumption;
}
}
It is a correct  program. By the convention, all fields names, should be lowercase, but it is suffice.*/

/*class Automobile { int consumption; // miles per gallon
Automobile(int x) {
this.consumption = consumption;
}
}
It is incorrect program. The field name in constructor definition is not consumption.*/

/*class Door { int width;
int height;
String color = "yellow";
Door(int width, int height, String color) {
this.width = width;
this.height = height;
this.color = color;
}
}
It is incorrect program. The fieldname "color" has been already initialized. It should not be in
constructor definition and boty*/

/*class Window { int width;
int height;
Window(int width) {
this.width = width;
}
}
It is incorrect program. The fieldname "height" has not been initialized. Therefore,we must add it to constructor
definition and body.*/

/*Q:Is there a grammatically correct program that violates a convention?
  A:Yes,second example violates a convention.
  
