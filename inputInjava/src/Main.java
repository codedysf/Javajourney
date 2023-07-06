import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Getting input from user

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter your name : ");
        String name = input.next();

        System.out.println("My name is " + name);
    }
}