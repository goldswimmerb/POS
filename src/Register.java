import java.text.NumberFormat;
import java.util.ArrayList;

import java.text.NumberFormat;

public class Register {
  //fields
  private final double TAX = 0.06; //sales tax percent
  private double subtotal;
  private double total;
  //create NumberFormat object to format subtotal, tax, and total
  private NumberFormat numForm = NumberFormat.getCurrencyInstance();
  Order order = new Order();
  
  //constructor
  public Register(Order order) {   
    this.order = order;
    order.incrementNo();
  }
  
  //methods
  

  public void clearPayments() {
    subtotal = 0;
    total = 0;
  }
  

  public double calcSubtotal() {
    for(int i = 0; i < order.getSize(); i++) {
      Item item = order.getItem(i);
      subtotal += item.getPrice();
    }
    return subtotal;
  }
  

  public double calcTax() {
    return subtotal * TAX;
  }
  
 
  public double calcTotal() {
    total = subtotal + calcTax();
    return total;
  }
  
  /**
   * Checks the payment to see if the 
   * customer paid all of the bill or
   * requires change.
   */
  public String checkPayment(double payment) {
    if(payment == total)
      return "";
    else if(payment > total) 
      return "Here is your change: " + numForm.format(payment - total);
    else
      return "Please pay " + numForm.format(total - payment) + " more.";
  }
  
  
  /**
   * Returns a String of information about the order,
   * similar to a receipt.
   */
  public String toString() {
    String str = "--------------------Buffalo Wild Wing--------------------\n"
      + "Order No." + order.getNumber() + "\n"
      + "Server's Name: " + order.getServer() + "\n"
      + "-----------------------------------------------\n";    
    str += order.toString();
    str += "-----------------------------------------------\n"
      + "Subtotal:\t\t\t" + numForm.format(calcSubtotal())
      + "\nTax:\t\t\t" + numForm.format(calcTax())
      + "\nTotal:\t\t\t" + numForm.format(calcTotal());
    return str;
  }
}
