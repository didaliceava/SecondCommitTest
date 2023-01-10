package JavaIntermediate.Opp.Inheritance;

public class Vehicle {   //This is the superClass


    String typeOfVehicle;
    String typeOfEngine;
    String color;
    String manufacturer;
    String model;

    public void accelerate(){
        System.out.println(typeOfVehicle+" is accelerating");
    }
    public void decelerate() {
        System.out.println(typeOfVehicle+"Vehicle is decelerating");
    }
    public void start(){
        System.out.println(typeOfVehicle+"Vehicle start");
    }

    public void turnOn(){
        System.out.println(typeOfVehicle+" turnOn");
    }
}
