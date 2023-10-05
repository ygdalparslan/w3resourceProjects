package JavaMethodExercises;

/*
1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Exercise01 exercise01 = new Exercise01();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");

        int firstNumber =input.nextInt();
        System.out.println("Enter second number");
        int secondNumber =input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber =input.nextInt();

        System.out.println("The smallest value is " +smallestNumber(firstNumber, secondNumber, thirdNumber));
        System.out.println("The smallest value is " +smallestNumber2(firstNumber, secondNumber, thirdNumber));

    }

    //first way
    public static double smallestNumber(int firstNumber, int secondNumber, int thirdNumber) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(firstNumber);
        arr.add(secondNumber);
        arr.add(thirdNumber);

        int min=arr.get(0);

        for (Integer w :arr){
            min=Math.min(min,w);
        }
        return min;
    }

    //second way
    public static double smallestNumber2(int firstNumber, int secondNumber, int thirdNumber){
        return Math.min(Math.min(firstNumber,secondNumber),thirdNumber );
    }
}
