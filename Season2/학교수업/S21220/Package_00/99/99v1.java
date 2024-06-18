package S21220_00;

public class S21220_99_Pizza2 {
	
	int size;
	String type;
	public S21220_99_Pizza2() {
		size = 12;
		type = "슈퍼스프림";
	}
	public S21220_99_Pizza2(int s, String t) {
		size = s;
		type = t;
		if(s >= 25) {
			s+=2;
			type += "+ 감자칩";
		}
	}
	
	public static void main(String[] args) {
		S21220_99_Pizza2 obj1 = new S21220_99_Pizza2();
		System.out.println("size1 : " + obj1.size + " type1 : " + obj1.type + " 피자");
		S21220_99_Pizza2 obj2 = new S21220_99_Pizza2(27, "포테이토 ");
		System.out.println("size1 : " + obj2.size + " type1 : " + obj2.type);

	
		

	}
}
