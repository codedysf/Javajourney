import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // weight in pounds and height

        System.out.println("Enter weight in pound ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches ");
        double height = input.nextDouble();

        double BIM = weight / height * height;

        if (BIM < 18.5){
            System.out.println(BIM + " Underweight");
        } else if(BIM >= 18.5 && BIM <= 24.9)
        {
            System.out.println(BIM + " Normal");
        } else if (BIM >= 25 && BIM <= 29.9)
        {
            System.out.println(BIM + " Overweight");
        } else if (BIM >= 30)
        {
            System.out.println(BIM + " Obese");
        }else {

            System.out.println("");
        }


    }
}