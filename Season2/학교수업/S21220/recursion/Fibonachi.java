package recursion;

public class Fibonachi {
	static int fibonachi(int num) {
		System.out.println("fibonachi : " + num);
		if (num  < 2) {
			return num;
		}else {
			System.out.println("fibonachi if : " + num);
			return fibonachi(num-1) + fibonachi(num-2);
		}
	}
	public static void main(String[] args) {
		System.out.println("fibonachi number :" + fibonachi(3));
	}
}
