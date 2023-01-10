package JavaIntermediate.Opp.Inheritance;

public class Car extends Vehicle { // this relation is defined as Car IS A vehicle ,
                                   // the Car class can not inherite more thatn one class /multiple inheritance is not allowed in java



int numOfWheels;
int numOfDoors;
String typeOfTransmission;
int numOfSeats;
int horsePower;

    public void turnLeft(){
        System.out.println("Car turn left");
    }
    public void tunRight() {
        System.out.println("Car turn right");
    }



}
