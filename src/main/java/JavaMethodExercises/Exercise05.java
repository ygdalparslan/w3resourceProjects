package JavaMethodExercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
 */
public class Exercise05 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();

        int wordCount= countAllWords(str);
        System.out.println("Number of words in the string: "+wordCount);

    }

    public static int countAllWords(String str){

   String newStr[]=str.split(" ");

   return newStr.length;
    }
}
