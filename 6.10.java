
class Posn {
    int x ;
    int y ;
    Posn (int x, int y){
        this. x = x;
        this .y = y;
    }
}

interface IColor {}

class Blue implements  IColor {
    String BLUE = "blue";
    Blue(){}
}

class Green implements  IColor {
    String GREEN = "green";
    Green(){}
}
class Red implements  IColor{
    String RED = "red";
    Red (){}
}
class White implements  IColor {
    String WHITE = "white";
    White(){}
}
class Yellow implements  IColor {
    String YELLOW = "yellow";
    Yellow(){}
}

class Black implements  IColor {
    String BLACK = "black";
     Black(){}
}

class UFO {
    IColor colorUFO = new Green();
    Posn location;
    UFO  (Posn location){
        this.location = location;
    }
}

class AUP {
    IColor colorAUP = new Red();
    int location ;
    AUP (int location){
        this.location = location;
    }
}

class Shot {
    IColor colorShot = new Yellow();
    Posn location;
    Shot (Posn location){
        this.location=location;
    }
}

interface  IShots {}

class MTShots implements  IShots{
    MTShots (){}
}

class ConsShots implements  IShots{
    Shot fst;
    IShots rst;
    ConsShots (Shot fst, IShots rst){
        this.fst= fst;
        this.rst= rst;
    }
}


class UFOWorld {
    int WIDTH = 200;
    int HEIGHT = 500;
    IColor BACKG = new Blue();
    UFO ufo;
    AUP aup;
    IShots shots;
    UFOWorld (UFO ufo, AUP aup, IShots shots){
        this.ufo = ufo;
        this.aup = aup;
        this.shots = shots;
    }
}
class WoWExamples {
// an anti-UFO platform placed in the center
    AUP a = new AUP(100);
// a UFO placed in the center,near top of the world
    UFO u = new UFO(new Posn(100, 5));
// a UFO placed in the center, somewhat below u
    UFO u2 = new UFO(new Posn(100,8));
// a Shot, right after being fired from a
    Shot s = new Shot(new Posn(110,490));
// another Shot, above s
    Shot s2 = new Shot(new Posn(110,485));
// an empty list of shots
   IShots le =  new MTShots();
// a  list of one shot
    IShots ls = new ConsShots(this.s,new MTShots());
// a list of two shots, one above the other
    IShots ls2 = new ConsShots(this.s2,new ConsShots(this.s,new MTShots()));
// a complete world, with an empty list of shots
    UFOWorld w = new UFOWorld(this.u,this.a,this.le);
// a complete world, with two shots
    UFOWorld w2 = new UFOWorld(this.u,this.a,this.ls2);
WoWExamples () {}
}