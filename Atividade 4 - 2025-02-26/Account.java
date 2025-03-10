package Application;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawalLimit;

    public Account(int number, String holder, double initialBalance, double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new WithdrawException("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
