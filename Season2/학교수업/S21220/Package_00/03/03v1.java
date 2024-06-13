package S21220_00;

import java.util.Scanner;

public class S21220_03v1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("당신의 등급은 " + grade + "입니다");

	}
	
}
