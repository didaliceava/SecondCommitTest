package FirstPack;



public class ConstructorObject {
	/*
	 * Constructor :is part of the class, implicit to every class , whether you explicitly declare it or not
	
	 Constructor joj is to create or construct objects of class//always have the same name as the class +()
	 once a constructor is declared , it becomes a user defined the one in the java background disappears see below 
	 constructor job is instantiation objects of classes //instantiate =represent with example  example or single occurrence of something.
    */
	ConstructorObject (){ // user defined constructor // same name as class
		                  // first letter is capital not like method lowercase and has no return type exp: void, int, string
		
	}
	
	
	public static void main(String[] args) {
		/*
		 
		 int age=21;
		 * when we declare a variable:
		 * datatype
		 * name
		 * assignment operator=
		 * value of variable
		 * 
		  to create object of class it is the same process 
		  datatype of the class is the name of the class (user defined class are one of the non primitive datatype :Arrays,user defined class,Strings, interfaces)
		
		 */
		
		
		                                                 //the keyWord "New" help us create a new object of the class tht is stored in Heap
		ConstructorObject obj= new ConstructorObject();  // the name "Obj" is the reference is not the  actual object , the object is New Constructor
		                                                  // and OBJ refers to it and has all the operations of it
		                                                   // new ConstructorObject(); means new object or new instance of class // instantiate a new objet means create an instance of the class
		                                                 // -store its value in obj new add the constructor because the constructor build objects of class
        String name = "dida";
	
        
        System.out.println(obj);
		
	}

}
