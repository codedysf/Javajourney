public class invoice {

    private String partNumbers;
    private String partDiscription;
    private int quantity;
    private double pricePeritem;


    public invoice(String partNumbers, String partDiscription, int quantity,double pricePeritem)
    {
        this.partNumbers = partNumbers;
        this.partDiscription = partDiscription;
        this.quantity=quantity;
        this.pricePeritem=pricePeritem;
    }

    // Getter and Setter methods for pricePerItem
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    // Getter and Setter methods for pricePerItem
    public double getPricePeritem() {
        return pricePeritem;
    }

    public void setPricePeritem(double pricePeritem) {
        if (pricePeritem > 0) {
            this.pricePeritem = pricePeritem;
        } else {
            this.pricePeritem = 0.0;
        }
    }

    // Getter and Setter methods for getPartDiscription
    public String getPartDiscription() {
        return partDiscription;
    }

    public void setPartDiscription(String partDiscription) {
        this.partDiscription = partDiscription;
    }

    // Getter and Setter methods for getPartNumbers
    public String getPartNumbers() {
        return partNumbers;
    }

    public void setPartNumbers(String partNumbers) {
        this.partNumbers = partNumbers;
    }

    // Method to calculate invoice amount
    public  double getInvoiceAmount()
    {
            return  quantity * pricePeritem;
    }
}
