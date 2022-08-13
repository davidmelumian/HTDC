
interface  LOP {}

class Employee {
    int id;
    String name;
    String title;
    Employee(int id, String name, String title){
        this.id=id;
        this.name=name;
        this.title=title;

    }
}

class  EmptyLOP implements  LOP {
    EmptyLOP () {}
}
class ConsLOP  implements  LOP {
    Employee fst;
    LOP rst;
    ConsLOP (Employee fst, LOP rst){
        this.fst=fst;
        this.rst=rst;
    }
}

interface  LOB {}


class BossLoP {
    Employee e;
    LOP c;
    BossLoP (Employee e, LOP c) {
        this.e=e;
        this.c=c;
    }
}

class ebl implements  LOB{
    ebl (){}
}

class consboss implements  LOB{
    BossLoP fst;
    LOB rst;
    consboss (BossLoP fst, LOB rst){
        this.fst=fst;
        this.rst=rst;
    }
}

class BossLob  implements LOB{
    Employee e;
    LOB l;
    BossLob (Employee e, LOB l){
        this.e=e;
        this.l=l;
    }
}


class Examples {
    Employee director = new Employee(0,"David","director");
    Employee zam= new Employee(1,"Andrey","zam");
    Employee manager1= new Employee(2,"vova","manager1");
    Employee manager2= new Employee(3,"vasya","manager2");
    Employee manager3= new Employee(4,"aleksey","manager3");
    Employee a= new Employee(5,"a","a");
    Employee b = new Employee(6,"b","b");
    Employee c = new Employee(7,"c","c");
    Employee d = new Employee(8,"d","d");
    Employee e = new Employee(9,"e","e");
    Employee f = new Employee(10,"f","f");
    LOP ab0 = new EmptyLOP();
    LOP ab1 = new ConsLOP(this.b,this.ab0);
    LOP ab2 = new ConsLOP(this.a,this.ab1);
    LOP cd1 = new ConsLOP(this.d,this.ab0);
    LOP cd2 = new ConsLOP(this.c,this.cd1);
    LOP ef1 = new ConsLOP(this.f,this.ab0);
    LOP ef2 = new ConsLOP(this.e,this.ef1);
    BossLoP bossmanager1 = new BossLoP (this.manager1,this.ab2);
    BossLoP bossmanager2 = new BossLoP(this.manager2,this.cd2);
    BossLoP bossmanager3 = new BossLoP(this.manager3,this.ef2);
    LOB cons0 = new ebl();
    LOB  cons1 = new consboss(this.bossmanager3,this.cons0);
    LOB cons2 = new consboss(this.bossmanager2,this.cons1);
    LOB cons3 = new consboss(this.bossmanager1,this.cons2);
    BossLob b1 = new BossLob(this.zam,this.cons3);
    BossLob b2 = new BossLob(this.director,this.b1);
    
    Examples (){}
}