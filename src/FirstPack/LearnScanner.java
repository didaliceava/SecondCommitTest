package FirstPack;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        Scanner myConsole = new Scanner(System.in);

        System.out.print("Please Enter The first number : ");
        int x = myConsole.nextInt();
        System.out.print("Please Enter the second Number: ");
        int y = myConsole.nextInt();
        System.out.println("The addition of x and y total is :" + doAddition(x, y));
    }


                                                              /* Scanner myConsole= new Scanner(System.in);
                                                                 System.out.print("Please enter your name:");
                                                                String myInput =myConsole.nextLine();
                                                                System.out.println(myInput);*/

               static  int doAddition(int num1, int num2){
               return num1+num2;

    }


}
