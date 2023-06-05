import java.util.Scanner;

public class Email  {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;


    // constructor to receive the firstName and the lastName

    public Email ( String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED :  " + this.firstName + " " + this.lastName);


        // call method asking for department - return the department
        this.department= setDepartment();
        System.out.println("Department:  " + this.department);

    }

    // Ask for the department (this is a method)

    private String setDepartment()
    {
        System.out.print("DEPARTMENT CODE\n1 for sales\n2 for Development\n3 for Accounting\nENTER YOUR DEPARTMENT CODE");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if (depChoice == 1){
            return "sale";
        } else if (depChoice == 2) {
            return "Development";

        } else if (depChoice == 3) {
            return "Accounting";

        }else {
            return "" ;
        }

    }


        //generate a random password

    // set the mail capacity

    //set the alternate email

    //change the password


}
