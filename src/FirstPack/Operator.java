package FirstPack;
//An expression is a series of variables, operators, and method calls constructed  to evaluate to a single value
 //“expression” is a combination of values and functions that are combined and interpreted by the compiler to create a new value
public class Operator {
   public static int x=5;
    public static void main(String[] args) {

        System.out.println(x);
        x=x+1;   //...5+1
        System.out.println(x);
        x+=1;     //x=x then +1 ... 6+1
        System.out.println(x);
        x-=1;      //x=x then -1 ...7-1
        System.out.println(x);
        x=+1; // this one mean x is equal to positive 1

        boolean test = false;
        System.out.println(!test); //print not test or opposite test



        //Modulus Operator (Arithmetic)
        int a=12;
        int b=5;                   // when 12 is divided by 5 =2 if i want to return the reminder number of 12/5 we use
        System.out.println(a/b);
        System.out.println(a % b);//the modulus operator %
    }


}
