import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Calculating product of odd numbers");

        int product= 1;

       for (int i = 0 ; i <=15; i++)
           if (i % 2 == 1)

           {
                product= product*i;
               System.out.println(product);

           }


    }
}