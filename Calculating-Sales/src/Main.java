import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Product prices
        double[] prices = {2.98, 4.50, 9.98, 4.49, 6.87};

        Scanner input = new Scanner(System.in);
        int productNumber, quantity;
        double totalRetailValue = 0.0;

        // Read product number and quantity until the user enters a sentinel value
        while (true) {
            // Read product number
            System.out.print("Enter product number (1-5) or -1 to exit: ");
            productNumber = input.nextInt();

            // Check for sentinel value
            if (productNumber == -1) {
                break;
            }

            // Read quantity
            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            // Calculate retail value using switch statement
            switch (productNumber) {
                case 1:
                    totalRetailValue += prices[0] * quantity;
                    break;
                case 2:
                    totalRetailValue += prices[1] * quantity;
                    break;
                case 3:
                    totalRetailValue += prices[2] * quantity;
                    break;
                case 4:
                    totalRetailValue += prices[3] * quantity;
                    break;
                case 5:
                    totalRetailValue += prices[4] * quantity;
                    break;
                default:
                    System.out.println("Invalid product number. Please try again.");
                    continue;
            }
        }

        // Display total retail value
        System.out.printf("Total retail value of all products sold: $%.2f%n", totalRetailValue);
    }
}
