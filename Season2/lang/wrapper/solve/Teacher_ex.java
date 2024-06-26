package wrapperC;

import java.util.Scanner;

public class tEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] q = new int[N][3]; // 시도한 숫자 , 스트라이크 개수, 볼 개수
        for (int i = 0; i < N; i++) {
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
            q[i][2] = sc.nextInt();
        }

        int ans = 0;

        // 삼중 for문으로 모든값을 체크함 단 123 ~ 987중에 중복 없는것!!
        for (int x = 1; x <= 9; x++)
            for (int y = 1; y <= 9; y++)
                for (int z =1; z <= 9; z++) {
                    // 중복은 검사를 제외
                    if (x == y || y == z || x == z) continue;

                    boolean chk = true;

                    for (int i = 0; i < N; i++) {
                        int qx = q[i][0] / 100; // 백의 자리
                        int qy = (q[i][0] / 100) % 10; // 십의 자리
                        int qz = q[i][0] / 100 % 10; // 일의 자리

                        int strike = 0, ball = 0;

                        if (x == qx) strike++;
                        else if (x == qy || x == qz) ball++;
                        if (y == qy) strike++;
                        else if (y == qx || y == qz) ball++;
                        if (z == qz) strike++;
                        else if (z == qy || z == qx) ball++;

                        // 입력받은 스트라이크와 볼의 결과와 다른 경우는 답이 될 수 없음
                        if (strike != q[i][1] || ball != q[i][2]) {
                            chk = false;
                            break;
                        }
                        if (chk) ans++;
                    }
                }
        System.out.println(ans);
    }
}
