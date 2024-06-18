package S21220_java20;

public class Student {
	int a = 15;
	
	public void pub() {
		System.out.println("public : " + a);
	}
	protected void pro() {
		System.out.println("protected");
	}
	void def() {
		System.out.println("default");
	}
	private void pri(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}
	public void showPrivate(int a, int b) {
		pri(a,b);
	}
}
