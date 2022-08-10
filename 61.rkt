#lang profj/beginner
class Adress {
    String country;
    String city;
    String street;
    int house;
    Adress (String country,String city,String street, int house) {
        this.country=country;
        this.city = city;
        this.street =street;
        this.house = house;
    }
}
// in centimeters and kgs.
class Box {
    int width;
    int lenght;
    int height;
    double weight;
    Box (int width, int length, int height,double weight) {
        this.width= width;
        this.lenght= length;
        this.height = height;
        this.weight= weight;
    }
}
// information about the sender.
class Sender {
    String name;
    String surname;
    int phone;
    Adress a;
    Sender (String name, String surname, int phone,Adress a){
        this.name= name;
        this.surname = name;
        this.phone = phone;
        this.a = a;
    }
}
//information about the recipient
class Recepient {
    String name;
    String surname;
    int phone;
    Adress a;
    Recepient (String name, String surname, int phone,Adress a){
        this.name=name;
        this.surname=surname;
        this.phone=phone;
        this.a=a;
    }
}
// String Int. Represents the url and tracknumber
class Track {
    String URL;
    int num;
    Track (String URL, int num){
        this.URL=URL;
        this.num=num;
    }
}
// {Box Sender Rec Track ]. Represents the package
class Package {
    Box b;
    Sender s;
    Recepient r;
    Track t;
    Package (Box b,Sender s, Recepient r, Track t){
        this.b=b;
        this.s=s;
        this.r=r;
        this.t=t;
    }
}

class PackageExamples {
    Box b0 = new Box(10, 10, 10, 3.00);
    Box b1 = new Box(15, 10, 3, 2.00);
    Box b2 = new Box(60,60,60,200.00);
    Adress a0= new Adress("Ukraine","Kyiv","Velika Vasilkyvska", 8);
    Adress a1= new Adress("USA","New York","Times square",2);
    Adress a2 = new Adress("Germany","Dusseldorf","Stracce",23);
    Adress a3 = new Adress("Poland","Warsawa","Lubomirska",30);
    Adress a4 = new Adress("Russia","Saint-Peterburg","Nevskiy prospekt",56);
    Adress a5 = new Adress("Japan","Tokyo","Shinuku",32);
    Adress a6 = new Adress("China","Shanghai","Tower",98);
    Sender s0 = new Sender("David","Melumiyan",675201444,this.a0);
    Sender s1 = new Sender("Yukihira","Soma",338122111,this.a5);
    Sender s2 = new Sender( "Agent", "Nicolas", 442158411,this.a4);
    Recepient r0 = new Recepient("Matthias","Fellensein",1111111,this.a1);
    Recepient r1 = new Recepient("Jarosław","Kaczyński",1111111,this.a3);
    Recepient r2 = new Recepient("Angela","Merkel",232431141,this.a2);
    Track t0 = new Track("www.USPS.com/tracking",22158469);
    Track t1 = new Track("www.tnt.com/tracking",54821563);
    Track t2 = new Track( "www.novaposhta.com/tracking",96589542);
    Package p0 = new Package(this.b0,this.s0,this.r0,this.t0);
    Package p1 = new Package(this.b1, this.s1,this.r2,this.t2);
    Package p2 = new Package(this.b2,this.s2,this.r1,this.t1);
    PackageExamples () {}
}