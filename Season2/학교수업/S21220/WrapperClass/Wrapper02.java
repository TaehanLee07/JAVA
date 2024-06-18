package S21220_java90;

public class S21220_wrapper_01 {
	public static void main(String[] args) {
		
		// 기본박싱
		System.out.println("--- 기본 박싱 및 언박싱 -------------");
		Integer is1 = new Integer(127);
		Integer is2 = new Integer("127");
		// 언박싱
		int si1 = is1.intValue();
		int si2 = is2.intValue();
		
		System.out.println("기본 박싱is1 : " + is1 + " 언 박싱si1 : " + si1);
		System.out.println("기본 박싱is2 : " + is2 + " 언 박싱si22 : " + si2);
		
		System.out.println("기박is1 : " + System.identityHashCode(is1) + "언박 : " + System.identityHashCode(si1));
		System.out.println("기박is2 : " + System.identityHashCode(is2) + "언박 : " + System.identityHashCode(si2));
		
		System.out.println("--- 자동 박싱 및 언박싱");
		
		System.out.println("자동 박싱ia1 : " + is1 + " 자동 언박싱a1 : " + si1);
		System.out.println("자동 박싱ia2 : " + is2 + " 자동 언박싱a2: " + si2);
		
		System.out.println("자박ia1 : " + System.identityHashCode(is1) + "언 : " + System.identityHashCode(si1));
		System.out.println("자박ia2 : " + System.identityHashCode(is2) + "언 : " + System.identityHashCode(si2));
	}
}
