package term1.lesson17;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(1000);
        System.out.println(BankAccount.getTotalIDs());
        System.out.println(b1.getBankAccountID());
        System.out.println(b2.getBankAccountID());

    }
}