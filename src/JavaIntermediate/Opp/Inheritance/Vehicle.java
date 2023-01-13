package JavaIntermediate.Opp.Inheritance;

public class Vehicle {   //This is the superClass


    String typeOfVehicle;
    String color;
    String Model;

    public Vehicle(String typeOfVehicle, String model, String color) {
        this.typeOfVehicle = typeOfVehicle;
        this.Model = model;
        this.color = color;

    }

    public void accelerate(){
        System.out.println("The "+color+" "+ typeOfVehicle+" is accelerating");
    }
    public void decelerate() {
        System.out.println("The "+color +" "+typeOfVehicle+"  is decelerating");
    }
    public void start(){
        System.out.println("The "+color+ " "+typeOfVehicle+" is starting");
    }

    public void turnOn(){
        System.out.println(typeOfVehicle+" turnOn");
    }
}
