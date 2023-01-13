package JavaIntermediate.Opp.Inheritance;
public class TestInheritance {


    public static void main(String[] args) {

        /* String x= "35"; //here String is a datatype  and a Class , just like Car above is a datatype but user defined.
        Car Bmw = new Car();  // this new Car object ,will have access to Car attributes and to vehicle attributes because car extends vehicle
        Bmw.color = "White";
        Bmw.typeOfVehicle = "BMW X5";
        Bmw.accelerate();
        Bmw.decelerate();



        Vehicle obj = new Car();        //here we created a Car object , but from datatype Vehicle (Car inherited Vehicle)
        obj.color = "White";           // the nw object will only have access to Vehicle attributes
        watercraft boat = new watercraft();  //when the new object of child class is created , it gets access the the vehicle(parent)attributes
        boat.color = "Grey"; //when i assign value here , it is given to the attribute in parent class, when method called, the assigned value here is the one that prints.
        boat.typeOfVehicle = "Yacht";
        boat.accelerate();
        boat.decelerate();


        Vehicle testObj = new Vehicle(); // This is Super Class , objects has access to its own attributes only
        testObj.color = "White";


        motorCycle harley = new motorCycle();// Child class because motorcycle is a vehicle
        harley.color = "White";


        //  Fish obj= new Fish();
        //  obj.eat();*/

       Vehicle obj=new Vehicle("Car","BMW","White");
        obj.accelerate();  // this is calling the accelerate method in the base method (overriden) from parent class




        Car bmw=new Car("car","bmw","white",4,4,4,60);  //object of child class
        bmw.accelerate(); // this is calling the accelerate method from child class
    }


}
