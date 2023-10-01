package JavaMethodExercises;

import java.util.Scanner;

public class Exercise06 {
/*
6. Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter an integer");
        int num=scanner.nextInt();

        System.out.println(computeSumOfDigits(num));
    }

    public static int computeSumOfDigits(int num){
        int sum=0;

        while (num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }


}
