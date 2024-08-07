package class1;

public class Class_Start2 {
	public static void main(String[] args) {
		// 배열을 사용한 코드
		String stu_names[] = { "홍길동", "장발장", "임꺽정", "로미오" };
		int stu_ages[] = { 15, 16, 17, 20 };
		int stu_scores[] = { 90, 80, 99, 70 };

		for (int i = 0; i < stu_names.length; i++)
			System.out.println("이름 : " + stu_names[i] + " 나이 : " + stu_ages[i] + " 성적 : " + stu_scores[i]);
		/*
		 배열사용시 아까와 같은 문제점이 안생김
		 1. 학생이 추가되어도 배열에 데이터만 추가하면 됨 변수 추가 x 
		 2. 출력을 반복문을 통해 배열을 순차적으로 선택하므로 학생이 추가되어도 출력코드를 추가할 필요가 없다.
		 3. 단점 : \코드변경은 최소화 되었으나 한 학생의 데이터가 3개의 배열로 나뉘어서 관리됨 데이터를 변경 삭제할때 매우 조심히
		 작업을 해야함 컴퓨터가 볼때는 문제가 없지만 사람이 관리하기에는 좋은 코드가 아님
		 
		 그래서 클래스를 도입함
		 클래스를 이용해서 학생이라는 개념을 만들고
		 각각의 학생별로 본인의 이름 나이 성적을 관리함
		 */
	}
}
