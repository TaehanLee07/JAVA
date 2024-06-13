package S21220_00;

public class S21220_01v9 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int xNum = ++x + 10;
		int yNum = y++ + 10;
		
		System.out.println("++intxNum : "+xNum + " intx : " + x);
		System.out.println("intyNum++ : "+yNum + " inty : " + y);
		
		byte b1 = 1;
		byte b2 = -1;
		int b3 = b1 + b2;
		System.out.println(b3);
		
	}
}
