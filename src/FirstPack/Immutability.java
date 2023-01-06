package FirstPack;

public class Immutability {

	public static void main(String[] args) {
		 
		   String name ="dida";                   //String pool reserve one memory place for both name and otherstudent name because the value is the same "dida"
		   String otherStudentName= "dida";     //Strings are immutable /not changebale because their place holder in the memory is unchengable but the variable can be changed
		
	
		
		
		String thirdStudent=new String("dida");
	                                                  // String value does not change in the memory when a new string is created with the same value "dida"
		                                              //but when a new object is created a new place in the memory is created for the same value "dida"
		boolean result=name.equals(otherStudentName);
		System.out.println(result);
		
		
	}

}
