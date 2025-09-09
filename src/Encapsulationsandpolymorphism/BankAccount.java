package Encapsulationsandpolymorphism;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo; this.holderName = name; this.balance = balance;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }
    public double getBalance() { return balance; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) { super(accNo, name, balance); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amt) { System.out.println("Loan applied: " + amt); }
    public double calculateLoanEligibility() { return getBalance() * 2; }
}

