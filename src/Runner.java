import java.util.Scanner;


public class Runner {

		public static void main(String[] args) {
			
			//Item item1 = new Item("Hotdogs", "Naked Dog", 1.44);
			//System.out.println(item1);
			Order order= new Order();
			//Menu vmenu = new Menu();
			Register reg = new Register(order);
			Menu menu1 = new Menu("Buffalo Wild Wings");
			//String moreOrder ="y";
			
			
			System.out.println(menu1.toString());
			System.out.println("Welcome to Buffalo Wild Wings");
			System.out.println("What will you have");
			System.out.println();
			Scanner reader = new Scanner(System.in);
			String moreOrder;
			boolean end = false;
			while(!end){
			System.out.println("[1] Add Item [2] Remove item [3] Check out [4] Clear order ");
			int input;
			input = reader.nextInt();
			
			switch(input){
			case 1:
				///////////////
				System.out.println("enter Item:");
				String itemID = reader.next().toUpperCase();
				int num = Integer.parseInt(itemID.substring(0,itemID.length()));
				Item item = new Item(null,null,0);
				//Item ditem = (null, null, 0, null);
				item = menu1.getItem(num-1);
				order.addItem(item);
				System.out.println(order.toString());
	        break;
	        //removes order if
	        
			case 2://remove item
				System.out.println("What item do you want to remove?");
				String remove = reader.next();
				//System.out.println("1");
				num = Integer.parseInt(remove.substring(0,remove.length()));
				//System.out.println("2");
				item = menu1.getItem(num-1);
				order.removeItem(item);
				System.out.println("Item Removed");
				break;
		case 3:
	      /////////
	      //prints receipt
	      System.out.println(reg);
	      //asks for payment
	      System.out.println("Please enter your payment: ");
	      //uses delimiter to take out "$"
	      String money = reader.next().replace('$', '\0');
	      //changes String number to int
	      double payment = Double.parseDouble(money);
	      //checks if payment is correct
	      System.out.println(reg.checkPayment(payment));
	      
	      
	      while(payment < reg.calcTotal()) {
	        //prompts user to enter more money
	        System.out.println("Insert more money: ");
	        double newPayment = Double.parseDouble(reader.next().replace('$', '\0'));
	        payment += newPayment; //adds previous amount of money to new inserted money
	        System.out.println(reg.checkPayment(payment)); //checks payment
	        
	      }
		  
	      System.out.println("\nWould you like to make another order? (y/n)");
		      moreOrder = reader.next().toLowerCase();
		      order.clearOrder();
		      reg.clearPayments();
	     if(moreOrder.equalsIgnoreCase("n")){
		      System.out.println("Thanks for Coming!");
	      		end = true;
			}
	      break;
	        
	      

			case 4:
				order.clearOrder();
				System.out.println("Your order has been cleared");
				break;
			case 5:
	    //prints closing remarks
	   // System.out.println("Thank you! Please come again!");
	   // end = true;
			//break;
			}
		}
		}
}