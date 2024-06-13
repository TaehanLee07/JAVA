package S21220_00;

public class S21220_01v99 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("기본변수 == :" + (str1 == str2));
		System.out.println("기본변수 equals : " + (str1.equals(str2)));
		
		// 참조 변수로 사용된 경우
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("참조변수 == :" + (str3 == str4));
		System.out.println("참조변수 equals :" + (str3.equals(str4)));

		
	}
}
