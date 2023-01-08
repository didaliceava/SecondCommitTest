package FirstPack;

public class Casting {
	
	  //widening Casting
		static 	short myShort=1245;
		static 	int intoInt;
	    static	long intoLong;
			
		
		
	
		

	   public static void main(String[] args) {

		
		   intoInt=(int)myShort;      // going from small datatype into big datatype , we can tell it to change the short to integer datatype
		   intoLong=myShort;
		  System.out.println(intoInt);

		
		
		//Narrowing
	     int num1=50000;
		 short shortNum= (short)num1;
		System.out.println(shortNum);     //when we print this , it misses up because there is data loss
	
		
		double myDouble=50.55552511111111111; // this double number canot fit inside a float below
		float myFloat=(float)myDouble;  //this is telling the program to take the double value and store it inside a float datatype 
		System.out.println(myFloat);
		
		
		//Primitive to Non-Primitive ...
		
		
		int age=25;
		String AgetoString= String.valueOf(age);
		System.out.println(AgetoString);
		
	
		//Non-Primitive to Primitive//Wrapper Classes  // all datatypes have wrapper classes 
		
		String myAge="25";
		
		int myNumericAge= Integer.valueOf(myAge); // here the keyword Integer is a class because it starts with Capital, it is a wrapper class
		System.out.println(myNumericAge);
		
		int x=myNumericAge+5;  // here i am able to do a numerical operation (addition) on my age because it is converted from string to int
		System.out.println(x);

	} 
	
	
	
}
