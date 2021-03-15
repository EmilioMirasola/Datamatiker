package term1.lesson17;

public class BankAccount {
    private double balance;
    private int id;
    private static int idCounter = 0;

    public BankAccount(double initialBalance) {
        this.id = idCounter;
        idCounter++;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalIDs() {
        return idCounter;
    }

    public int getBankAccountID() {
        return this.id;
    }
}
