package S21220_00;

import java.util.Scanner;

public class S21220_06_v1 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		t.channel = n;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "채널 입니다.");
		
		t.channelUp();
		System.out.println("현재 체널은 " + t.channel + "채널 입니다.");
		
		t.channel = 101;
		System.out.println("현재 채널은 " + t.channel);
	}
}
