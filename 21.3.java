    class Factoring {
        private int x;
        private int y;

        public Factoring(int x, int y){
            this.x=x;
            this.y=y;
        }
        // Number Number -> Number
        // computes the product of two numbers
        public int  prod (){
            return this.x*this.y;
        }
        public boolean same (int a){
            return (a==this.x)||(a==this.y);}

        public  boolean samefactoring (Factoring a){
            return  ((this.x==a.x)&& (this.y==a.y))
                    ||(this.x==a.y)&&(this.y==a.x);
        }
        public boolean sameproduct (Factoring a){
            return  this.prod()==a.prod();
        }

    }