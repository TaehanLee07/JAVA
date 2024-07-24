package class1;

public class Class_Start5 {
	public static void main(String[] args) {

		// 리펙토링
		// 1. 선언 단일화 (배열로만 접근)
		// 2. 출력문구를 반복문을 통해 심플하게 바꿈
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();

		students[0].stu_name = "홍길동";
		students[1].stu_name = "장발장";
		students[0].age = 15;
		students[1].age = 16;
		students[0].grade = 90;
		students[1].grade = 80;

		for (int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].stu_name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
		}
    
		for (Student s : students) {
			System.out.println("이름 : " + s.stu_name + " 나이 : " + s.age + " 성적 : " + s.grade);
		}
    
	}
}
