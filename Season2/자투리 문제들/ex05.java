package test;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cur = sc.next().split(":");
        String[] target = sc.next().split(":");

        int curH = Integer.parseInt(cur[0]);
        int curM = Integer.parseInt(cur[1]);
        int curS = Integer.parseInt(cur[2]);

        int targetH = Integer.parseInt(target[0]);
        int targetM = Integer.parseInt(target[1]);
        int targetS = Integer.parseInt(target[2]);

        // 계산을 위해 초로 변환
        int curSecAmount = curH * 3600 + curM * 60 + curS;
        int targetSecAmount = targetH * 3600 + targetM * 60 + targetS;

        int needSecAmout = targetSecAmount - curSecAmount;
        if (needSecAmout <= 0) needSecAmout += 24 * 3600;

        int needH = needSecAmout / 3600;
        int needM = (needSecAmout % 3600) / 60;
        int needS = needSecAmout % 60;

        System.out.printf("%02d:%02d:%02d", needH, needM, needS);
        }
    }
