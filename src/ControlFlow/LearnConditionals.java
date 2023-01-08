package ControlFlow;

public class LearnConditionals {

    public static void main(String[] args) {
        int x=1;
        int y=20;
        System.out.println(doSubstraction(x,y));

    }

    static int doSubstraction(int num1, int num2) {


        if (num1 >= num2) {    //if the int x above is greater that y than this code is executed
            return num1 - num2;
        }
        return num2-num1;                //if x is less than y ,num1-num will be skipped and  this code will be executed.


    }


}
