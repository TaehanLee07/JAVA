package S21220_00;

import java.io.IOException;

public class S21220_01v51 {
	public static void main(String[] args) throws IOException {

		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);

			if (keyCode == 113) {
				System.out.println("종료");
				break;
			}
		}
	}
}
