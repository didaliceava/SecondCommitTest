package JavaIntermediate.Opp.Inheritance;

public class Car extends Vehicle { // this relation is defined as Car IS A vehicle ,
                                    // the Car class can not inherit more than one class /multiple inheritance is not allowed in java
    int numOfWheels;
    int numOfDoors;
    int numOfSeats;
    int speed;

    public Car(String typeOfVehicle, String model, String color, int numOfDoors, int numOfSeats, int numOfWheels,int speed) {
    super(typeOfVehicle, model, color);//when we create new obj of this child class (Car) , we must call the parent constructor here (Vehicle or super) because we are creating an obj of parent too
        this.numOfSeats = numOfSeats;
        this.numOfDoors = numOfDoors;
        this.numOfWheels = numOfWheels;
        this.speed=speed;

    }

    @Override
    public void decelerate() {
        super.decelerate();    // super keyword is used to call the parent base method

    }
    @Override
    public void start() {
        super.start();
    }


    public void accelerate(){
        System.out.println( "the speed is now "+speed);
    }

    public void turnLeft() {
        System.out.println("Car turn left");
    }

    public void tunRight() {
        System.out.println("Car turn right");
    }



}
