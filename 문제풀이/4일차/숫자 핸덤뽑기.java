package test;

public class Ex11 {
	public static void main(String[] args) {
		// 1부터 10까지 의 정수중에서 래너믕로 뽑기 세 개의수가 서로 겹치지 않게 출력
		int range = 10;
		int start = 1;
		int a,b,c;
		
		// 0.0 부터 ~ 0.99
		// 0.0 ~ 9.99
		// 1.0 ~ 10.99
		// 1 ~ 10
		a = (int)(Math.random() * range + start);
		b = (int)(Math.random() * range + start);
		c = (int)(Math.random() * range + start);
		
		while (a == b || a == c || b == c == true) {	
			a = (int)(Math.random() * range + start);
			b = (int)(Math.random() * range + start);
			c = (int)(Math.random() * range + start);
			if (a == b || a == c || b == c == false) {
				break;
					
			}					
		}
		System.out.printf("%d,%d,%d",a,b,c);
	}
}
