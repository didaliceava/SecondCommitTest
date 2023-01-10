package ControlFlow;

import java.util.Scanner;

public class LoopsExercise {

    public static void main(String[] args) {

        Scanner myscanner=new Scanner(System.in);
        System.out.println("please enter a the month "); //print this
        int myMonth=myscanner.nextInt(); //  then let the user enter the month
        System.out.println("please enter the year "); //print this
        int myYear=myscanner.nextInt(); // let the user enter the year


        LoopsExercise obj= new LoopsExercise();
        System.out.println(obj.getDaysInMonth(myMonth,myYear)); //execute this method , enter the values that the user gave you
    }

    public int getDaysInMonth (int month , int year) {
        int numberOfDays;
        if(month<1 || month>12){
            System.out.println("invalid Number of Month");
            return -1;
        }
        else if (year<1 || year >9999) {
            System.out.println("invalid Number of year");
            return -1;
        }

switch (month){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        numberOfDays=31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        numberOfDays=30;
        break;
    case 2:

    if (isLeapYear(year)) {
    numberOfDays=29;
        System.out.println("This is a leap year ");
    }else{
        numberOfDays = 28;
    }
        break;

    default:
        return -1;
}

        return numberOfDays;

    }

//we need to add a method to assess the month of february which not always 28
         public boolean isLeapYear(int year){      // a year is leap if it dividable by 4, not by a 100. OR if year is dividable by 400.
         if ((year % 400)==0  || (year % 4==0 && year % 100!=0)){ //here i am saying if the reminder of year/400=0 , then it is leap year
         return true;
        }
         return false;
}



}
