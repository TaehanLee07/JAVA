package wrapperC.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex {
    public static int N;
    public static int[][] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        a = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
            a[i][2] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) continue;
                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k) continue;
                    if (isPossible(i, j, k)) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static boolean isPossible(int n1, int n2, int n3) {
        for (int i = 0; i < N; i++) {
            int number = a[i][0];
            int strike = 0;
            int ball = 0;

            int digit1 = number / 100;
            int digit2 = (number % 100) / 10;
            int digit3 = number % 10;

            if (digit1 == n1) strike++;
            if (digit2 == n2) strike++;
            if (digit3 == n3) strike++;

            if (digit1 == n2 || digit1 == n3) ball++;
            if (digit2 == n1 || digit2 == n3) ball++;
            if (digit3 == n1 || digit3 == n2) ball++;

            if (strike != a[i][1] || ball != a[i][2]) return false;
        }
        return true;
    }
}
