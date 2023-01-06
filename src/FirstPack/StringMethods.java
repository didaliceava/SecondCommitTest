package FirstPack;

public class StringMethods {
	
	
	
	static String name="banana";
	static String secondName= "bananaa";

	public static void main(String[] args) {
	
		

		int a =name.length();
		
      System.out.println("the length of this string is:"+a);
		
	System.out.println(name.toUpperCase()); //print string with all capital
	System.out.println(name.trim());
	System.out.println(name.substring(0,3));
	System.out.println(name.indexOf("b"));
	
	
	//comparison of other numerical datatype we use the == sign
	int x=6;
	int y=5;
	
	boolean isSame=x==y;
	
	
	System.out.println(isSame);
		//to compare two strings we use (.equal method)
	
   isSame=name.equals(secondName);
	System.out.println(isSame);
	
	
	
	
	
	/**   // this  is called Doc comment
	 * doc string is used for documentation , it help us explain what methods are doing :
	 * example: see below method :
	 * This method will add the two numbers 
	 * @param num1= first number to add
	 * @param num2-second number to add 
	 * return sum-sum of num1 and num2
	 */
	
	}
	
static int addition(int num1,int num2) {
	int sum=num1+num2;
	return sum;
		
	}
	
	

}
