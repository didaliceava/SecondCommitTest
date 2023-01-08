package LearnConstructors;

import org.w3c.dom.ls.LSOutput;

public class Car { //Constructor is implicit even if we did not explicitly define it /declared

    /* a class is a bleu print of real word objects
    classes have states(attributes), behaviours (functions)
     */

       Car(String ma ,String md ,int yr){                       // user defined constructor , means java gives the user power to control constructing the objects of the class
           this.make=ma;
           this.model=md;                                       // here i am taking the user values and i  assign it to instance variable
           this.year=yr;
       }                                                        // whatever parameters the user declare, need to be used for any object created for this class Car

      Car(String ma,int yr,String md){
        this.make=ma;
        this.model=md;
        this.year=yr;
    }




    String make="";                                           //instance variables,attribute of the class, instance because they belong to each(instance
    String model;                                          // ,example or OBJECT of the class , every obj created will have access to these variables
    int year;
   public static String TypeOfCar="SUV";  //Static member of a class belong to the class / see TestConstructors
   public static int x=10;

   void accelerate() {
      System.out.println("accelerate");
  }

  void turnLeft(){
      System.out.println("TurnLeft");
  }

}
