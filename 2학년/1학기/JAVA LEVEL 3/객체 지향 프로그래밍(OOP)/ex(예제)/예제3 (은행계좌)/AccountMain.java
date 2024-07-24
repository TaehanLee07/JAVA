package oop.exam;

public class AccountMain {

    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.balance);
      
        ac.deposit(10000);
        System.out.println(ac.balance);
        
      ` ac.withdraw(9000);
        System.out.println(ac.balance);
        
        ac.withdraw(2000);
        System.out.println(ac.balance);
    }
}
