package s21220_java04;

import java.util.Scanner;

public class S21220_Atm2Th {
	static int bankAccount;
	int acount;

	public int moneyInput(int a) {
		return acount += a;
	}

	public int moneyOutput(int a) {
		return acount -= a;
	}

	public static void main(String[] args) {
		S21220_Atm2Th a = new S21220_Atm2Th();
		S21220_Atm2Th b = new S21220_Atm2Th();
		Scanner sc = new Scanner(System.in);

		a.acount = 0;
		b.acount = 0;

		int howMuch;
		while (true) {
			System.out.println("\r 메뉴 선택 1 입금 2 출금 9 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("입금 선택하셨습니다");
				System.out.println("계좌선택 : 이전메뉴 (0) A계좌(1) B계좌(2) 종료 (9)");
				select = sc.nextInt();
				if (select == 1) {
					System.out.println("현재계좌 A");
					System.out.println("금액입력 : ");
					howMuch = sc.nextInt();
					a.moneyInput(howMuch);
				} else if (select == 2) {
					System.out.println("현재계좌 B");
					System.out.println("금액입력 : ");
					howMuch = sc.nextInt();
					b.moneyInput(howMuch);
				}
				System.out.println("A잔액 : " + a.acount + " B잔액 : " + b.acount);
				System.out.println("총금액 :" + (a.acount + b.acount));
			}
			
			if (select == 2) {
				System.out.println("출금 선택하셨습니다");
				System.out.println("계좌선택 : 이전메뉴 (0) A계좌(1) B계좌(2) 종료 (9)");
				select = sc.nextInt();
				if (select == 1) {
					System.out.println("현재계좌 A");
					System.out.println("금액입력 : ");
					howMuch = sc.nextInt();
					a.moneyOutput(howMuch);
				} else if (select == 2) {
					System.out.println("현재계좌 B");
					System.out.println("금액입력 : ");
					howMuch = sc.nextInt();
					b.moneyOutput(howMuch);
				}
				System.out.println("A잔액 : " + a.acount + " B잔액 : " + b.acount);
				System.out.println("총금액 :" + (a.acount + b.acount));
			}

			if (select == 9) {
				System.out.println("이용해주셔서 감사합니다");
				break;
			}
		}

	}
}
