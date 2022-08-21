    interface ITaxiVehicle {}

        class  Vehicle implements  ITaxiVehicle{
            int idnum;
            int passengers;
            int pricepermile;

            Vehicle (int idnum,int passengers,int pricepermile){
                this.idnum=idnum;
                this.passengers=passengers;
                this.pricepermile=pricepermile;
            }
        }

        class Cab extends Vehicle {
            Cab (int idnum,int passengers, int pricepermile){
                super (idnum,passengers,pricepermile);
            }
        }

        class Limo extends  Vehicle{
            int minrental;
            Limo (int idnum, int passengers, int pricepermile,int minrental){
                super(idnum,passengers,pricepermile);
                this.minrental=minrental;
            }
        }

        class Van extends  Vehicle{
            boolean access;
            Van (int idnum, int passengers, int pricepermile,boolean access){
                super(idnum,passengers,pricepermile);
                this.access=access;
            }
        }