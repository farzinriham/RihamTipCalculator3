import java.util.Scanner;

public class RihamTipCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator! What is the first item you wish to order today?");
        System.out.println("How many people do we have dining on this fine day?");
        int groupAmount = x.nextInt();
        System.out.println("We have our special menu with fixed prices for meals, or you can just choose your own order.");
    }
}
