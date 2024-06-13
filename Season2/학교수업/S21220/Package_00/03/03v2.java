package S21220_00;

import java.util.Scanner;

public class S21220_03v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();

		String season;
		switch (month) {
			case 3:
			case 4:
			case 5:
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default:
			season = "잘못된 월 입력";
		}
		System.out.println(month + "월은 " + season + "입니다");
		
	}
}
