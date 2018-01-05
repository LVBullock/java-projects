/**
 *
 * @author laurabullock
 */
public class InvoiceTotalCal {
    public static void main (String[] args){
        
        //displays a single line comment
        String welcome = "Welcome to the Invoice Total Calculator\n";
        
        //declares the subTotal variable and sets it to 100
        double subTotal = 100;
        
        //declares the discount percent as .2
        double discPercent = .2;
        
        //calculates the discount (based on subTotal) and the total
        double discAmount = subTotal * discPercent;
        double invoiceTotal = subTotal - discAmount;
        
        //display the result and format
        String receipt = "Subtotal:\t" + "  " + subTotal + "\n"
                + "Discount percent:   " + discPercent + "\n"
                + "Discount amount:   " + discAmount + "\n"
                + "Total:\t\t" + "   " + invoiceTotal + "\n";
                  
        System.out.println(welcome);
        System.out.println(receipt);
        
    }
    
}
