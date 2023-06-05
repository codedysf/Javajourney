import java.util.Scanner;

public class Email  {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private  String email;
    private  String companySuffix = "codedysf.com";
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private int mailboxCapacity = 500;


    // constructor to receive the firstName and the lastName

    public Email ( String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;



        // Call method asking for department - return the department
        this.department= setDepartment();



        //Call a method that return a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for the department (this is a method)

    private String setDepartment()
    {
        System.out.print("New worker:" + firstName + ". Department Codes:\n1 for sales\n2 for Development\n3 for Accounting\nENTER YOUR DEPARTMENT CODE:  ");
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


    //Generate a random password (this is the method)
    private String randomPassword(int length)
    {
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        //Array
        char[] password = new char[length];
        for (int i=0; i<length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    // set and get the mail capacity

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    //set  and get the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    //change the password


    public void changePassword(String password) {
        this.password = password;
    }

    public String showInfo()
    {
        return "DISPLAY NAME: " +firstName + " " + lastName +
                "\nCOMPANY MAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " mb" ;
    }

}
