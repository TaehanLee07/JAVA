package S21220_00;

import java.util.Scanner;

public class S21220_03v5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		int num = 0;
		while(true) {
			System.out.println("(1) 나는 월요일이 좋다");
			System.out.println("(2) 나는 수요일이 좋다");
			System.out.println("(3) 나는 금요일이 좋다");
			System.out.println("(4) 나는 월요일이 좋다");
			System.out.println("좋아하는 날을 선택하세요 (종료 : (0)번 )");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			if(menu == 1) {
				System.out.println("선택하신 번호는 1번 입니다");
			} else if(menu == 2) {
				System.out.println("선택하신 번호는 2번 입니다");
			} else if(menu == 3) {
				System.out.println("선택하신 번호는 3번 입니다");
			}else if(menu == 4) {
				System.out.println("선택하신 번호는 4번 입니다");
			}else if(menu == 0){
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 수를 입력하셔서 처음으로 돌아갑니다 (1~4번사이의 수만 입력해주세요)");
				continue;
			}
 
		}
	}
	
}
