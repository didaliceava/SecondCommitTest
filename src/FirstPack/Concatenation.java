package FirstPack;

import org.w3c.dom.ls.LSOutput;

public class Concatenation {

static String word1= "Hello";
static String space="   ";
static String word2= "java";

   static String quote="\"When you win say nothing , when you loose say less\"\n\t\t\t\t\t-Wayne Gretzkyy\b"; //the \b deletes characters

    public static void main(String[] args) {
        //string concat
        System.out.println(  "Hello"+ "    "+"java"); // we use the + sign to concat two strings
        System.out.println(word1+space+word2);        // the + sign here

        // Numerical Concat
        int x=10;
        int y=5;
        System.out.println(x+y); // when + sing is used with different datatype it behaves differently , it adds the values

        //Escape character '\' escape line \n, escape next tab \t,

        System.out.println(quote);

        int a=10;
        int b=100;
        int c=100;


        System.out.println("\t" + a+"\n"+b+ "\t\t" + c);  //This will print three numbers forming a triangle




    }

}
