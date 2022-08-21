    interface IVehicle {
        //compute the cost of refueling this vehicle
        // given the current price (cp) of fuel
        double cost (double cp);}

        abstract class AVehicle implements IVehicle {
            double tank;//gallons
            AVehicle (double tank){
                this.tank=tank;
            }
            public double cost (double cp){
                return this.tank*cp;
            }
        }

        class Car extends AVehicle {
            String model;
            int year;
            Car(double tank,String model, int year){
                super(tank);
                this.model=model;
                this.year=year;
            }
        }

        class Truck extends AVehicle {
            String model;
            int year;
            int weight;
            Truck (double tank,String model,int year, int weight){
                super (tank);
                this.model=model;
                this.year=year;
                this.weight=weight;
            }
        }

        class Bus extends AVehicle {
            String model;
            int year;
            int passengers;
            Bus (double tank, String model, int year, int passengers){
                super (tank);
                this.model=model;
                this.year=year;
                this.passengers=passengers;
            }
        }

new Car (20,"Ferrari",2019).cost(2.0);
new Truck (40,"Man",2012,8000).cost(4.0);
new Bus (60,"School",2019,28).cost(6.0);




