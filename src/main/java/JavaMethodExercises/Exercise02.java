package JavaMethodExercises;
/*
Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber=scan.nextDouble();
        System.out.println("Enter first number");
        double secondNumber=scan.nextDouble();
        System.out.println("Enter first number");
        double thirdNumber=scan.nextDouble();

        System.out.println("The average value is "+averageOfThreeNumbers(firstNumber,secondNumber,thirdNumber));

    }

    public static double averageOfThreeNumbers(double firstNumber, double secondNumber, double thirdNumber){

        double average =(firstNumber+secondNumber+thirdNumber)/3;
        return average;
    }


}
