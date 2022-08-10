#lang profj/beginner
interface Ancestors {}

class Person {
 String name;
int year;
        Person (String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    class  Unknown implements  Ancestors {
    String S ="???";
     Unknown (){
    }
    }

    class Anc implements  Ancestors {
        Ancestors mother;
        Ancestors father;
        Person child;
        Anc (Ancestors mother, Ancestors  father,Person child){
            this.mother=mother ;
            this.father= father;
            this.child = child;


        }
    }

    class Examples {
    Person peter= new Person("Peter",1980);
    Person janet = new Person("Janet",1958);
    Person paul = new Person ("Paul",1956);
    Person angela = new Person("Angela", 1936);
    Person robert = new Person( "Robert",1935);
    Person annie = new Person("Annie", 1938);
    Person bob  = new Person("Bob",1917);
    Ancestors a0 = new Anc (new Unknown(),new Unknown(),this.angela);
    Ancestors a1 = new Anc (new Unknown(),new Unknown(),this.robert);
    Ancestors a2 = new Anc(new Unknown(),new Unknown(),this.bob);
    Ancestors a3 = new Anc(new Unknown(),this.a2,this.annie);
    Ancestors a4 = new Anc(this.a0,this.a1,this.janet);
    Ancestors a5 = new Anc(this.a3,new  Unknown(),this.paul);
    Ancestors a6 = new Anc(this.a4,this.a5,this.peter);
    Examples (){}
    }
    //; A Child is a structure:
//;   (make-child Child Child String N)
//(define-struct ??? [])
//(define-struct child [mother father  name date])
//(define angela (make-child (make-???)  (make-???)  "Angela" 1936))
//(define robert (make-child (make-???) (make-???) "Robert"  1935))
//(define janet(make-child angela robert  "Janet" 1958))
//(define bob (make-child  (make-???) (make-???) "Bob" 1917))
//(define annie (make-child (make-???) bob "Annie" 1938))
//(define paul (make-child annie (make-???)  "Paul" 1956))
//(define peter (make-child janet paul "Peter" 1980))

