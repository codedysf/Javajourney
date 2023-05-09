import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // Employee objects that display two Employee Account
        Employee myemployee1 = new Employee("BABATUNDE", "OJO", 300);
        Employee myemployee2 = new Employee("YUSUF","KELVIN", 200);

        // display the initial values
        System.out.println("EMPLOYEE1 DETAILS");
        System.out.println("Employee name  " + myemployee1.getFirstName() + " " +  myemployee1.getLastName());
        System.out.println("Employee Salary " + myemployee1.getMonthlySalary());

        System.out.println();// to create space

        // display the current values
        System.out.println("EMPLOYEE2 DETAILS");
        System.out.println("Employee name  " + myemployee2.getFirstName() + " " + myemployee2.getLastName());
        System.out.println("Employee Salary  " + myemployee2.getMonthlySalary());


        System.out.println();// to create space


        // to raise the employee salary
        System.out.println("Enter 10% raise for Employee1 salary ");
        Scanner input = new Scanner(System.in);// to get input from user
        double salary = input.nextDouble();
        myemployee1.employeerise(salary);

        // to print the current values of Employee1
        System.out.println("EMPLOYEE1 DETAILS");
        System.out.println("Employee name  " + myemployee1.getFirstName() + " " +  myemployee1.getLastName());
        System.out.println("Employee Salary " + myemployee1.getMonthlySalary());





    }
}