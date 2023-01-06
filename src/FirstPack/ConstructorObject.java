package FirstPack;



public class ConstructorObject {
	/*
	 * Constructor :implicit to every class , whether you explicitly declare it or not 
	
	 Constructor joj is to create or construct objects of class//always have the same name as the class +()
	 once a constructor is declared , it becomes a user defined the one in the java background disappears see below 
	 constructor job is instantiation objects of classes //instantiate =represent with example  example or single occurrence of something.
    */
	ConstructorObject (){ // user defined constructor 
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		/*
		 
		 int age=21;
		 * when we declare a variable:
		 * datatype
		 * name
		 * assigment operator=
		 * value of variable
		 * 
		  to create object of class it is the same process 
		  datatype of the class is the name of the class (user defined class are one of the non primitive datatype :Arrays,user defined class,Strings, interfaces)
		
		 */
		
		
		                                                 //the keyWord "New" help us create a new object of the class
		ConstructorObject obj= new ConstructorObject();  // new ConstructorObject(); means new object or new instance of class //
		                                                 // -store its value in obj new add the constructor because the constructor build objects of class
        String name = "dida";
	
        
        System.out.println(obj);
		
	}

}
