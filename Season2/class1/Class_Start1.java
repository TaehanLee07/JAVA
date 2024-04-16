package class1;

public class Class_Start1 {
	public static void main(String[] args) {
		// 학생의 정보를 출력하는 프로그램을 만든다
		// 2명의 학생의 정보를 출력 이름, 나이, 성적
		// 1. 홍길동 15세 90점
		// 2. 장발장 16세 80점
		//출력
		// 이름 : [이름] 나이 : [나이]세 성적 : [성적]점
		// 변수를 사용해서 학생정보 저장하고 출력
		String stu1 = "홍길동";
		String stu2 = "홍길동";
		int stu1_age = 15;
		int stu2_age = 16;
		int stu1_score = 90;
		int stu2_score = 80;
		
		System.out.println("이름 : " + stu1  + " 나이 : " + stu1_age + " 성적 : " + stu1_score);
		System.out.println("이름 : " + stu2  + " 나이 : " + stu2_age + " 성적 : " + stu2_score);
		// 문제가 많음 위 방식은 학생이 늘어날때 마다 변수와 출력하는 코드를 추가해야하는 문제점이 있다!!
		// 위의 문제점을 배열을 사용해보자
		
		
	}
}
