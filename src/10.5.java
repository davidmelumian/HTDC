class Coffee {
        String name;
        int price;
        int weight;
        Coffee (String name,int price, int weight){
            this.name=name;
            this.price=price;
            this.weight=weight;
        }
        //a Discount is grants if
        // [0-4999] - 0%
        // [5000 - 19999]- 10%
        // [20000 ...] - 25%

        int cost(){
            if (0<=this.weight&&this.weight<= 4999) {
                return (Math.round((this.price*this.weight)));}
           else  {
            if (5000<=this.weight&&this.weight<=19999) {
                return (Math.round(((this.price*this.weight))-((this.price*this.weight)*(10/100F))));}
            else {
                return (Math.round(((this.price*this.weight))-((this.price*this.weight)*(25/100F))));}
        }}}