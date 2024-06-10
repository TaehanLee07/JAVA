# Sc_java  
# Zzz
import java.util.*;

public class Main {

    public static List<Integer> findTopCandidates(int N, List<Integer> votes) {
        // 투표수를 저장할 맵
        Map<Integer, Integer> voteCount = new HashMap<>();

        // 각 후보에 대한 투표 수 계산
        for (int vote : votes) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }

        // 최대 투표 수 찾기
        int maxVotes = Collections.max(voteCount.values());

        // 최대 투표 수를 받은 후보들 찾기
        List<Integer> topCandidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() == maxVotes) {
                topCandidates.add(entry.getKey());
            }
        }

        // 후보 번호 오름차순 정렬
        Collections.sort(topCandidates);
        return topCandidates;
    }

    public static void main(String[] args) {
        // 테스트 케이스 #1
        int N1 = 5;
        List<Integer> votes1 = Arrays.asList(1, 5, 4, 3, 2, 5, 2, 5, 5, 4);
        System.out.println(findTopCandidates(N1, votes1));  // 출력: [5]

        // 테스트 케이스 #2
        int N2 = 4;
        List<Integer> votes2 = Arrays.asList(1, 3, 2, 3, 2);
        System.out.println(findTopCandidates(N2, votes2));  // 출력: [2, 3]
    }
}
