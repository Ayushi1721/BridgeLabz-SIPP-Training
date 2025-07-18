package Day6_IceCreamRush;

import java.util.Scanner;


class IceCreamFlavor {
    private String name;
    private int salesCount;

    public IceCreamFlavor(String name, int salesCount) {
        this.name = name;
        this.salesCount = salesCount;
    }

    public String getName() {
        return name;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public String toString() {
        return name + " - Sold: " + salesCount + " times";
    }
}

class IceCreamRush {
    private IceCreamFlavor[] flavors;

    public IceCreamRush(IceCreamFlavor[] flavors) {
        this.flavors = flavors;
    }

    public void sortByPopularity() {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].getSalesCount() > flavors[j + 1].getSalesCount()) {
                   
                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public void displayFlavors() {
        for (IceCreamFlavor flavor : flavors) {
            System.out.println(flavor);
        }
    }
}

public class IceCream {
    public static void main(String[] args) {
        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Vanilla", 45),
            new IceCreamFlavor("Chocolate", 60),
            new IceCreamFlavor("Strawberry", 25),
            new IceCreamFlavor("Butterscotch", 40),
            new IceCreamFlavor("Mango", 55),
            new IceCreamFlavor("Pineapple", 35),
            new IceCreamFlavor("Blueberry", 30),
            new IceCreamFlavor("Coffee", 50)
        };

        IceCreamRush rush = new IceCreamRush(flavors);

        System.out.println("Before Sorting (Unsorted Sales):");
        rush.displayFlavors();

        rush.sortByPopularity();

        System.out.println("\nAfter Sorting (Least to Most Popular):");
        rush.displayFlavors();
    }
}