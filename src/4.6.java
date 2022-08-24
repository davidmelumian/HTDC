
interface ITaxiVehicle {}

class Cab
implements  ITaxiVehicle {
    int idNum;
    int passengers;
    int PricePerMile;
    Cab (int idNum, int passengers, int PriceperMile) {
    this.idNum = idNum;
    this.passengers = passengers;
    this.PricePerMile = PriceperMile;
    }
}

class Limo
implements  ITaxiVehicle {
    int minRental;
    Cab  c;
    Limo (int minRental, Cab c){
        this.minRental = minRental;
        this.c = c;
    }
}

class Van
implements ITaxiVehicle{
    boolean access;
    Cab c;
    Van (boolean access, Cab c) {
        this.access = access;
        this.c= c;
    }
}

class Examples {
    ITaxiVehicle c1 = new Cab(9024,4,2);
    Cab c2 = new Cab(2022,8,5);
    Cab c3 = new Cab(1337,10,10);
    ITaxiVehicle l1 = new Limo(10,this.c2);
    ITaxiVehicle v1 = new Van(true,this.c3);
    Examples () {}
}
