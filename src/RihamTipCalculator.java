import java.util.Scanner;

public class RihamTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Everything Restaurant!");
        System.out.println("I am your Tip Calculator for today!");
        System.out.println("How many people do we have dining on this fine day?");
        int groupAmount = scan.nextInt();
        System.out.println("Please enter the tip percentage for today. (0-100)");
        double tipPercent = scan.nextDouble();
        System.out.println("We have our special menu with fixed prices for meals, or you can just choose your own order.");
        double userInput = 0;
        double totalCost = 0;
        int userAns = 0;
        while (userAns != -1) {
            System.out.println("What is the item you wish to order? Please type in dollars and cents, eg. 12.50 (-1 if you finish ordering).");
            userInput = scan.nextDouble();
            totalCost += userInput;
            System.out.println("Do you wish to continue ordering? Type 1 to continue, or -1 if not.");
            userAns = scan.nextInt();
        }
        System.out.println("Total Bill Before Tip: " + totalCost);
        double tipDecimal = tipPercent/100;
        double totalTip = tipDecimal*totalCost;
        System.out.println("Total Tip: " + totalTip);
    }
}
