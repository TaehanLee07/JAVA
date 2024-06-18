package S21220_00;

import java.util.*;

public class S21220_Gugudan_v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		Random ran = new Random();
		if (args.length == 0) 
			x = Math.abs(ran.nextInt() % 9) + 1;
		 else 
			x = Integer.parseInt(args[0]);
		
		y = Math.abs(ran.nextInt() % 9) + 1;
		int num = x * y;

		System.out.println();
		System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
		System.out.println();
		System.out.print(x + " * " + y + " = ");
		int result = sc.nextInt();

		if (result == num)
			System.out.println("맞았습니다!");
		else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 " + num + "입니다.");
		}

	}
}
