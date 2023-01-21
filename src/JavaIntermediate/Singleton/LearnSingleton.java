package JavaIntermediate.Singleton;

public class LearnSingleton {

    static LearnSingleton SingleObj ;

    private LearnSingleton (){
    }

  /*
   is a design that allows only one object of the class to be created
    Steps:
    1-declare a static  instance /global variable with class datatype
    2-declare the constructor as PRIVATE
    3-create getobject() method
    4-call getobject method to create object
   */

    public static  LearnSingleton getObj(){
        if (SingleObj==null){
            SingleObj=new LearnSingleton();
        }
         return SingleObj ;
}



}
