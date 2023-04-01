package study;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("아무개",100000000);
        account.deposit(5000000);
        long balance = account.withdraw(200000000);
        System.out.println("잔액: " + balance);
    }
}
