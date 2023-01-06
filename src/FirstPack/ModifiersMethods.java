package FirstPack;

public class ModifiersMethods {


    public static void main(String[] args) {
        myMethod();
        System.out.println(Operator.x); // this x is public from Operator class
    }

    //public-access by all packages\classes of the same project
    //private-access in the same class only
    //protected -access to all classes of the same package
    //default - when no modifier is declared - access to the classes of same package

    public static void myMethod() {
        System.out.println("this is my Method ");
    }

}
