package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	static int solution(int[] d, int budget) {
		int cnt = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (d[i] > budget)
				break;
			if (budget - d[i] > 0) {
				budget -= d[i];
				cnt++;
			}

		}

		return cnt;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서 개수 입력");
		int N = sc.nextInt();
		int empNums[] = new int[N];
		System.out.println("필요한 예산 입력");
		for (int i = 0; i < N; i++) {
			empNums[i] = sc.nextInt();
		}
		System.out.println("예산 입력");
		int yesan = sc.nextInt();
		System.out.println(solution(empNums, yesan));
		

	}
}
