package recursion;

public class Factorial {
	static int factorial(int num) {
		System.out.println("ing : " + num);
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("Factorial : " + factorial(5));
	}
}
