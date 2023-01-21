package JavaIntermediate.practice_exercises;

public class StringReverse {

    static String sentence = "we are learning how to reverse a string";

    public static void main(String[] args) {

        char[] sentenceArr = sentence.toCharArray(); //this method (toCharArray) splits the string into single characters, stores it in an array ,and returns a character array
        int n = sentenceArr.length;
        for (int i = n - 1; i >=0; i--) {
            System.out.print(sentenceArr[i]);

        }
    }
}
