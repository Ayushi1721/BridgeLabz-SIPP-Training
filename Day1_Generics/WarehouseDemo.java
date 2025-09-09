package Day1_Generics;
import java.util.ArrayList;
import java.util.List;

// Abstract class for warehouse items
abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}

// Concrete item classes
class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
}

// Generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item) { items.add(item); }
    public T getItem(int index) { return items.get(index); }
    
    // Wildcard method to display all items
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }

    public List<T> getItems() { return items; }
}

// Demo
public class WarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple"));

        System.out.println("Electronics Items:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries Items:");
        Storage.displayItems(groceriesStorage.getItems());
    }
}

