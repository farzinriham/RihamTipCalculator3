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
        String userAns = "";
        while (userAns == "no") {
            System.out.println("What is the item you wish to order? Please type in dollars and cents, eg. 12.50 (-1 if you finish ordering).");
            userInput = scan.nextDouble();
            totalCost += userInput;
            System.out.println("Do you wish to order more? Type no if not.");
            userAns = scan.nextLine();
        }
        System.out.println("test totalCost: " + totalCost);
    }
}
