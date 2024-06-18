package s21220_java00;

import java.io.*;
import java.util.*;

public class BaseBallGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random ran = new Random();
        
        // 정답 리스트 생성
        ArrayList<Integer> rans = new ArrayList<>();
        int count = 0;

        // 정답 숫자 생성
        while (rans.size() < 3) {
            int num = Math.abs(ran.nextInt() % 9) + 1;
            if (!rans.contains(num)) {
                rans.add(num);
            }
        }
        
        // 정답 출력
        System.out.println(rans.get(0) + " " + rans.get(1) + " " + rans.get(2));
        
        while (true) {
            count++;
            System.out.println("카운트 : " + count);
            // 사용자의 숫자 리스트
            List<Integer> nums = new ArrayList<>();
            
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "번째 숫자 : ");
                nums.add(Integer.parseInt(br.readLine()));
            }
            // 스트라이크와 볼을 판정
            int strike = 0, ball = 0;
            for (int i = 0; i < 3; i++) {
                if (rans.get(i).equals(nums.get(i))) strike++;
                else if (rans.contains(nums.get(i))) ball++;
            }
            if (strike == 3) {
                System.out.println("참 잘했어요!");
                break;
            }
            System.out.println("Strike : " + strike + " " + "Ball : " + ball);
        }
    }
}
