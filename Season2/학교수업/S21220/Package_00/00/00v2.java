package S21220_00;

public class S21220_00v2 {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for(int cnt = 1; cnt < 11; cnt++) {
			if (cnt % 2 == 0) {
				sum += cnt;
			}else {
				sum2 += cnt;
			}
			System.out.println("cnt : " + cnt + " 짝수의 합 : " + sum + " 홀수의 합 : " + sum2 + " 합 : " + (sum + sum2));
			
			}
		}
	
	}

