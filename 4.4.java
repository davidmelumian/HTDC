

// short for Bank Account
interface  BA {}

class Saving {
    int current;
    double   interest;
    Saving (int current, double interest) {
        this.current = current;
        this.interest = interest;
    }
}

class Date {
    int day;
    int month;
    int year;
    Date (int day, int month, int year){
        this.day= day;
        this.month = month;
        this.year= year;
    }
}
class Deposit {
    Saving s;
    Date d;
    Deposit (Saving s, Date d){
        this.s= s;
        this.d=d;
    }
}
class Check {
    int current;
    int minimal;

    Check ( int current,int minimal){

        this.current = current;
        this.minimal = minimal;
    }
}

class indetifier {
String name;
int idnumber;
indetifier (String name, int idnumber){
this.name= name;
this.idnumber= idnumber;
}}

class Account0
implements  BA {
    indetifier aid;
    Check c;
    Account0(indetifier aid, Check c) {
        this.aid = aid;
        this.c = c;
    }
}

class Account1
        implements  BA {
    indetifier aid;
    Deposit c;

    Account1(indetifier aid, Deposit c) {
        this.aid = aid;
        this.c = c;

    }
}

class Account2
        implements  BA {
    indetifier aid;
    Saving s;
    Account2(indetifier aid, Saving s) {
        this.aid = aid;
        this.s = s;
    }
}

class BankExamples {
indetifier i1 = new indetifier("Earl Gray",1729);
indetifier i2 = new indetifier("Ima Flatt",4101);
indetifier i3 = new indetifier("Annie Proulx", 2992);
Check c1 = new Check(1250,500);
Date d1 = new Date(1,6,2005);
Saving s1 = new Saving(10123,4);
Saving s2 = new Saving(800,3.5);
Deposit dd1 =new Deposit(this.s1,this.d1);
BA a0 = new Account0(this.i1,this.c1);
BA a1 = new Account1(this.i2,this.dd1);
BA a2 = new Account2(this.i3,this.s2);
BankExamples () {}
}