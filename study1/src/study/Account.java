package study;

public class Account {
    private String owner;
    private long balance;

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long deposit(long amount) {
        balance += amount;
        return balance;

    }
    public long withdraw(long amount) {
        balance -= amount;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account account = new Account("아무개", 10000000);
        account.deposit(5000000);
        account.withdraw(20000);
        System.out.println(account);
    }
}