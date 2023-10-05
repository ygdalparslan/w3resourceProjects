package JavaMethodExercises;

import java.util.Scanner;

/*
8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue
1            1104.71
2            1220.39
3            1348.18
4            1489.35
5            1645.31
 */
public class Exercise08 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        double investment = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int year = scanner.nextInt();

        rate *= 0.01;

        System.out.printf("%-6s   %-20s\n","Years","FutureValue");

        for(int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
