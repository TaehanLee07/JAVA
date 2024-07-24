package class1;

public class Class_Start4 {
	public static void main(String[] args) {
		// 배열을 이용한 클래스 사용
		Student stu1 = new Student(); 
		stu1.stu_name = "홍길동";
		stu1.age = 15;
		stu1.grade = 90;
		
		Student stu2 = new Student();
		stu2.stu_name = "장발장";
		stu2.age = 16;
		stu2.grade = 80;
		
		Student[] students = new Student[2];	// Student 타입의 2칸짜리 배열생성
		students[0] = stu1;
		students[1] = stu2;
		
		System.out.println(students[0].stu_name);
    
		// System.out.println(students[0].stu_name); 배열 접근 시작
		// System.out.println(005[0].stu_name); [0] 를 사용해서 005 배열의 0번 요소에 접근
		// System.out.println(005[0].stu_name); .(dot) 를 사용해서 참조값으로 객체에 접근
		// System.out.println("홍길동"); 
	} 
}
