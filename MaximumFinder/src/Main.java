import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point values separated by spaces: ");

        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double num3 = input.nextInt();

        // determine the maximum value
        double result =  maximum(num1,num2,num3);

        // display maximum value
        System.out.println("Maximum is " + result);
    }

    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z)
    {
        double maximumValue = x;  // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue)
            maximumValue = y;
        // determine whether z is greater than maximumValue
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }
}