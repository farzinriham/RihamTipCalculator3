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
        System.out.print("Welcome to the Useless Restaurant!");
        System.out.println(" I am your Tip Calculator for today!");
        System.out.print("How many people do we have dining on this fine day?");
        int groupAmount = scan.nextInt();
        System.out.print("Please enter the tip percentage for today. (0-100)");
        double tipPercent = scan.nextDouble();
        System.out.println("We have our special menu with fixed prices for meals, or you can just choose your own order.");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println(" ");
        System.out.println("~ Menu ~");
        System.out.println(" ");
        System.out.println("rocks: $2.00");
        System.out.println("sticks: $3.00");
        System.out.println("small dominos pizza (recommended for 52 people): $1500");
        System.out.println("water: $10.00");
        System.out.println("oxygen: $25.00");
        System.out.println("cheese: $45.00");
        System.out.println(" ");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println(" ");
        double userInput = 0;
        double totalCost = 0;
        int userAns = 0;
        String userItem = " ";
        List<String> itemNames = new ArrayList<>();
        while (userAns != -1) {
            System.out.print("What is the item you wish to order?");
            scan.nextLine();
            userItem = scan.nextLine();
            itemNames.add(userItem);
            System.out.print("Please type the price of the item in dollars and cents, eg. 12.50 (-1 if you finish ordering).");
            userInput = scan.nextDouble();
            totalCost += userInput;
            System.out.print("Do you wish to continue ordering? Type 1 to continue, or -1 if not.");
            userAns = scan.nextInt();
        }

        System.out.println(" ");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println(" ");
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
        System.out.println("Items Ordered: " + itemNames);
        System.out.println(" ");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
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
