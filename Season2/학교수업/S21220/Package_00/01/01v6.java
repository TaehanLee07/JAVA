package S21220_00;

import java.io.IOException;

public class S21220_01v6 {
	public static void main(String[] args) throws IOException  {
		
		while(true) {
			int KeyCode = System.in.read();
			System.out.println("keycode : " + KeyCode);
			if (KeyCode == 113) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}
}
