import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter radius");
        double radius = input.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("diameter = " + diameter);
        System.out.println("circumference = " + circumference);
        System.out.println("Area = "+ area);

    }
}