import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;


        System.out.print("Enter your first integer:  ");
        num1 = input.nextInt();

        System.out.print("Enter your second integer:  ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.printf("The sum is = %d%n", sum);


    }
}