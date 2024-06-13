package S21220_00;

import java.util.Scanner;

public class avrageFinder {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("과목개수 입력");
			int inputSubject = sc.nextInt();
			int[] subjects = new int[inputSubject];
			
			for (int i = 0; i < subjects.length; i++) {
				System.out.println("점수 입력 ");
				subjects[i] = sc.nextInt();
			}
		}
}
