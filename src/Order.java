
import java.util.ArrayList;
import java.util.Random;

public class Order {
  //fields
  private static int orderNo = 0;
  //create ArrayList to store order items
  protected ArrayList<Item> order;
  
  public Order() {
    order = new ArrayList<Item>();
  }
  

  public void addItem(Item item) {
    order.add(item);
  }
  
 
  public Item getItem(int index) {
    return order.get(index);
  }
  

  public void clearOrder() {
    order.clear();
  }
  

  public int getNumber() {
    return orderNo;
  }
  

  public void incrementNo() {
    orderNo++;
  }
  

  public void removeItem(Item item) {
    order.remove(item);
  }
  

  public int getSize() {
    return order.size();
  }
  
 
  public String getServer() {
    Random rand = new Random();
    int num = rand.nextInt(10) + 1;
    //chooses random name with the number
    switch(num) {
      case 1:
        return "Brenda";
      case 2:
        return "Polly";
      case 3:
        return "Fred";
      case 4:
        return "Robert";
      case 5:
        return "Sally";
      case 6: 
        return "Kate";
      case 7: 
        return "Alec";
      case 8:
        return "Warren";
      case 9:
        return "Phil";
      case 10:
        return "Sam";
      default:
        return "";
    }
  }
  

  public String toString() {
    String str = "";
    //prints out each order in the order ArrayList one by one
    for(int i = 0; i < order.size(); i++) {
      str += order.get(i).toString() + "\n";
    }
    return str;
  }
}