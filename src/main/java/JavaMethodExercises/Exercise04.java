package JavaMethodExercises;

/*
4. Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String str=scan.next();
        System.out.println(countAllVowels(str));

    }

    public static int countAllVowels(String str){

      String newStr = str.replaceAll("[^aeouiAEOUI]", "");

        return newStr.length();

    }
}
