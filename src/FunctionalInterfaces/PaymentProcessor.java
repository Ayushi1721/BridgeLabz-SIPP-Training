package FunctionalInterfaces;
interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunded: " + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed via PayPal: " + amount);
    }
}

