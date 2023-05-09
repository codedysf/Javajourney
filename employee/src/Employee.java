public class Employee {

    // instance variable
    private String firstName;
    private String lastName;
    private double monthlySalary;


    //constructor that initializes the three instance variables
    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
    }
    // Getter and setter method for firstname
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    // Getter and setter method for lastname
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // Getter and setter method for monthlySalary
    public void setMonthlySalary(double monthlySalary)
    {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
           this.monthlySalary = 0.0;
    }

    public double getMonthlySalary()

    {
        return monthlySalary;
    }

    public void employeerise(double increment)
    {
        if (increment > 0.0)
            monthlySalary= monthlySalary + increment;

    }
}
