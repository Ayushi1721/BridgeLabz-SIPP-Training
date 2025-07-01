package Day1_oops.Level2;

public class BankAccount {
	    String accountHolder;
	    String accountNumber;
	    double balance;

	    public BankAccount(String holder, String accNum, double bal) {
	        accountHolder = holder;
	        accountNumber = accNum;
	        balance = bal;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: ₹" + amount);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount acc = new BankAccount("Ayushi", "123456789", 1000);
	        acc.deposit(500);
	        acc.withdraw(300);
	        acc.displayBalance();
	    }
	}

