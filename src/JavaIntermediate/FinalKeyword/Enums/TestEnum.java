package JavaIntermediate.FinalKeyword.Enums;

enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class TestEnum {

    public static void main(String[] args) {

        System.out.println("I am going " + Directions.EAST);

        Months[] myArray = Months.values();
        for (Months x : myArray) {
            System.out.println(x);
        }

        Days []arr= Days.values();
        for (int x=0;x<7;x++){
            System.out.println("The value of index number " + x + " is: " +arr[x]);// to print all value we can do this for loop
        }
        //Or we can print values one a the time

        System.out.println(arr[0]); //Monday
        System.out.println(arr[1]);//Tuesday
        System.out.println(arr[2]);//Wednesday
    }
}