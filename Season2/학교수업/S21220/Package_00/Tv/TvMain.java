package S21220_java_70;

public class S21220_70_1 {
	public static void main(String[] args) {
		
		SmartTv sTv = new SmartTv();
		
		sTv.channel = 10;  // 조상 클래스로부터 상속받은 멤버
		sTv.channelUp();
		System.out.println(sTv.channel);
		sTv.displayCaption("2학년 12반 전체");
		sTv.caption = false;
		sTv.displayCaption("2학년 12반 전체 사랑한다 친구야~");
	}
}
