package S21220_00;

public class printf {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격 %d원\n", value);
		System.out.printf("상품의 가격 %8d원\n", value);
		System.out.printf("상품의 가격 %-8d원\n", value);
		System.out.printf("상품의 가격 %08d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %9.2f\n",9, area);
		
		String name = "우리들";
		String job = "소프트웨어개발과";
		System.out.printf("%4d | %6s | %7s\n", 1, name, job);

	}
}
