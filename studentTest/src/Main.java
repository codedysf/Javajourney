import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // to create 2 object of the class student
        student student1 = new student("Babatunde",93.5);
        student student2 = new student("Yusuf", 82.75);

        // to print the initial value
        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());

        // to accept input
        Scanner input = new Scanner(System.in);


        System.out.print("enter your Name : ");// prompt
        String theName = input.nextLine();
        student1.setName(theName);// set the name

        System.out.print("enter your average score :  ");// prompt
        double score = input.nextDouble();
        student1.setAverage(score);//set the average

        System.out.println();

        // print the update value
        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());

    }

}