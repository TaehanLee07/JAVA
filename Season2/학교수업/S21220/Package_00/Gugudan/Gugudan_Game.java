package S21220_00;

import java.util.*;

public class S21220_Gugudan_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int x = 0;

		if (args.length > 0)
			x = new Integer(args[0]);

		else {
			System.out.print("x의 값을 입력하세요.");
			x = new Integer(sc.nextLine());
		}

		int y = random.nextInt(1, 10);

		int num = x * y;

		System.out.print(x + " * " + y + " = ");

		int answer = sc.nextInt();

		String result = (answer == num) ? "맞았습니다!" : "틀렸습니다. 정답은 " + num + "입니다.";
		System.out.println(result);

	}
}
