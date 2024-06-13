package S21220_00;

public class S21220_02v2 {
	public static void main(String[] args) {
		double pi = 3.141592;
		// res 1 : 3
		System.out.println("결과 1 :" +(int) pi);
		// res 2 : 3.141592
		System.out.println("결과 2 :" +pi);
		// res 3 : 3141.592
		System.out.println("결과 3 :" +1000 * pi);
		// res 4 : 3142
		System.out.println("결과 4 :" +Math.round(pi * 1000));
		// res 5 : 3.142
		System.out.println("결과 5 :" +Math.round(pi * 1000) / 1000.0);
		// res 6 : 3.141
		System.out.println("결과 6 :" +(int)(pi * 1000) / 1000.0);
	}
}
