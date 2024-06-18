package S21220_java30;

public class OverLoading {
	public static void main(String[] args) {
		OverLoad overLoad = new OverLoad();
		overLoad.cal();
		overLoad.cal(3, 4);
		overLoad.cal(3);
		overLoad.cal(3.14, 9);
	}
}
