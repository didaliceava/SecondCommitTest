package JavaIntermediate.Opp.Abstraction;

public class AbsChild extends AbstractParent implements FedReserve, FedReserve2 {
// any subclass of an abstract class must implement ALL THE ABSTRACT methods or become an abstract class

    final public static String name = "dida";


    public static void main(String[] args) {
        System.out.println(FedReserve2.rate);   //interfaces attributes are, by default public, static and final
        System.out.println(FedReserve.rate);
    }
    //This is the inheritance using EXTEND:

    @Override
    void doSomeThing() {
        System.out.println("This is the implemented method Do Something");
    }

    @Override
    boolean isThisTrue() {System.out.println("This is the implemented abstract method");
        return true;
    }

    //This is the IMPLEMENTATION using IMPLEMENTS (Interfaces):
    @Override
    public void myName1() {
    }

    @Override
    public void myName2() {
    }


}
