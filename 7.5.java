interface IRoomInMUD { }
class TowerRoom implements IRoomInMUD {
int x;
TowerRoom (int x){
  this.x = x;
}
}
class WidowsWalk {
double n;
WidowsWalk (double n){
  this.n = n;
}
}
class SetUp {
IRoomInMUD room;
SetUp(IRoomInMUD room) {
this.room = room;
}
}

/* it is a type error. IroominMud does not belong to Widowswalk. 
  new SetUp (new WindowsWalk (3.0) 
*/

/* this is correct.
  new SetUp (new TowerRoom (30)) */