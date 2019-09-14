// Hamza Yousaf
// 9/10/2019
// Java Saving Account


import java.util.*;
public class chap2_213 {
    public static void main(String[] args) {
        // main method
        Scanner input = new Scanner(System.in);

        //inputting monthly deposit
        System.out.print("Enter the amount to be saved for each month: ");
        double monthlyDeposit = input.nextDouble();

        // inputting interest rate
        System.out.print("Enter the annual Interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        //inputting months
        System.out.println("Enter the number of Months: ");
        int numberOfMonths = input.nextInt();
        double currentValue =
                monthlyDeposit * (1 + monthlyInterestRate);
        for (int i = 1; i < numberOfMonths; i++)
        {
            currentValue = (currentValue + monthlyDeposit) * (1 + monthlyInterestRate);
        }
        System.out.println("After the " + numberOfMonths + "th month, the account value is " + currentValue);


    }


}
