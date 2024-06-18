package S21220_00;

public class S21220_99_Pizza {
	
	int size;
	String type;
	public S21220_99_Pizza() {
		size = 12;
		type = "슈퍼스프림";
	}
	public S21220_99_Pizza(int s, String t) {
		size = s;
		type = t;
	}
	
	public static void main(String[] args) {
		S21220_99_Pizza obj1 = new S21220_99_Pizza();
		System.out.println("size1 : " + obj1.size + " type1 : " + obj1.type + " 피자");
		S21220_99_Pizza obj2 = new S21220_99_Pizza(24, "포테이토");
		System.out.println("size2 : " + obj2.size + " type2 : " + obj2.type + " 피자");
	}
}
