class Set2 {
        private int one;
        private int two;
        public Set2(int one, int two) {
           this.one = one;
            this.two = two;
        }
        // is this the same Set2 as other?
        public  boolean IsSubset (Set2 a) {
            return ((this.one == a.one) && (this.two == a.two))
                    || (this.one == a.two) && (this.two == a.one);
        }}