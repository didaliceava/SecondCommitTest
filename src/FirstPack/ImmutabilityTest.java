package FirstPack;

public class ImmutabilityTest {


    public static void main(String[] args) {


        String name= "dida";
        String name2= "dida";
        String name3= new String("dida");// here i reserved a new space in me


        System.out.println(name==name2); //== compare the actual object and since we created a whole new object for mane3 then it gives false
        System.out.println(name==name3);

        System.out.println(name.equals(name2));  //.equals compare the value in the object
        System.out.println(name.equals(name3));


    }
}
