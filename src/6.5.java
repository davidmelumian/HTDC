
interface GUI {}

class BooleanView implements GUI {
    String label;
    int n;
    BooleanView (String label,int n) {
        this.label= label;
        this.n= n;

    }
}

class TextFieldView implements  GUI {
    String label;
    int n;
    TextFieldView (String label,int n){
        this.label=label;
        this.n=n;
    }
}

class OptionsView implements  GUI {
    String label;
    int n;
    OptionsView (String label,int n){
        this.label=label;
        this.n=n;
    }
}

class ColorView implements  GUI {
    String label;
    int n;
    ColorView (String label,int n){
        this.label= label;
        this.n = n;
    }
}

interface ITable {}

class Empty implements  ITable {
    Empty (){}
}

class Cons implements  ITable {
    GUI fst;
    ITable rst;
    Cons (GUI fst, ITable rst){
        this.fst = fst;
        this.rst = rst;
    }
}

class Examples {
    GUI g0 = new BooleanView("BooleanView",0);
    GUI g1 = new TextFieldView("TextFieldView",1);
    GUI g2 = new OptionsView("OptionsView",2);
    GUI g3 = new ColorView("ColorView",3);
    ITable i0 = new Empty ();
    ITable i1 = new Cons(this.g0,this.i0);
    ITable i2 = new Cons(this.g1,this.i1);
    ITable i3 = new Cons(this.g2,this.i2);
    ITable i4 = new Cons(this.g3,this.i3);
    Examples (){}
}