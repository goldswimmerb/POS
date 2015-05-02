import java.util.ArrayList;

public class Menu {
	
	//fields
	String menuTitle;
	//to hold menu items
	private ArrayList<Item> menu = new ArrayList<Item>();
	
	//private ArrayList<Item> maindishes = new ArrayList<Item>();
	
	//constructors
	
	public Menu() {}
	
	public Menu(String MenuTitle) {
		this.menuTitle = menuTitle;
		populateMenu();
	}

	//methods
	
	//assessors and mutators
	public String getMenuTitle() {
		return menuTitle;
	}

	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	public ArrayList<Item> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Item> menu) {
		this.menu = menu;
	}
	
	public void populateMenu() {
		
		//add a food item
		
		//main dishes
		//maindishes.add(new Item("Chicken", "Chicken Florentine", 11.95));
		//Sharables and Sides
		menu.add(new Item("Sharables And Sides", "Ultimate Nachos", 7.79));
		menu.add(new Item("Sharables And Sides", "Mozzerella Sticks", 6.29));
		menu.add(new Item("Sharables And Sides", "Chips & Salsa", 3.99));
		menu.add(new Item("Sharables And Sides", "Chili Con Queso Dip", 6.99));
		menu.add(new Item("Sharables And Sides", "Mini Corn Dogs", 5.79));
		menu.add(new Item("Sharables And Sides", "Roasted Garlic Mushrooms", 5.49));
		menu.add(new Item("Sharables And Sides", "Fried Pickles", 5.79));
		menu.add(new Item("Sharables And Sides", "Spinach Artochoke Dip", 6.79));
		menu.add(new Item("Sharables And Sides", "Soft Pretzels", 5.49));
		menu.add(new Item("Sharables And Sides", "Jalapino Pepper Bites", 4.99));
		menu.add(new Item("Sharables And Sides", "Chicken Quesadilla", 7.29));
		menu.add(new Item("Sharables And Sides", "The Sampler", 12.49));
		menu.add(new Item("Sharables And Sides", "Tablegating Sampler", 11.99));
		menu.add(new Item("Sharables And Sides", "Cheeseburger Slammers", 9.29));
		menu.add(new Item("Sharables And Sides", "Pulled Pork Slammers", 8.79));
		menu.add(new Item("Sharables And Sides", "Garden Crasher", 8.99));
		menu.add(new Item("Sharables And Sides", "Cheese Curds", 6.29));
		menu.add(new Item("Sharables And Sides", "French Fry Basket", 3.99));
		menu.add(new Item("Sharables And Sides", "French Fry Basket w/ Cheese", 4.79));
		menu.add(new Item("Sharables And Sides", "French Fries", 2.79));
		menu.add(new Item("Sharables And Sides", "French Fries w/ Cheese", 3.29));
		menu.add(new Item("Sharables And Sides", "*Add Bacon to French Fries", 1.25));
		menu.add(new Item("Sharables And Sides", "Potato Wedge Basket", 4.79));
		menu.add(new Item("Sharables And Sides", "Potato Basket w/ Cheese", 5.79));
		menu.add(new Item("Sharables And Sides", "Potato Wedges", 3.19));
		menu.add(new Item("Sharables And Sides", "Potato Wedges w/ Cheese", 3.29));
		menu.add(new Item("Sharables And Sides", "*Add Bacon to Potato Wedges", 1.25));
		menu.add(new Item("Sharables And Sides", "Buffalo Chip Basket", 4.79));
		menu.add(new Item("Sharables And Sides", "Buffalo Chip Basket w/ Cheese", 5.79));
		menu.add(new Item("Sharables And Sides", "Buffalo Chips", 3.19));
		menu.add(new Item("Sharables And Sides", "Buffalo Chips", 3.29));
		menu.add(new Item("Sharables And Sides", "*Add Bacon to Buffalo Chips", 1.25));
		menu.add(new Item("Sharables And Sides", "Onion Ring Basket", 7.29));
		menu.add(new Item("Sharables And Sides", "Onion Rings", 4.79));
		menu.add(new Item("Sharables And Sides", "Mac & Cheeese", 2.99));
		menu.add(new Item("Sharables And Sides", "Garden Side Salad", 3.79));
		menu.add(new Item("Sharables And Sides", "Caesar Side Salad", 3.79));
		menu.add(new Item("Sharables And Sides", "Coleslaw", 0.99));
		
		//Flat Breads
		menu.add(new Item("Thin Crust FlatBreads", "Buffalo Chicken", 8.49));
		menu.add(new Item("Thin Crust FlatBreads", "Spinach Artichoke Chicken", 8.29));
		menu.add(new Item("Thin Crust FlatBreads", "Parmesan Garlic Chicken", 8.29));
		menu.add(new Item("Thin Crust FlatBreads", "5 Cheese Italian Pepperoni", 8.29));
		// salads
		menu.add(new Item("Savory Salads", "Honey BBQ Chicken Salad", 9.29));
		menu.add(new Item("Savory Salads", "Asian Zing Chicken Salad", 9.49));
		menu.add(new Item("Savory Salads", "Chicken Caesar Salad", 7.99));
		menu.add(new Item("Savory Salads", "Chicken Chop Salad", 10.29));
		menu.add(new Item("Savory Salads", "Grilled Chicken Salad", 8.79));
		menu.add(new Item("Savory Salads", "Crispy Chicken Salad", 8.99));
		menu.add(new Item("Savory Salads", "Blackened Chicken Salad", 8.99));
		menu.add(new Item("Savory Salads", "Chicken Salad Without Chicken", 7.29));
		menu.add(new Item("Savory Salads", "Mediterranean Salad", 10.79));
		menu.add(new Item("Savory Salads", "Mediterranean Salad w/out Chicken", 9.29));
		// Dressings 
		menu.add(new Item("Dressing", "Light Balsamic", 0.00));
		menu.add(new Item("Dressing", "Light French", 0.00));
		menu.add(new Item("Dressing", "Fat-Free Ranch", 0.00));
		menu.add(new Item("Dressing", "Light Asian Sesame", 0.00));
		menu.add(new Item("Dressing", "Light Caesar", 0.00));
		menu.add(new Item("Dressing", "Ranch", 0.00));
		menu.add(new Item("Dressing", "Bleu Cheese", 0.00));
		menu.add(new Item("Dressing", "Sothwest Ranch", 0.00));
		
		//Main Items
		//Wraps And Things
		menu.add(new Item("Wraps & Buffalitos", "Buffalo Ranch Chicken", 8.79));
		menu.add(new Item("Wraps & Buffalitos", "Southwest Chicken Queso", 8.49));
		menu.add(new Item("Wraps & Buffalitos", "Pepper Jack Steak", 9.29));
		menu.add(new Item("Wraps & Buffalitos", "Chicken Wrap (Grilled)", 8.29));
		menu.add(new Item("Wraps & Buffalitos", "Chicken Wrap(Crispy)", 8.29));
		menu.add(new Item("Wraps & Buffalitos", "Fish Tacos", 8.79));
		menu.add(new Item("Wraps & Buffalitos", "Grilled Chicken Buffalitos", 8.49));
		// Burgers
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Black and Bleu Burger", 8.99));
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Screemin Nacho Burger", 8.99));
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Jucy Steak Burger", 10.29));
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Buffalo Ranch Chicken", 8.79));
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Jerk Chicken Sandwich", 9.29));
		menu.add(new Item("Beefy Burgers & Satisfying Sandwitches", "Pulled Pork Sandwich", 8.79));

		
		//Build Your Own Burger
		menu.add(new Item("Build Your Own Burger", "Beefy Burger", 8.79));
		menu.add(new Item("Build Your Own Burger", "Grilled Chicken", 8.49));
		menu.add(new Item("Build Your Own Burger", "Crispy Chicken", 8.49));
		menu.add(new Item("Build Your Own Burger", "Black Bean Burger", 8.79));
		menu.add(new Item("Build Your Own Burger", "Fish Filets", 8.79));
		// Addons to BYOB
		menu.add(new Item("Build Your Own Burger - Addon", "American Cheese", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Cheddar Cheese", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Swiss Cheese", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Pepper Jack Cheese", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Queso", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Bleu Cheese Crumbles ", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Lettuce", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Tomato", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Red Onion", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Jalapenos", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Lettuce", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Tomato", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Red Onion", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Jalapenos", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Pico de Gallo", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Pickle", 0.00));
		menu.add(new Item("Build Your Own Burger - Addon", "Bacon", 0.75));
		menu.add(new Item("Build Your Own Burger - Addon", "Chilli", 0.75));
		menu.add(new Item("Build Your Own Burger - Addon", "Pulled Pork", 1.25));
		menu.add(new Item("Build Your Own Burger - Addon", "Prime Rib", 1.75));
		// substitutions
		menu.add(new Item("Substitutions", "Onion Rings", 1.50));
		menu.add(new Item("Substitutions", "Side Salad", 1.50));
		menu.add(new Item("Substitutions", "Coleslaw", 0.50));
		menu.add(new Item("Substitutions", "Veggie Boat", 0.50));
		menu.add(new Item("Substitutions", "Buffalo Chips", 0.50));
		menu.add(new Item("Substitutions", "Potato Wedges", 0.50));

		
		//Kids Meals
		menu.add(new Item("Kids Meals", "Traditional Wings", 4.49));
		menu.add(new Item("Kids Meals", "Boneless Wings", 4.49));
		menu.add(new Item("Kids Meals", "Chicken Tenders", 4.79));
		menu.add(new Item("Kids Meals", "Cheeseburger Slammer", 4.49));
		menu.add(new Item("Kids Meals", "Naked Tenders", 4.79));
		menu.add(new Item("Kids Meals", "Macaroni & Cheese", 4.49));
		menu.add(new Item("Kids Meals", "Mini Corn Dogs", 4.49));
		menu.add(new Item("Kids Meals", "Kids Cheese Flatbread", 4.49));
		//Wing Items
		menu.add(new Item("Hand Spun Wings", "Traditional Wings (5)", 5.99));
		menu.add(new Item("Hand Spun Wings", "Traditional Wings (10)", 9.99));
		menu.add(new Item("Hand Spun Wings", "Traditional Wings (15)", 14.99));
		menu.add(new Item("Hand Spun Wings", "Traditional Wings (20)", 18.99));
		
		menu.add(new Item("Hand Spun Wings", "Boneless Wings (7)", 7.99));
		menu.add(new Item("Hand Spun Wings", "Boneless Wings (10)", 9.99));
		menu.add(new Item("Hand Spun Wings", "Boneless Wings (15)", 14.99));
		menu.add(new Item("Hand Spun Wings", "Boneless Wings (20)", 18.99));
		
		menu.add(new Item("Hand Spun Wings", "Boneless Wings And Traditional Combo", 14.79));
		//Wing sauces
		menu.add(new Item("Sauces and Seasonings", "Sweet BBQ", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Salt and Vinegar", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Teriyaki", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Lemon Pepper", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Mild", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Honey Mustard", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Parmesan Garlic", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Medium", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Chipolte BBQ", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Honey BBQ", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Spicy Garlic", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Buffalo", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Jammin Jalapeno", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Asian Zing", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Desert Heat", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Caribbean Jerk", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Thai Curry", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Hot BBQ", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Hot", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Mango Habanero", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Wild", 0.00));
		menu.add(new Item("Sauces and Seasonings", "Blazin", 0.00));
		menu.add(new Item("Sauces and Seasonings", "LTO Sauce" , 0.00));

		// Tenders And Shrimp
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp",  "Naked Tenders", 7.99, "4"));
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp", "Naked Tenders", 9.29, "6"));
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp", "Chicken Tenders", 8.29, "4"));
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp", "Chicken Tenders", 9.79, "6"));
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp",  "Popcorn Shrimp", 8.49));
		menu.add(new Item("Tempting Tenders and Popcorn Shrimp", "Tender & Shrimp Combo", 12.99));
		// You Deserve it Desserts
		menu.add(new Item("You-Deserve-It Desserts",  "Ice Cream", 1.99));
		menu.add(new Item("You-Deserve-It Desserts", "Chocolate Sauce", 0.00));
		menu.add(new Item("You-Deserve-It Desserts", "Caramel Sauce", 0.00));
		menu.add(new Item("You-Deserve-It Desserts", "Cinnamon Squares", 3.79));
		menu.add(new Item("You-Deserve-It Desserts",  "Cheesecake Bites", 3.79));
		menu.add(new Item("You-Deserve-It Desserts", "Dessert Nachos", 7.49));
		menu.add(new Item("You-Deserve-It Desserts" , "Chocolate Fudge Cake", 4.99));
		
		//Wings sauces
		//I dont know how to add these yet. I hope its easier than i think.
		//add drink item
		
		
		
		
		//drinks
		
		
		menu.add(new Item("Drinks", "Soft Drink", 2.69, "Large"));
		menu.add(new Item("Drinks", "Soft Drink", 2.49, "Medium"));
		menu.add(new Item("Drinks", "Coffee", 1.49));
		menu.add(new Item("Drinks", "Lemonade", 3.29));
		menu.add(new Item("Drinks", "Limeades", 3.29));
	}
	
	
	public String toString() {
		int itemCount = 0;
		String result = "";
		for(Item m : menu) {
			result += "#" + (itemCount+1) + " " + menu.get(itemCount) + "\n";
			itemCount++;
		}
		return result;
	}

	public Item getItem(int count) {
		return menu.get(count);
		}
	}
	

