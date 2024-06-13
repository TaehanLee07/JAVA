package recursion;

public class Gugudan {
	static void gugudan(int level, int count) {
		if (count > 9) {
			return;
		}
		System.out.printf("%d * %d = %d\n", level, count, level * count);
	}
	public static void main(String[] args) {
		System.out.println("구구단 출력");
		gugudan(2, 1);
	}
}
