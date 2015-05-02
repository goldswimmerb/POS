
public class Item {
	
	//fields
	private String category, name, size, number;
	private double price;
	//private double NumOfItem;
	
	//constructors
	public Item() { }
	
	//handles a food item
	public Item(String category, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}
	
	//handles a drink item or wing item
	public Item(String category, String name, double price, String size) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.size = size;	
	}
	// this handles items with numbers
	public Item(String category, String number, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.number = number;	
	}

	//methods


	//assessors and mutators
	public String getCategory() {
		return category;
	}


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		if(size != null) {
			return "(" + size + ")" + name + "\t" + category + "\t" + price;
		}
		//else if(number != null){
				//return name + "\t" + category + "\t" + price + "\t" + number;
		//}
		else { return name + "\t" + category + "\t" + price;
		}
		}//end of method
	
}//end of class
