interface  IRecord {
    long timeToDownload(double b);
    boolean smallerThan(double s);
    boolean sameName (String name);
}

class Source {
    String name;
    double size;
    Source (String name, double size){
        this.name=name;
        this.size=size;
    }
}

class Image  implements  IRecord{
    Source s;
    int width;
    int height;
    String quality;
    Image (Source s, int width, int height, String quality){
        this.s=s;
        this.width=width;
        this.height=height;
        this.quality=quality;
    }
    long timeToDownload (double b){
        return  Math.round(this.s.size/b);
    }
        boolean  smallerThan(double f) {return  this.s.size<=f ;
      }
        boolean  sameName (String aname){return this.s.name.equals(aname) ;}
}
class Text implements IRecord {
    Source s;
    int lines;

    Text(Source s, int lines) {
        this.s = s;
        this.lines = lines;
    }

    long timeToDownload (double b){
        return  Math.round(this.s.size/b);
    }
      boolean  smallerThan(double f) {return  this.s.size<=f ;
    }
     boolean  sameName (String aname){return this.s.name.equals(aname) ;}
}
class Sound implements  IRecord {
    Source s;
    int playtime;
    Sound (Source s, int playtime){
        this.s=s;
        this.playtime=playtime;
    }
    long timeToDownload (double b){
        return  Math.round(this.s.size/b);
    }
    boolean  smallerThan(double f) {return  this.s.size<=f ;
    }
     boolean  sameName (String aname){return this.s.name.equals(aname) ;}
    }
