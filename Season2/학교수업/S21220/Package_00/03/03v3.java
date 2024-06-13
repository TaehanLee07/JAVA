package S21220_00;

import java.util.Scanner;

public class S21220_03v3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 몇단까지 할까요? : ");
		int n = sc.nextInt();
		
		for (int i = 2; i <= n; i++) {
			System.out.println(i + "단 입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}
			System.out.println("============");
		}
		
	}
}
