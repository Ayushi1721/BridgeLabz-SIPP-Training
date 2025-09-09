package Day1_oops.Level1;


public class Item {
	    String itemCode;
	    String itemName;
	    double price;

	    Item(String itemCode, String itemName, double price) {
	        this.itemCode = itemCode;
	        this.itemName = itemName;
	        this.price = price;
	    }

	    void displayDetails() {
	        System.out.println("Item Code: " + itemCode);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price: ₹" + price);
	    }

	    double calculateTotalCost(int quantity) {
	        return price * quantity;
	    }

	    public static void main(String[] args) {
	        Item item = new Item("A101", "Notebook", 50);
	        item.displayDetails();
	        System.out.println("Total cost for 5 items: ₹" + item.calculateTotalCost(5));
	    }
	}


