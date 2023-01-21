package JavaIntermediate.Opp.Abstraction;

public class TestAbstract {


    public static void main(String[] args) {


        AbstractParent obj =new AbsChild();  //we cant instantiate an abstract class, but we can use the abstract class to define the datatype of the ref
        System.out.println(obj.isThisTrue()); // to instantiate a child of the abstract class.
        obj.doSomeThing();                     // this prints the implemented method in child class

        AbsChild ob=new AbsChild();
       // ob.name= "diida"; here cannot change the name from dida because it is declared as final in Abschild class
       //AbsChild.name= "diiida";


    }











}
