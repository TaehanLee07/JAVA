package S21220_00;

class Circle {
	int radius;	// 자료형 필드 반지름
	String color; // 자료형 필드 색깔

	double calcArea() {	// 반환 메소드
		return 3.14 * radius * radius; // 값 리턴
	}

}

public class S21220_99_ValueClassTest {
	public static void main(String[] args) {
		Circle a; // 참조변수 선언
		a = new Circle(); // 객체 생성
		a.radius = 100; // 객체 필드접근
		a.color = "blue"; // 객체 필드접근
		double area = a.calcArea(); // 객체 메소드 접근
		System.out.println("a필드 색상: " + a.color + " 원의 멱적 : " + area); // 출력

		Circle b; // 참조변수 선언
		b = new Circle(); // 객체 생성
		b.radius = 20; // 객체 필드접근
		b.color = "white"; // 객체 필드접근
		double area2 = b.calcArea(); // 객체 메소드 접근
		System.out.println("b필드 색상: " + b.color + " 원의 멱적 : " + area2); // 출력
		
		Circle c; // 참조변수 선언
		c = new Circle(); // 객체 생성
		c.radius = 75; // 객체 필드접근
		c.color="red"; // 객체 필드접근
		double area3 = c.calcArea(); // 객체 메소드 접근
		System.out.println("c필드 색상: "+c.color+" 원의 멱적 : "+area3); // 출력
	}

}


