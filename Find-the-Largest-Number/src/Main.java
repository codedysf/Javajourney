import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

      int largest = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;

      for (int i = 1; i <= 10; i++)
      {
          System.out.println("Enter number " + i + " : ");
          int number = input.nextInt();

          if (number > largest)
              largest = number;
          if (number < smallest)
              smallest = number;
      }

        System.out.println(" this is the largest " + largest);
        System.out.println(" this is the smallest " + smallest);
    }
}