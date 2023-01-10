package ControlFlow;

import java.util.ArrayList;
import java.util.List;

public class LearnLoops {

/*For LOOP
used when we know how many iterations we need to loop.*/

    public static void main(String[] args) {
        String name= "Ava"; //print name 5 times
        for (int x=0; x <5; x++  ){       // 1- statement : where the condition starts int x=0;
            System.out.println("\t"+name);  //2-statement : condition under which the loop will continue iterating
        }                                //3-what is performed at the end of each iteration


/*For-EACH LOOP
Used typically with data structure , used when we dont know the number of iterations needed */
         List<String> myArray=new ArrayList<String >();
        myArray.add("15");
        myArray.add ("15");
        myArray.add("dida");
        myArray.add("a");
           for  (String S: myArray){
               System.out.println( S);
        }

          int [] myarray={12,3,45,26,12,14,50};
          for ( int x:myarray) {
            System.out.print("\t"+x);

        }




    }



}
