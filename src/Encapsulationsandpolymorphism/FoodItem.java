package Encapsulationsandpolymorphism;
abstract class FoodItem {
    private String itemName; private double price; private int quantity;
    public FoodItem(String name, double price, int qty) { this.itemName=name; this.price=price; this.quantity=qty; }
    public abstract double calculateTotalPrice();
    public void getItemDetails() { System.out.println(itemName + " x" + quantity + ": " + price); }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return super.price * super.quantity; }
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    public String getDiscountDetails() { return "Veg 5% discount"; }
}

