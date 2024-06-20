package test;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

        int startIdx = 0;
        int cnt = 0;

        while (true) {
            int findIndex = doc.indexOf(word, startIdx);
            if (findIndex < 0) {
                break;
            }
            startIdx = findIndex + word.length();
            cnt++;
        }
        System.out.println(cnt);
    }
}
