package Day1_LinkedList;
import java.util.*;

class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;

    public Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Item head;

    public void addItemAtEnd(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }

    public void display() {
        Item temp = head;
        System.out.println("Inventory List:");
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " " + temp.quantity + " $" + temp.price);
            temp = temp.next;
        }
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) { head = head.next; return; }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int qty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) { temp.quantity = qty; return; }
            temp = temp.next;
        }
    }

    public double totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    // Search by ID or Name
    public Item searchById(int id) {
        Item temp = head;
        while (temp != null) { if (temp.itemId == id) return temp; temp = temp.next; }
        return null;
    }
    public Item searchByName(String name) {
        Item temp = head;
        while (temp != null) { if (temp.itemName.equalsIgnoreCase(name)) return temp; temp = temp.next; }
        return null;
    }
}

public class InventoryDemo {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItemAtEnd(101, "Pen", 50, 1.5);
        inv.addItemAtEnd(102, "Notebook", 30, 5);
        inv.addItemAtEnd(103, "Eraser", 100, 0.5);

        inv.display();

        System.out.println("Total inventory value: $" + inv.totalValue());

        inv.updateQuantity(102, 50);
        inv.removeById(103);

        inv.display();

        Item found = inv.searchByName("Pen");
        if (found != null) System.out.println("Found Item: " + found.itemName + ", Qty: " + found.quantity);
    }
}
