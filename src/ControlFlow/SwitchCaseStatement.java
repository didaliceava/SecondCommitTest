package ControlFlow;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner myscanner=new Scanner(System.in);
        System.out.println("please enter a Number:");
        int myNumber=myscanner.nextInt();  // i can just pass the value as exp :int myNumber=2; but here i am using user input myscanner

        SwitchCaseStatement obj = new SwitchCaseStatement();
        System.out.println(obj.getNameOfMonth(myNumber));

    }

     public  String getNameOfMonth (int monthNum){  // we are passing an int , so we are accepting an integer (argument)input from user
          if (monthNum<1 || monthNum>12){
              return  "Error";    // OR I CAN DO  System.out.println( "ERROR");
                                 // with this we know the argument will fall only between the range of 1-12 months
                                 // this condition can be replaced by default: see below at the end of this statement
        }
         String month= ""; // I CAN DECLARE String as local inside the method , or here , or above as a global variable
         switch (monthNum){

             case 1 :
            month= "January"; // i can replace this ("month=january") by   System.out.println("January");
             break;
             case 2:
                month="February";
                break;
            case 3:
                month= "March";
             break;
            case 4:
                month= "April";
             break;
            case 5:
                month= "May";
            break;
            case 6:
                month= "June";
                break;
            case 7:
                month= "July";
                break;
            case 8:
                month= "august";
                break;
            case 9:
                month= "September";
                break;
            case 10:
                month= "October";
                break;
            case 11:
                month= "November";
                break;
            case 12:
                month= "December";
            break;
             default:   // if it outside 1-12 return error
                 return "Error";

        }
        return month;
    }


}
