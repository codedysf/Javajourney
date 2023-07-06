import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String name;
        welcome welcomeMessage = new welcome();

        Scanner input = new Scanner(System.in);

        System.out.println("THE INFO PLATFORM");

        System.out.print("enter your name : ");

        name = input.next();
        welcomeMessage.setWelcome(name);

        System.out.println(name + " " + welcomeMessage);
    }
}