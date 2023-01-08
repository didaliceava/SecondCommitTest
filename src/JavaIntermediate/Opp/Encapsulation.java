package JavaIntermediate.Opp;

public class Encapsulation {
    /*
    Encapsulation is data hiding that limits direct access to certain data , such as private instance variables, object components.
     //Data Hiding
     Read Only Access
     Read /Write Access
     No Access

     */
    String name="dida";
    private String EmployeeId="datmane154";
    private int Salary=120000;

    //Getter : Getter is a method that return a value that sits as private in a class
    String getEmployeeId () { //read only access //This is Default access , which is same as protected access in the same pack only
    return this.EmployeeId;
}
      //Setter : give a read and write access
       void setEmployeeId(String EmployeeId){    // with the setter method , i can take the private EmployeeId value
       this.EmployeeId=EmployeeId;              // and change it and store it in the parameter in the setter method
}

   int getSalary(){
   return this.Salary;
   }
   void setSalary(int salary ){
   this.Salary=salary;
   }


}
