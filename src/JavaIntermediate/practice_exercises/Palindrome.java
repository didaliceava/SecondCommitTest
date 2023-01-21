package JavaIntermediate.practice_exercises; //03-27-2022

public class Palindrome {

    static String word="racecar";

    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.reverseString(word);
    }


    boolean isPalindrome(String text){
        boolean isPalindrome=false;

        return  isPalindrome;
    }

    String reverseString(String input){
       String reversed;


        char[]inputArray=input.toCharArray();
        int n=inputArray.length;
        char[] reversedArray=new char[n];

          int j=0;
          for (int i=n-1;i>=0;i--) {
              reversedArray[j]=inputArray[i]; //the value of input array at index 6(i=6) and put it at reverse array at index 0
              j++;
          }
         reversed= String.valueOf(reversedArray);
         return reversed;
    }



}
