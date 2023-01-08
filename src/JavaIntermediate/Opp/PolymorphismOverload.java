package JavaIntermediate.Opp;

public class PolymorphismOverload {
    /*
    Polymorphism is two types
    *Run-time =method overriding
    *Compile-time =method overloading :
    1.Two methods in a class with same name
    2.The methods have different parameters (different Number,dataType or order of parameter)
     */

    public static void main(String[] args) {
        System.out.println("Value of Addition of two numbers is:"+addition(12,78));
        System.out.println("Value of Addition of three numbers is:"+addition(12,78,10));
        System.out.println("Value of Addition of two numbers int and short numbers is:"+addition(12,5));
        System.out.println("Value of Addition of two numbers Short and int numbers is:"+addition(5,12));
    }
    static int addition ( int num1,int num2){  // Two parameters
     return num1+num2;
 }

    static int addition ( int num1,int num2,int num3){ //same method different Number of parameters/Three parameters
        return num1+num2+num3;
    }
    static int addition ( int num1, short num2){ //same method , different datatype
        return num1;
    }
    static int addition ( short num2,int num1){ //same method different order of datatype , short is first
        return num1+num2;
    }
}
