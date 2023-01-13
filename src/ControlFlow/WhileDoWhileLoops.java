package ControlFlow;

public class WhileDoWhileLoops {
/*While Loop :while a condition is true, and only while the condition is true , loop /continue looping
Do While LOOP :execute the loop once first and then check the condition
 */

    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {     //(x>10) This is not executing because the condition is not true x=1;
            System.out.println("This is the while loop number :" + x);                                                    //for (int a=10; a<=100; ++a ) {
            x++;
        }

// if while loop is left than the value of x becomes at this point 10 , the do while loop will start from 10
        do {
            System.out.println("This is the do while loop number :" + x);
            x++;                                   // this will be executed first
        }                                           // while (x>10) condion is not true , it printed once and it stops
        while (x < 20);                          // check the condition is true loop until the condition is false


    }


}
