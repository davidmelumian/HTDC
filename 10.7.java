    class Ball {
        int X = 5;
        int y;
        int DELTA = 5;
        Ball (int y){
            this.y=y;
        }
        Ball drop () {
            if (this.y+this.DELTA< 100) {
                return  new Ball(this.y+this.DELTA);}
            else { return  new Ball(this.y - this.DELTA);

        }
        }}
    
