import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of customers
        System.out.print("Enter number of customers: ");
        int numCustomers = input.nextInt();

        // Process each customer
        for (int i = 1; i <= numCustomers; i++) {
            // Input customer information
            System.out.printf("Enter information for customer %d:%n", i);
            System.out.print("Account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.print("Total of all items charged this month: ");
            int charges = input.nextInt();
            System.out.print("Total of all credits applied this month: ");
            int credits = input.nextInt();
            System.out.print("Allowed credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + charges - credits;

            // Check if new balance exceeds credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            // Output new balance
            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);
        }
    }
}
