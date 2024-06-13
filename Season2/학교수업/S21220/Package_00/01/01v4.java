package S21220_00;

public class S21220_01v4 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		double res = x / y;
		double res1 = x / (double)y;
		double res2 = (double)x / (double)y;
		double res3 = (double)x / y;

		
		System.out.println("result1 : " + res);
		System.out.println("result2 : " + res1);
		System.out.println("result3 : " + res2);
		System.out.println("result4 : " + res3);
	}

}
