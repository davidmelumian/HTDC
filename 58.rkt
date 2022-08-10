#lang profj/beginner
interface  IRiver {}

//location on a river
class Location {
    int x;
    int y;
    String name;
    Location (int x, int y,String name) {
        this.x= x;
        this.y =y;
        this.name=name;
    }
}


class LocationName {
    Location loc;
    String name;
    LocationName (Location loc, String name){
        this.loc=loc;
        this.name=name;
    }
}



//the source of a river
class Source implements  IRiver{
    LocationName loc ;
    String name;
     Source(LocationName loc,String name) {
        this.loc =loc;
        this.name=name;
    }
}


// the end of a river
class Mouth {
    LocationName loc;
    String name;
    IRiver river;
    Mouth (LocationName loc,String name,IRiver river) {
        this.loc= loc;
        this.name=name;
        this.river = river;
    }
}
//a confluence of two rivers
class Confluence implements  IRiver {
    Location loc;
    IRiver left;
    IRiver right;

    Confluence (Location loc,IRiver left, IRiver right ){
        this.loc=loc;
        this.left= left;
        this.right=right;

    }
}