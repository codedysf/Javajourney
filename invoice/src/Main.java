import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // create an invoice object
       invoice theInvoice = new invoice
               ("276453", "hunder", 5, 20.18);

       // To print the initial values
        System.out.println("part number " + theInvoice.getPartNumbers());
        System.out.println("part discription " + theInvoice.getPartDiscription());
        System.out.println("quantity" + theInvoice.getQuantity());
        System.out.println("price per item " + theInvoice.getPricePeritem());
        System.out.println("the invoice " + theInvoice.getInvoiceAmount());

        // To update the values

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the quantity u need   ");
        int Quantity = input.nextInt();
        theInvoice.setQuantity(Quantity);

        System.out.println();

        System.out.println("Enter amount   ");
        double Price = input.nextDouble();
        theInvoice.setPricePeritem(Price);


        // Print the updated values
        System.out.println("part number " + theInvoice.getPartNumbers());
        System.out.println("part discription " + theInvoice.getPartDiscription());
        System.out.println("quantity" + theInvoice.getQuantity());
        System.out.println("price per item " + theInvoice.getPricePeritem());
        System.out.println("the invoice " + theInvoice.getInvoiceAmount());



    }
}