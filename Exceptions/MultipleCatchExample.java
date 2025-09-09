package Exceptions;
public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] arr = null; // Try changing to {1,2,3} to test valid case
        int index = 1;

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
