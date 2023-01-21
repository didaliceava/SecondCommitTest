package JavaIntermediate.exception_handling; //03-27-2022

public class ExceptionHandling {


    public static void main(String[] args) {
try {
    divisionByZero();
}catch (ArithmeticException AE) {

    System.out.println("can not divide by zero");
}


//        int[] arr = {1, 2, 3};
//        for (int i = 0; i < arr.length; i++) {
//
//            try {
//                System.out.println(arr[i] ); //if no error ,it gets executed /but when there is an error(arithmetic) ,
//                //throw  new ArrayIndexOutOfBoundsException();// throw  new ArithmeticException();                        //it skips it and goes to the catch arithmetic error.
//            }
//
//              catch (ArithmeticException ae){
//                System.out.println("can not divide by 0");  //this gets executed when there is an arithmetic error or we manually throw an arithmetic error
//
//              }
//
//
//            catch (ArrayIndexOutOfBoundsException aei) {
//                System.out.println("you need to check your index, it is out of bound");
//
//            }
//
//        }
    }

public static void divisionByZero() throws ArithmeticException { //the throws keyword indicate that the method may have an exceptions
    System.out.println(10/0);
}

}
