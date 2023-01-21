package ControlFlow;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class test {
    public static void main(String[] args) {
        printEachLetter("jaVA is An IsLand");
    }
    public static void printEachLetter(String text){
        char[]arr=text.toLowerCase().toCharArray();
        int length= arr.length;


        for (int i=0; i<length; i++){  //the max index of any array is lenght-1 //here we can not put i<=length because the index start at 0 and we have 17 characters
            System.out.print(arr[i]);
        }

    }
}
