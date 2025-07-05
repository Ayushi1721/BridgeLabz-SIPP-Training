package Day3_keywords;

public class Product {
    static double discount = 10.0;
    String productName;
    double price;
    int quantity;
    final String productID;
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        double total = price * quantity;
        double discountedPrice = total - (total * discount / 100);
        System.out.println("Total after " + discount + "% discount: ₹" + discountedPrice);
    }
    public static void main(String[] args) {
        Product.updateDiscount(15.0);
        Product product1 = new Product("Bluetooth Speaker", 1200.0, 2, "PRD202");

        if (product1 instanceof Product) {
            System.out.println("\nProduct Details:");
            product1.displayProductDetails();
        } else {
            System.out.println("Not a valid product object.");
        }
    }
}
