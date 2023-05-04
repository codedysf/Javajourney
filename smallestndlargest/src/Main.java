import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Calculate sum
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);

        // Calculate average
        int average = sum / 3;
        System.out.println("Average: " + (double)average);

        // Calculate product
        int product = num1 * num2 * num3;
        System.out.println("Product: " + product);

        // Find smallest and largest
       if (num1 > num2 && num1 > num3){
           System.out.println(num1 + " is the biggest");
       } else if (num2 > num1 && num2 > num3) {
           System.out.println(num2 + " is the biggest");

       } else {
           System.out.println(num3 + " is the biggest");
       }

        if (num1 < num2 && num1 < num3){
            System.out.println(num1 + " is the smallest");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest");

        } else {
            System.out.println(num3 + " is the smallest");
        }
    }
}
