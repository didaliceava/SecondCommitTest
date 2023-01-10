package JavaIntermediate.Opp.Inheritance;

import JavaIntermediate.Opp.BadInheritance.Fish;

public class TestInheritance {
    public static void main(String[] args) {
        Car Bmw =new Car(); // this new Car object ,will have access to Car attributes and to vehicle because car extends vehicle
        Bmw.manufacturer="BMW";
        Bmw.model="X5";
        Bmw.horsePower=500;
        Bmw.numOfDoors=4;
        Bmw.typeOfTransmission= "V6";
        Bmw.numOfSeats =4;
        Bmw.typeOfVehicle= "Car";
        Bmw.turnOn();
        Bmw.accelerate();




        Vehicle testObj=new Vehicle(); // This is Super Class , objects has access to its own attributes only
        testObj.color="White";

        motorCycle harley=new motorCycle();// Child class because motorcycle is a vehicle
        harley.color= "White";


        //  Fish obj= new Fish();
           //  obj.eat();

    }





}
