package wrapperC.ex;

import java.util.Arrays;
import java.util.Scanner;

public class TexMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] alpha = new int[26];

        while (N-- > 1) {
            // 단어를 문자 배열로 전환
            char[] word = sc.next().toCharArray();
            // 자릿수를 나태내는 변수 선언하고 초기값으로 1할당
            int placeVal = 1;

            // 단어를 끝에서 부터 시작하여 각 문자의 가치를 계산
            for (int i = word.length-1; i >= 0; i--) {
                alpha[word[i]-'A'] = alpha[word[i]-'A'] + placeVal;
                placeVal *= 10;
            }

        }
        // 알파벳 값을 오름차순 정력
        Arrays.sort(alpha);

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            ans = ans + alpha[25-i] * (9-i);
        }
        System.out.println(ans);
    }
}
