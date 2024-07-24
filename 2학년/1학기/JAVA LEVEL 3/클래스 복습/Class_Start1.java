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

		/* 
  		배열의 장점 :
    			- 배열을 사용해서 정보들을 저장하려고 함.
   			- 정보가 늘어 날 때마다 뭔가를 추가할 필요도 없음.
    			- 출력 또한 반복문을 사용해서 원활하게 출력할 수 있음.
    			- 하지만 배열은 데이터의 변경과 삭제가 굉장히 어려워짐.
    - 			- 따라서 클래스라는 개념이 등장하게 됨!
		*/
	}
}
