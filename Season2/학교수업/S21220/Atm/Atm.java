package s21220_java04;

import java.util.Scanner;

public class Atm {
	static int bankAccout;
	int account;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atm a = new Atm();
		Atm b = new Atm();

		while (true) {
			System.out.println("계좌 선택 전 메뉴 (0) 입금 (1) 출금 (2) 종료 (9)");
			int select = sc.nextInt();
			if (select == 9) break;
			if (select < 1 || select > 2) continue;
			System.out.println("계좌선택 (0) 전 메뉴 (1) A계좌 (2) B계좌 (9) 종료");
			select = sc.nextInt();
			System.out.println("금액 입력");
			int money = sc.nextInt();
			if (select == 1) {
				if (select == 1) {
					a.account += money;
					a.bankAccout += money;
				}
				if (select == 2) {
					b.account += money;
					b.bankAccout += money;
				}
			}
			if (select == 2) {
				select = sc.nextInt();
				if (select == 1) {
					a.account -= money;
					a.bankAccout -= money;
				}
				if (select == 2) {
					b.account -= money;
					b.bankAccout -= money;
				}
			}
			System.out.println("A 잔액 :" + a.bankAccout + "\n" + "B 잔액 : " + b.bankAccout + "\n" + "총금액 :" + (a.bankAccout + b.bankAccout));
		}
	}
}
