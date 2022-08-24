    interface ISortedList {
        // add i to this list so that the result is so sorted
        ISortedList insert (int i);
        // this first item on this list
        int first ();
        //the remainder of this liit
        ISortedList rest ();
    }

        class Cons implements ISortedList {
            int fst;
            ISortedList rst;
            Cons (int fst, ISortedList rst){
                this.fst=fst;
                this.rst=rst;
            }
            public int first (){
                return this.fst;
            }
            public ISortedList rest (){
                return  this.rst;
            }
            public ISortedList insert (int i){
                if (i<=this.first()) {
                    return  new Cons(i,(new Cons (this.fst,this.rst.rest())));
                }
                else {return  new Cons(this.fst,this.rst.insert(i));
                }

            }
            public String asString (){
                return  String.valueOf(fst).concat(" ").concat(String.valueOf(rst));
            }
}

        class Empty implements ISortedList {
            Empty (){}
            public  int first (){
                return  0;}
            public ISortedList rest (){
                return  this;
            }
            public ISortedList insert (int i){
                return new Cons(i,this);}}


  