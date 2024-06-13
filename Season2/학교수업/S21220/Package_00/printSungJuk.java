package S21220_00;


public class printSungJuk {
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		String hakbun = "21200";
		int kor = 98;
		int eng = 91;
		int math = 100;
		int total = kor + eng + math;
		double aver = total / 3.;	// . 찍으면 96.3 이런식으로 나옴 int 를 double로 캐스팅할 필요없다
		
		String name2 = "차이점";
		String hakbun2 = "21299";
		int kor2 = 100;
		int eng2 = 99;
		int math2 = 96;
		int total2 = kor2 + eng2 + math2;
		double aver2 = total2 / 3.;
		
		
		System.out.println("성명	학번	국어	영어	수학	총점	평균");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s %-6s %4d  %4d  %4d  %4d  %5.1f \n", name, hakbun, kor, eng, math, total, aver);
		System.out.printf("%s %6s %-4d  %-4d  %-4d  %4d %5.1f \n", name2, hakbun2, kor2, eng2, math2, total2, aver2);

		
	}
}
