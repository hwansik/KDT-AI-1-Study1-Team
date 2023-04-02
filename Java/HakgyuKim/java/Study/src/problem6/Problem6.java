package problem6;

class Account {
    private String owner;
    private long balance;

    public long deposit(long amount) {
        this.balance += amount;
        return balance;
    }

    public long withdraw(long amount) {
        if (amount < balance) {
            this.balance -= amount;
            return balance;
        }
        else {
            System.out.println("인출할 금액이 부족합니다.");
        }return amount;
    }

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
}


public class Problem6 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1000000);
        account.withdraw(250000);
        account.deposit(180000);
        System.out.println(account.getOwner() + "의 잔고: " + account.getBalance());

        account.withdraw(9500000);
        System.out.println(account.getBalance());
    }
}