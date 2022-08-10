#lang profj/beginner
interface  IPT {}

class Player {
    String name;
    int phone;
    Player (String name, int phone) {
    this.name=name;
    this.phone=phone;
    }
}

class Coach {
    IPT team;
    Coach (IPT team){
        this.team=team;
    }
}

class PhoneTree implements IPT {
    Player p;
    IPT call1;
    IPT call2;

    PhoneTree (Player p,IPT call1, IPT call2 ) {
        this.p = p;
        this.call1 = call1;
        this.call2 = call2;

    }
}

class MTTeam implements IPT {
    MTTeam () {}
}

class Examples {
    Player cpt = new Player("Bob",5432345);
    Player p1 = new Player("Jan",5432356);
    Player p2 = new Player("Kerry",5435421);
    Player p3 = new Player ("Ryan",5436571);
    Player p4 = new Player("Erin",5437762);
    Player p5 = new Player("Pat",5437789);
    IPT mt = new MTTeam();
    IPT pt =
            new PhoneTree(
                    this.cpt,
                    new PhoneTree(
                            this.p1,
                            new PhoneTree(this.p2,this.mt,this.mt),
                            new PhoneTree(this.p3,this.mt,this.mt)),
                    new PhoneTree(
                            this.p4,
                            new PhoneTree(this.p5,this.mt,this.mt),
                            this.mt));
 Examples() {}                               
}
