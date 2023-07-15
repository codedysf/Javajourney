import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        multiply(5,10);
        divide(10,2);
        subtraction(40,30);
    }

    public static void welcome()
    {
        System.out.println("Welcome to Calculator");
    }

    public static void multiply(int a, int b)
    {
        System.out.println("The answer is " + a*b);

    }

    public static void divide(int a, int b)
    {
        System.out.println("The answer is " + a/b);

    }

    public static void subtraction(int a, int b)
    {
        System.out.println("The answer is " + (a-b));

    }


}