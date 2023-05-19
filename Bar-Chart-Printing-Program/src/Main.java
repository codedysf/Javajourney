import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        // Read five numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            numbers[i] = input.nextInt();
        }

        // Display the bar charts
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
