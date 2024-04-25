package access;

public class BankAccount {

    private int balance; // 잔고

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {   // 입금
        if (isAmountValide(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액입니다");

    }

    public void withdraw(int amount) {
        if (isAmountValide(amount) && balance - amount >= 0)
            balance -= amount;
        else System.out.println("유효하지 않거나 잔액이 부족합니다.");
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValide(int amount) {
        return amount > 0;
    }
}
