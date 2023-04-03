import problem.Account;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("홍길동", 300000);

        account.deposit(50000);
        account.withdraw(30000);

        account.withdraw(5000000);

        System.out.println(account);
    }
}