package S21220_00;

import java.util.Scanner;

public class S21220_01v7 {

	public static void main(String[] args) {
		
		int intval;
		double dobuleval;
		String strval;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 문장을 입력하세요 :");
		strval = sc.nextLine();
		System.out.println("2 정수를 입력하세요 :");
		intval = sc.nextInt();
		System.out.println("3 실수를 입력하세요 :");
		dobuleval = sc.nextDouble();
		
		System.out.println("1 입력한 문장은 " + strval + "입니다.");
		System.out.println("2 입력한 정수는 " + intval + "입니다.");
		System.out.println("3 입력한 실수는 " + dobuleval + "입니다.");
		sc.close();

		

	}
}
