public class account {

    private String name;
    private double account;


    // constructors

    public account(String name, double account)
    {
        this.name=name;
        this.account=account;
    }

    // set and get


    public String getName() {
        return name;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        if (account < 0.0)
            throw new IllegalArgumentException("Enter a valid amount");
        this.account = account;
    }
}
