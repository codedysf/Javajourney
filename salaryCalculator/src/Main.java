import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input information for employee 1
        System.out.print("Enter hours worked by employee 1: ");
        int hours1 = input.nextInt();
        System.out.print("Enter hourly rate for employee 1: ");
        double rate1 = input.nextDouble();

        // Calculate gross pay for employee 1
        double pay1;
        if (hours1 <= 40) {
            pay1 = hours1 * rate1;
        } else {
            pay1 = 40 * rate1 + (hours1 - 40) * rate1 * 1.5;
        }

        // Input information for employee 2
        System.out.print("Enter hours worked by employee 2: ");
        int hours2 = input.nextInt();
        System.out.print("Enter hourly rate for employee 2: ");
        double rate2 = input.nextDouble();

        // Calculate gross pay for employee 2
        double pay2;
        if (hours2 <= 40) {
            pay2 = hours2 * rate2;
        } else {
            pay2 = 40 * rate2 + (hours2 - 40) * rate2 * 1.5;
        }

        // Input information for employee 3
        System.out.print("Enter hours worked by employee 3: ");
        int hours3 = input.nextInt();
        System.out.print("Enter hourly rate for employee 3: ");
        double rate3 = input.nextDouble();

        // Calculate gross pay for employee 3
        double pay3;
        if (hours3 <= 40) {
            pay3 = hours3 * rate3;
        } else {
            pay3 = 40 * rate3 + (hours3 - 40) * rate3 * 1.5;
        }

        // Output results
        System.out.printf("Gross pay for employee 1: $%.2f%n", pay1);
        System.out.printf("Gross pay for employee 2: $%.2f%n", pay2);
        System.out.printf("Gross pay for employee 3: $%.2f%n", pay3);
    }
}
