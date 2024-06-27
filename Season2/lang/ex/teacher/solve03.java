package wrapperC.ex;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;




public class Tex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 듣지 못하느 사람 수
        int M = sc.nextInt(); // 보지 못하는 사람 수

        Set<String> nohear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nohear.add(sc.next()); // 듣지 못하는 사람의 이름을 hashset에 추가
        }

        // 듣지도 못하고 보지도 못하는 사람들을 list에 넣음
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (nohear.contains(name)) { // 입력받은 이름이 set에 있는지 확인
                ans.add(name); // set에 이름이 있으면 이는 듣지 못하고 보지도 못하는 사람이다.
            }
        }
        // 오름차순 정렬
        Collections.sort(ans);

        System.out.println(ans.size());

        for (String name: ans) {
            System.out.println(name);
        }
    }
}
