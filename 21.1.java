// represents a set of two numbers
    class Set2 {
        private int one;
        private int two;

        public Set2 (int one,int two){
            this.one=one;
            this.two=two;
        }
        //does this set contain x?
        private boolean in (int x){
            return  (this.one==x)||(this.two==x);
        }
        //is this the same Set2 as other?
         boolean same(Set2 other){
            return other.in(this.one)&&
                    other.in(this.two)&&
                    this.in(other.one)&&
                    this.in(other.two);

        }}
new Set2(4,3).same(new Set2(4,3))
new Set2 (1,2).same(new Set2(2,1))
