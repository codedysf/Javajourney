public class Auto {
    private int accountNumber;
    private String makeAndMode;
    private String state;


    //constructor

    public Auto(int accountNumber, String makeAndMode, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndMode = makeAndMode;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndMode(String makeAndMode) {
        this.makeAndMode = makeAndMode;
    }

    public String getMakeAndMode() {
        return makeAndMode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }



    public boolean  isNoFaultState ()
    {
        boolean noFaultState;
        switch (getState())
        {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
            default:
                noFaultState=false;
                break;
        }

        return noFaultState;
    }
}
