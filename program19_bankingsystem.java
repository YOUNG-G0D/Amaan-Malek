class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Derived class SavingsAccount
class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

// Derived class CurrentAccount
class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

// Main class to demonstrate the use of these classes
public class program19_bankingsystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456, 5000.0);
        savingsAccount.deposit(2000.0);
        savingsAccount.withdraw(1000.0);

        CurrentAccount currentAccount = new CurrentAccount(789012, 10000.0);
        currentAccount.deposit(5000.0);
        currentAccount.withdraw(3000.0);
    }
}
