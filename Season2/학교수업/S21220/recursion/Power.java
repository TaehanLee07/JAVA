package recursion;

public class Power {
	static int power(int base, int exponet) {
		if (exponet == 0) {
			return 1;
		}else {
			return base * power(base, exponet-1);
		}
	}
	public static void main(String[] args) {
		final int BASE = 2;
		final int EXPONET = 8;
		System.out.println(BASE + "의 " + EXPONET + "승 = " + power(BASE, EXPONET));
	}
}
