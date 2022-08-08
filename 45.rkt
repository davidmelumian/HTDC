#lang profj/beginner
class Type {
    String name;
    double size;
    Type (String name, double size) {
        this.name=name;
        this.size=size;
    }
}

interface Gallery {}
class Images
implements  Gallery {
    Type t;
    int width;
    int height;
    String quality;
    Images (Type t, int width, int height, String quality){
        this.t= t;
        this.width = width;
        this.height = height;
        this.quality = quality;
    }

}

class Texts
implements  Gallery {
    Type t;
    int lines ;
    Texts (Type t, int lines) {
        this.t= t;
        this.lines= lines;

    }
}

class Sounds
implements  Gallery {
    Type t;
    int s;
    Sounds (Type t, int s){
        this.t=t;
        this.s=s;
    }
}

class GalleryExamples {
    Type t0 =new Type("flower.gif",57.234);
    Type t1 =new Type("welcome.txt",5.312);
    Type t2 =new Type("theme.mp3",40.960);
    Gallery g0 = new Images(this.t0,100,50,"medium");
    Gallery g1 = new Texts(this.t1,830);
    Gallery g2 = new Sounds(this.t2,200);
    GalleryExamples () {}

}