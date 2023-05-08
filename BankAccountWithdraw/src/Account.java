public class Account {


    // instance variable
    private String name;
    private double balance;

    //Account constructor that receives two parameters
    public Account(String name, double balance){

        this.name = name;

        if (balance > 0.0)
            this.balance=balance;

    }

    // method that deposits (adds) only a valid amount to the balance
    public void withdraw(double withdrawAmount){

        if (withdrawAmount > balance)
            System.out.println("Withdrawal amount exceeded account balance");
        else
            balance = balance - withdrawAmount;

    }

    //method to get name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }


}
