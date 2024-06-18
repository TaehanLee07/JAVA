package S21220_java90;

class Data_1 {	 // Data1() {} 컴파일시 class 파일에 자동생성
	int value;
}

class Data_2 {	// 매개 변수 있는 생성자
	int value;
	Data_2() {}
	// Data2() {}기본생성자 없으면 error
	Data_2(int x) {
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}
