package class1;

public class Class_Start3 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 메모리에 학생클래스 생성하여 stu1이라는 갹채에 담아둠
		stu1.stu_name = "홍길동";
		stu1.age = 15;
		stu1.grade = 90;
		// stu1. : stu1의 메모리 주소에 접근해라 하는 의미
		Student stu2 = new Student();
		stu2.stu_name = "장발장";
		stu2.age = 16;
		stu2.grade = 80;

		System.out.println(stu1);	// 주소 
		System.out.println(stu2);	// 주소
		
		System.out.println("이름 : " + stu1.stu_name + " 나이 : " + stu1.age + " 성적 : " + stu1.grade);
		System.out.println("이름 : " + stu2.stu_name + " 나이 : " + stu2.age + " 성적 : " + stu2.grade);
		/*
		 클래스와 사용자 정의 타입 타입은 데이터의 종류나 형태를 나타냄 int는 정수형 String 은 문자열 타입 학생(Student)라는
		 타입을 만들면 좋지 않을까? 클래래스를 사용하면 int String과 같은 타입을 생성할수있음 사용자가 직접 정의하는 사용자 정의 타입을
		 설계도가 필요하고 이 설계도가 클래스임 설계도인 클래스를 사용해서 쉽게 메모리에 만들어진 객체 떠는 인스턴스라 함 클래스를 통해서 사용자가
		 원하는 종류의 데이터 마음껏 정의 할 수 있음
		 참조값을 변수에 보관하는 이유는 객체를 생성하는 new Student 코드 자체에는 이름이 없다
		 이코드는 ㅁ단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 기능만 함
		 따라서 생성한 객체에 접근할 방법이 필요함
		 객체를 생성할 때 반환되는 참조값(주소)를 알면 객체에 접근할 수 있음
		 따라서 반환되는 참조값(줏)를 저장할 변수가 필요하면
		 앞서 Student stu1로 선언한 변수에 참조값을 저장하여 필요할때 객체에 접근할 수 있음
		 
		 정리 
		 Student stu1 = new Student(); 객체 생성
		 Student stu1 = 0x0099ff // new Student() 결과로 주소 반환
		 stu1 = 0x0099ff 라는 주소가 담김
		 */
	}
}
