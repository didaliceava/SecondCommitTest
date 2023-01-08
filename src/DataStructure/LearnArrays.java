package DataStructure;

public class LearnArrays {

    public static void main(String[] args) {
        int[]myArray=new int[5];
        myArray[0]= 5;
        myArray[1]= 5;
        myArray[2]= 5;
        myArray[3]= 5;
        myArray[4]=10;                              //Length!=Index , here index start at zero end at 4 because array length is 5
        System.out.print( myArray[1]);               // we can not just print myarray we have to add the index number [0]
        System.out.print(myArray[2]);

        int []myNewArray={12,15,10,5,6,4,4};
    }                                                 // Array help hold more than one value of any datatype
                                                      // All non-primitive datatype are objects ,string is an object
                                                      // therefore ,we use the "new" keyword to create an object of this array
}                                                    //indexing is a way of traversing/accessing a data structure

