/* it is incorrect definition. in the field name we  declare only 1 field,therefore, constructor body must
  contain only  that field.
class Ball { int x;
Ball(int x, int x) {
this.x = x;
}
}*/
/* is incorrect definition. it violates the grammar rules in several places.
  1.Field declaretion name must have a unique name.
  2.Ball contains 3 uninitialized fields,therefore all 3 must be in constructor definition and body
class Ball { int x;
int y;
int x;
Ball(int x, int y) {
this.x = x;
this.y = y;
}
} */

/* is incorrect definition. Ball contains 2 fields. Constructor body contains 3 fields.
 Constructor body parameters must be equal to Constructor parameter list.
  class Ball { int x;
int y;
Ball(int x, int y) {
this.x = x;
this.y = y;
this.x = x;
}
}
*/
