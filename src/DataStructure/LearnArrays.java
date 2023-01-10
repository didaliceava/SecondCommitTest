package DataStructure;
//Data Structure are a group of data elements through which data are stored and
// organized in the computer so they can be used more efficiently.
// Data structure defines how data is organized, managed, and stored
//Data Structure in java is defined as the collection of data pieces that offers an effective means of storing and organising data in a computer.
// Linked List, Stack, Queue, and arrays are a few examples of java data structures.
public class LearnArrays {

    public static void main(String[] args) {
        int[]myArray=new int[5];
        myArray[0]= 5;
        myArray[1]= 5;
        myArray[2]= 5;
        myArray[3]= 5;

        int lenght1=myArray.length;
        System.out.println(lenght1);                 //Length!=Index , here index start at zero end at 4 because array length is 5
        System.out.println( myArray[1]);               // we can not just print myarray we have to add the index number [0]
        System.out.println(myArray[2]);


        int []myNewArray={12,15,10,5,6,4,4};
        int length=myNewArray.length;
        System.out.println(length);

    }                                                 // Array help hold more than one value of any datatype
                                                      // All non-primitive datatype are objects ,string is an object
                                                      // therefore ,we use the "new" keyword to create an object of this array
}                                                     //indexing is a way of traversing/accessing a data structure

