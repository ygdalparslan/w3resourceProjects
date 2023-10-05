package JavaMethodExercises;

import java.util.Scanner;
/*
3. Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is odd there will be one middle characters.
b) If the length of the string is even there will be two middle character.
Test Data:
Input a string: 350
Expected Output:
The middle character in the string: 5
*/
public class Exercise03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println("The middle character in the string: " + displayMiddleChar(str));

    }

    public static String displayMiddleChar(String str) {

        int firstChr = str.length() / 2;
        int lastChr = str.length() / 2;

        if (str.length() % 2 == 0) {
            return str.substring(firstChr-1, lastChr+1);

        } else {
            return str.substring(firstChr, lastChr+1);
        }


    }


}
