package LearnConstructors;

public class TestConstructor {

    public static void main(String[] args) {

        Car Toyota=new Car("Toyota","Rav4",2022);
        Car Mercedes=new Car("Mercedes",2022,"GLK");
        System.out.print(Toyota.make+" ");
        System.out.print(Toyota.model+" ");               //instance variable of a class belong to the objects of that class , we use object name to call them(exp=toyota,mercedes)
        System.out.print(Toyota.year);
        System.out.println( "\tThe type is : "+ Car.TypeOfCar);       // static members of a class belong to the class , we use class name to call them
        //TypeOfCar is static variable we used Car(class) to call it
        //make, model, year are non-static(instance variables) we used the object to call them
        System.out.print( Mercedes.make+" ");
        System.out.print( Mercedes.model+" ");           //non-static and instance variable of a class belong to the objects of that class , we use object name to call them(exp=toyota,mercedes)
        System.out.print( Mercedes.year);               //non-static and instance variable of a class belong to the objects of that class , we use object name to call them(exp=toyota,mercedes)

        System.out.println( "\tThe type is : "+Car.TypeOfCar);// static members of a class belong to the class , we use class name to call them
        System.out.println("This is a static variable in the class Car and i used Class 'Car' to call it because it belongs to to class :"+Car.x);                            // static members of a class belong to the class , we use class name to call them
    }




}
