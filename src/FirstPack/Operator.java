package FirstPack;

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
    }


}
