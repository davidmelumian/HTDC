    interface IItem {
        // is this Coffee?
        boolean isCoffee();
        // is this Tea?
        boolean isTea();
        // is this Chocolate?
        boolean isChocolate();
        //convert this to Coffee (if feasible)
        Coffee toCoffee ();
        //convert this to Tea (if feasible)
        Tea toTea ();
        // is this the same IItem as other?
        Chocolate toChocolate();
        boolean same(IItem x);

    }
        class Coffee implements IItem {
            private String name;

            private int price;

            public Coffee (String name, int price){
                this.name=name;
                this.price=price;
            }
            public boolean isCoffee (){
                return true;
            }
            public boolean isTea(){
                return false;
            }
            public  boolean isChocolate(){
                return false;
            }
            public Coffee toCoffee(){
                return  this;
            }
            public Tea toTea(){
                throw new Error ("not a Tea");
            }
            public Chocolate toChocolate (){
                throw new Error("not a Chocolate");
            }
            // is this the same Coffee as other?
            private  boolean same(Coffee other){
                return  (this.name.equals(other.name))&&(this.price==other.price);
            }
            public boolean same (IItem other){
                return (other.isCoffee())&& (other.toCoffee().same(this));
            }
        }

        class Tea implements IItem {
            private   String kind;
            private int  price;
            public Tea (String kind, int price){
                this.kind=kind;
                this.price=price;
            }
            public boolean isCoffee (){
                return false;
            }
            public boolean isTea (){
                return  true;
            }
            public  boolean isChocolate(){
                return false;
            }
            public Coffee toCoffee (){
                throw new Error("not a Coffee");
            }
            public Tea toTea (){
                return this;
            }
            public Chocolate toChocolate (){
                throw new Error("not a Chocolate");
            }
            private  boolean same(Tea other) {
                return (this.kind.equals(other.kind)) && (this.price == other.price);
            }
            public  boolean same (IItem other){
                return  (other.isTea())&&(other.toTea().same(this));
            }
        }
        class Chocolate implements IItem{
       private String sweetness;
       private int price;
      public  Chocolate(String sweetness,int price){
            this.sweetness=sweetness;
            this.price=price;
        }
        public boolean isCoffee (){
          return  false;
        }
        public boolean isTea (){
          return  false;
        }
        public boolean isChocolate(){
          return  true;
      }

        public Coffee toCoffee (){
          throw new Error("not a Coffee");
        }
        public Tea toTea (){
          throw new Error("not a Coffee");
        }
        public Chocolate toChocolate (){
          return  this;
        }
        private boolean same(Chocolate other){
          return  (this.sweetness.equals(other.sweetness))&&(this.price==other.price);
        }
        public boolean same (IItem other){
          return  (other.isChocolate())&&(other.toChocolate().same(this));
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

