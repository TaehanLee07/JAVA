package chap_04_;
// 구구단의 짝수단만 출력
public class _Ex_01_ {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i+=2) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
				
			}
			
		}
	}

}
