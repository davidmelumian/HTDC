/* a type error. fields does not contain int type.
class Employee {
String fst;
String lst;
Employee(String fst, int lst) {
this.fst = fst;
this.lst = lst;
}
}
*/

/* type error. constructor call violates the field.
class Employee {
String fst;
String lst;
Employee(String fst, String lst) {
this.fst = fst;
this.lst = lst;
}
}
new Employee("Matthias", 1)
*/
/* syntax error. constructor specifies for only 1 parameter. Constructor call have two.
class Customer {
String name;
Customer(String name) {
this.name = name;
}
} 
  new Employee("Matthias", 1)
*/

// a type error. Customer is not a part of Iperson interface.
interface IPerson {}
class Employee implements IPerson {
String fst;
String lst;
Employee(String fst, int lst) {
this.fst = fst;
this.lst = lst;
}
}
class Customer {
String name;
Customer(String name) {
this.name = name;
}
}
class Transaction {
IPerson c = new Customer("Kathy Gray");
IPerson e = new Employee("Matthew", "Flatt");
Transaction() { }
}