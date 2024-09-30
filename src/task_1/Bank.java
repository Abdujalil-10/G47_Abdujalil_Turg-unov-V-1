package task_1;

public class Bank {
    private int balance;
    public void increaseBalance() {
        this.balance += 1;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}
