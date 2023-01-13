package ControlFlow;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class MenuOrdering {
    /*build a menu ordering programm deriven user input to allow users to order food
    items off a menu , the program should allow the user to select items to order , and keep a tally of the total
    the total should be printed for the customer once they finish ordering. */
    static MenuOrdering obj=new MenuOrdering();
    static Scanner myscanner = new Scanner(System.in);
    static String welcomeMsg = "Welcome to Harris Burger, would you like to order?\n";
    static String menu = "\t1-Burgers\n\t2-Sides\n\t3-Drinks";
    static String BurgerMenu = "\t1-HamBurger($5.50)\n\t2-CheeseBurger($6.50)\n\t3-Chicken Burger($7.00)\n\t4-DoubleCheeseBurger($8.50)";
    static String SideMenu = "\t1-Small French Fries($2.90)\n\t1-Large French Fries($3.90)\n\t3-Onion Rings($2.90)\n\t4-Chips($2.90)";
    static String DrinkMenu = "\t1-Coke ($1.50)\n\t2-Fanta($1.25)\n\t3-Tea($2.00)";

    public static void main(String[] args) {

obj.getWelcomeMenuSelection();
obj.processMenuSelection();

    }
 String getWelcomeMenuSelection() {
       System.out.println(welcomeMsg);
       System.out.println(menu);
       System.out.print("\nPlease make a selection : ");
        return  myscanner.next();
   }

   void processMenuSelection(){
        String menuSelection=myscanner.next();
       switch (menuSelection) {
           case "1":
               System.out.println(BurgerMenu);
               break;
           case "2":
               System.out.println(SideMenu);
               break;
           case "3":
               System.out.println(DrinkMenu);
               break;
           default:
               System.out.println("Invalid Entry, please Try again :");
       }


   }




}