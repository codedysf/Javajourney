import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        // Input miles driven and gallons used for each trip
        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            // Calculate miles per gallon for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update total miles and gallons
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate combined miles per gallon up to this point
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to this point: %.2f%n", combinedMpg);
        }
    }
}
