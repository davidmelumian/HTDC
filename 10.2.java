    class Adress {
        String city;
        String street;
        int number;
        Adress (String city, String street,int number){
            this.city=city;
            this.street=street;
            this.number=number;
        }
    }

        class REA {
            String type;
            int rooms;
            int price;
            Adress adress;
            REA (String type, int rooms, int price, Adress adress){
                this.type=type;
                this.rooms=rooms;
                this.price=price;
                this.adress=adress;
            }
            //House  House -> Boolean
            // determines whether one house have more rooms than the other
            boolean isBigger (REA that) {
                return this.rooms> that.rooms;
            }
            //House String -> Boolean
            //determines whether the house is in the given city.
            boolean thisCity (String s){
                return this.adress.city.equals(s);
            }
            //House House -> Boolean
            //determines  whether one house is in the same city as some other house
            boolean sameCity (REA that) {
                return this.adress.city.equals(that.adress.city);
            }
        }
/* class {REA
  String type
  int rooms
  int price
  Adress adress
  REA (String type, int rooms, int price ,Adress adress){
  this.type = type;
  this.rooms= rooms;
  this.price= price;
  this.adress=adress;
  }
  
  METHODS
  boolean isbigger
  boolean thiscity
  boolean samecity
  }
  