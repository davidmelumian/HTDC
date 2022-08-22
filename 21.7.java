interface IItem {
    // is this Coffee?
    boolean isCoffee();
    // is this Tea?
    boolean isTea();
    //convert this to Coffee (if feasible)
    Coffee toCoffee ();
    //convert this to Tea (if feasible)
    Tea toTea ();
    // is this the same IItem as other?
    boolean same(IItem x);

}
 abstract class AItem implements IItem{
    protected String name;
    protected int price;
   protected AItem(String name, int price){
        this.name=name;
        this.price=price;
    }
    
}

class Coffee extends AItem{
    Coffee(String name, int price){
        super (name,price);
    }
    public boolean isCoffee (){
        return true;
    }
    public boolean isTea(){
        return false;
    }
    public Coffee toCoffee(){
        return  this;
    }
    public Tea toTea(){
        throw new Error ("not a Tea");
    }
    // is this the same Coffee as other?
    private  boolean same(Coffee other){
        return  (this.name.equals(other.name))&&(this.price==other.price);
    }
    public boolean same (IItem other){
        return (other.isCoffee())&& (other.toCoffee().same(this));
    }
}

class Tea extends AItem {
    public Tea (String name, int price){
        super (name,price);
    }
    public boolean isCoffee (){
        return false;
    }
    public boolean isTea (){
        return  true;
    }
    public Coffee toCoffee (){
        throw new Error("not a Coffee");
    }
    public Tea toTea (){
        return this;
    }

    public  boolean same (IItem other){
        return  (other.isTea())&&(other.toTea().same(this));
    }
}
/*
        new Tea ("Black",20).isCoffee()
        new Tea ("Black",20).isTea()
        new Tea ("Black",20).toCoffee()
        new Tea ("Black",20).toTea()
        new Tea ("Black",20).same(new Tea("Green",40))
        new Tea ("Black",20).same(new Coffee("Cappucino",20))

 */

