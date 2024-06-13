package S21220_00;

import java.util.Scanner;

public class S21220_04 {
	public static void main(String[] args) {
		
		System.out.println("매개변수의 갯수 : " + args.length);
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}
