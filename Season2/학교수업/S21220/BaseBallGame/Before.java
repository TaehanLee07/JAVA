package sungil212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseBall {
	public static int playGame() throws IOException {
		int x, y, z;
		Random r = new Random();

		x = Math.abs(r.nextInt() % 9) + 1;
		do {
			y = Math.abs(r.nextInt() % 9) + 1;
		} while (y == x);
		do {
			z = Math.abs(r.nextInt() % 9) + 1;
		} while ((z == x) || (z == y));
		
		System.out.println(x + ", " + y + ", " + z);
		return playGame(x, y, z);
	}

	public static int playGame(int x, int y, int z) throws IOException {
		int count = 0;
		int strike = 0, ball;
		int[] usr = new int[3];
		int[] com = { x, y, z };
		System.out.println("숫자 야구 게임");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("\n카운트: " + count);

			String user;
			System.out.println("1번째 숫자");
			user = in.readLine();
			usr[0] = Integer.parseInt(user);

			System.out.println("2번째 숫자");
			user = in.readLine();
			usr[1] = Integer.parseInt(user);

			System.out.println("3번째 숫자");
			user = in.readLine();
			usr[2] = Integer.parseInt(user);

			if ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0)) {
				System.out.println("0은 다시 입력해주세요.");
				continue;
			} else if ((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {
				System.out.println("1~9 숫자 중 하나 다시 입력해주세요.");
				continue;
			} else if ((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])) {
				System.out.println("모두 다른 숫자를 입력해주세요.");
				continue;
			}
			while ((usr[0] == 0) || (usr[1] == 0 || (usr[2] == 0) || (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)
					|| (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])))
				;
			strike = ball = 0;

			if (usr[0] == com[0]) strike++;
			if (usr[1] == com[1]) strike++;
			if (usr[2] == com[2]) strike++;
			if (usr[0] == com[1]) ball++;
			if (usr[0] == com[2]) ball++;
			if (usr[1] == com[0]) ball++;
			if (usr[1] == com[2]) ball++;
			if (usr[2] == com[0]) ball++; 
			if (usr[2] == com[1]) ball++;

			System.out.println("Strike: " + strike + " Ball: " + ball);

			count++;
		} while ((strike < 3) && (count < 11));

		return count;
	}

	public static void main(String[] args) throws IOException {
		int result;

		if (args.length == 3) {
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();

			result = playGame(x, y, z);
		} else {
			result = playGame();
		}
		System.out.println();
		if (result <= 2) {
			System.out.println("참 잘했어요");
		} else if (result <= 5) {
			System.out.println("잘했어요!");
		} else if (result <= 9) {
			System.out.println("보통이네요!");
		} else {
			System.out.println("분발하세요");
		}
	}
}
