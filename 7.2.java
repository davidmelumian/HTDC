class Ball {
    int x;
    Ball (int x) {
        this.x=x;
    }
}
/* new Ball (3,4) is incorrect application.
 It consumes two fields. but it has only one */

/* new Ball (new Posn (3,4)) is incorrect application.
It consumes a class that is not relative to Ball. */

/* new Ball (3) is correct. */





