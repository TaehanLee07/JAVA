package S21220_00;

import java.util.Scanner;

public class S21220_01v71 {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력하세요 : ");
			str = sc.nextLine();
			System.out.println("입력된 문자열은 \"" + str + "\"");
			
			if (str.equals("q")) 
				break;
		}
		
		System.out.println("종료");
		sc.close();
	}
}
