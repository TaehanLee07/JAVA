package gamePlayMain;

import java.util.Scanner;

public class PlayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("캐릭터를 생성합니다.\n원하는 직업군을 선택해 주세요\n" +
                    "1. 전사 탭\t2. 탱커 탭\t3. 마법사 탭\t4. 암살자 탭\t5. 지원가 탭");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("전사탭을 고르셨습니다");
                System.out.println("이중에서 골라 주세요 뒤로 가려면 0을 눌러주세요");
                choice = sc.nextInt();
                if (choice  == 0) {
                    continue;
                }
            }
        }
    }
    
}
