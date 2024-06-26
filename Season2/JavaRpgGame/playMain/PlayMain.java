package playMain;

import characters.player.*;
import java.util.Scanner;

public class PlayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("캐릭터를 생성합니다.\n원하는 직업군을 선택해 주세요\n" +
                    "1. 전사 탭\t2. 탱커 탭\t3. 마법사 탭\t4. 암살자 탭\t5. 정령사 탭");

            int num = sc.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.println("1. 바바리안\t2. 버서커");
                    int num2 = sc.nextInt();
                    switch (num2) {
                        case 1 -> new Barbarian();
                        case 2 -> new Berserker();
                    }
                }
                case 2 -> {
                    System.out.println("준비중");
                    break;
                }
                case 3 -> {
                    System.out.println("준비중");
                    break;
                }
                case 4 -> {
                    System.out.println("준비중");
                    break;
                }
                case 5 -> {
                    System.out.println("준비중");
                    break;
                }
            }
        }
    }
}
