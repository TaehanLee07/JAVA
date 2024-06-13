package S21220_00;


public class S21220_03v4 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		while(true) {
			if(sum > 100) break;
			++i;
			sum += i;
			System.out.println("i : " + i + " sum : " + sum);
		}
		System.out.println("=====================");
		System.out.println("i : " + i + " sum : " + sum);
	}
	
}
