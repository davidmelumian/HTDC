interface  ZooAnimal {}
class Animal implements ZooAnimal{
    String name;
    int weight;
    Animal (String name, int weight){
        this.name=name;
        this.weight=weight;
    }
}


class Lion extends Animal{
    int meat;
    Lion (String name, int weight,int meat){
        super (name,weight);
        this.meat=meat;
    }
}

class Snake extends  Animal{
    int length;
    Snake (String name, int weight, int length){
        super (name,weight);
        this.length=length;
    }
}

class Monkey extends  Animal{
    String food;
    Monkey(String name,int weight,String food){
        super (name,weight);
        this.food=food;
    }
}

