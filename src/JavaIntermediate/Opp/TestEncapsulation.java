package JavaIntermediate.Opp;

public class TestEncapsulation {
    public static void main(String[] args) {


        Encapsulation obj=new Encapsulation();
        obj.name="did";                           // This is read and white access can change the value of the name
        String Id=obj.getEmployeeId();           // This is read only access can not change the value of employee Id , see Encapsulation class
        System.out.println (Id);


        int mySalary= obj.getSalary();                  //here i am returning the value of the private variable using get and saving it in mySalary
        System.out.println("my salary is :"+mySalary);
        obj.setSalary(2000000);                        //Here i am giving a new value to get i am setting it to 2000000
        mySalary= obj.getSalary();                       //the new value is reassigned to variable mySalary
        System.out.println("My New Salary is "+mySalary);

    }
}
