/* Name: Farzin Riham
Teacher: Mr Miller
Unit 1 Tip Calculator Project
Sources:
    -Rounding: https://stackoverflow.com/questions/8825209/rounding-decimal-points
    -Lists: https://stackoverflow.com/questions/13395114/how-to-initialize-liststring-object-in-java
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RihamTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Everything Restaurant!");
        System.out.print("I am your Tip Calculator for today!");
        System.out.print("How many people do we have dining on this fine day?");
        int groupAmount = scan.nextInt();
        System.out.println("Please enter the tip percentage for today. (0-100)");
        double tipPercent = scan.nextDouble();
        System.out.println("We have our special menu with fixed prices for meals, or you can just choose your own order.");
        double userInput = 0;
        double totalCost = 0;
        int userAns = 0;
        String userItem = " ";
        List<String> itemNames = new ArrayList<>();
        while (userAns != -1) {
            System.out.println("What is the item you wish to order? Please type in dollars and cents, eg. 12.50 (-1 if you finish ordering).");
            userItem = scan.nextLine();
            itemNames.add(userItem);
            System.out.println("Please type the price in dollars and cents, eg. 12.50 (-1 if you finish ordering).");
            userInput = scan.nextDouble();
            totalCost += userInput;
            System.out.println("Do you wish to continue ordering? Type 1 to continue, or -1 if not.");
            userAns = scan.nextInt();
        }
        double totalCostRound = Math.round(totalCost * 100.0) / 100.0;
        System.out.println("Total Bill Before Tip: $" + totalCost);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        double tipDecimal = tipPercent/100;
        double totalTip = tipDecimal*totalCost;
        double totalTipRound = Math.round(totalTip * 100.0) / 100.0;
        System.out.println("Total Tip: $" + totalTipRound);
        double newBill = totalCost+totalTip;
        double newBillRound = Math.round(newBill * 100.0) / 100.0;
        System.out.println("Total Bill With Tip: $" + newBillRound);
        double perPersonOld = totalCost/groupAmount;
        double perPersonORound = Math.round(perPersonOld * 100.0) / 100.0;
        System.out.println("Per Person Cost Before Tip: $" + perPersonORound);
        double perPersonTip = totalTip/groupAmount;
        double perPersonTRound = Math.round(perPersonTip * 100.0) / 100.0;
        System.out.println("Per Person Tip: $" + perPersonTRound);
        double perPersonNewCost = newBill/groupAmount;
        double perPersonNCRound = Math.round(perPersonNewCost * 100.0) / 100.0;
        System.out.println("Total Cost Per Person: $" + perPersonNCRound);
        System.out.print("Please enter your credit card's budget (not ur credit card number, don't get robbed stupid): ");
        double userBudget = scan.nextDouble();
        if (userBudget < newBillRound) {
            System.out.println("GET OUT OF MY RESTAURANT YOU BROKE LOSER! AND GET A JOB!");
        } else {
            System.out.println("Transaction successful! Your meal will be prepared in 10 seconds..."); //How do I add wait commands in java?
            System.out.println("Enjoy your meal!");
        }
    }
}
