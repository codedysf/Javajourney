import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer grades in the rang 0-100");
        System.out.println("to terminate input Use <Ctrl> d then press enter");

        // loop until user enter the end of file indicator

        while (input.hasNext())
        {
            int grade = input.nextInt();
            total += grade;

            ++gradeCounter;

            // increment appropriate letter-grade counter
            switch (grade / 10)
            {
                case 9: // grade was btw 90
                case 10:// and 100, inclusive
                    ++aCount;
                    break; // exits switch

                case 8: // grade was btw 80 and 89
                    ++bCount;
                    break; // exits switch

                case 7: // grade was btw 70 and 79
                    ++cCount;
                    break; // exits switch

                case 6: // grade was btw 60 and 69
                    ++dCount;
                    break; // exits switch

                default: // grade was less than 60
                    ++fCount;
                    break; // optional ; exit switch anyway


            }// end switch
        }

        System.out.println("Grade result");

        // if user entered at least one grade...
         if (gradeCounter != 0)
        {
        // calculate average of all grades entered
        double average = (double) total / gradeCounter;

        // output summary of results
         System.out.printf("Total of the %d grades entered is %d%n",gradeCounter, total);
         System.out.printf("Class average is %.2f%n", average);

         System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", aCount, // display number of A grades
                "B: ", bCount, // display number of B grades
                "C: ", cCount, // display number of C grades
                "D: ", dCount, // display number of D grades
                "F: ", fCount); // display number of F grades
         } // end if
         else // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
    }// end main// end class LetterGrade
}