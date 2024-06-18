package S21220_00;

import java.util.*;

public class S21220_Gugudan_v1 {
	public static void main(String[] args) {
		
		int x,y;
		Random r = new Random();
		
		x = Math.abs(r.nextInt() % 9) + 1;
		y = Math.abs(r.nextInt() % 9) + 1;
		int num = x * y;
		
		System.out.print("구구단 " + x + "단에 대한 문제입니다. \n" + x + " * " + y + "= ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ans = sc.nextInt();
			if (ans == x * y) {
				break;
			}else {
				System.out.println("틀렸습니다");
				System.out.println("다시 입력하세요.");
				System.out.print("구구단 " + x + "단에 대한 문제입니다. \n" + x + " * " + y + " = ");
			}
		}
		System.out.println("정답입니다");
	}
}
