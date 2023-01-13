package ControlFlow;

public class Exercise2 {


    public static void main(String[] args) {


        System.out.println("This is the list of even numbers is : ");
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.print(x + "\t");

            }


        }
        System.out.println("This is the list of odd numbers is : ");
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.print(x + "\t");

            }


        }
    }

}


