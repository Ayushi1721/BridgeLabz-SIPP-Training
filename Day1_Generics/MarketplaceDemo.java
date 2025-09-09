package Day1_Generics;
//Product class with generic type
class Product<T> {
 private String name;
 private double price;
 private T category;

 public Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public String getName() { return name; }
 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }
 public T getCategory() { return category; }
}

//Example categories
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

//Generic discount method
class MarketplaceUtils {
 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
     double newPrice = product.getPrice() * (1 - percentage / 100);
     product.setPrice(newPrice);
 }
}

//Demo
public class MarketplaceDemo {
 public static void main(String[] args) {
     Product<BookCategory> book = new Product<>("Java Book", 50.0, new BookCategory());
     Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());

     MarketplaceUtils.applyDiscount(book, 10);   // 10% discount
     MarketplaceUtils.applyDiscount(shirt, 20);  // 20% discount

     System.out.println(book.getName() + " price: " + book.getPrice());
     System.out.println(shirt.getName() + " price: " + shirt.getPrice());
 }
}
