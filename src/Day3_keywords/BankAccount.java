package Day3_keywords;

public class BankAccount {

    public static void main(String[] args) {
        BankAccountDetails acc1 = new BankAccountDetails("Ayushi Baliyan", 10000.0);
        BankAccountDetails acc2 = new BankAccountDetails("Rohit Sharma", 15000.0);

        if (acc1 instanceof BankAccountDetails) {
            acc1.displayDetails();
        }
        if (acc2 instanceof BankAccountDetails) {
            acc2.displayDetails();
        }

        BankAccountDetails.getTotalAccounts();
    }
}

class BankAccountDetails {
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    static String bankName = "SBI";
    private static int totalAccounts = 0;
    private static int nextAccountNumber = 1001;

    public BankAccountDetails(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++; // final set only once
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("------------------------");
    }
}
