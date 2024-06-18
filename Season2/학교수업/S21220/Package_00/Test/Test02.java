package S21220_00;

public class Test02 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		do {
			cnt++;				
			sum = sum + cnt;
			System.out.println("sum : " + sum + " cnt : " + cnt);
			
		} while (cnt < 10);
		System.out.println("sum : " + sum + " cnt : " + cnt);
	}
	
}
