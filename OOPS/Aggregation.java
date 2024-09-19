package OOPS;


class Driver{

    public  String name;
    public  Driver(String name){
        this.name=name;
    }
    Vehicle vehicle;
}

class Vehicle {
    public String type;
    public  Vehicle(String type){
        this.type=type;
    }
}



public class Aggregation {

    public static void main(String[] args) {

        Driver D1= new Driver("sharan");
        Vehicle V1= new Vehicle("car");

        D1.vehicle=V1;


    }

}
