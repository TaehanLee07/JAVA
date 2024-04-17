package oop.exam;

public class Account {

    int balance; // 잔액

    //입금 메서드
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (balance < amount)
            System.out.println("잔액이 부족합니다");
        else {
            balance -= amount;
        }
        return balance;

    }
}
