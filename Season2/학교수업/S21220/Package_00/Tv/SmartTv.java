package S21220_java_70;

class Tv {
	// tv 의 속성(멤버 변수)
	int channel;	// 채널
	
	//tv 의 기능 메서드
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
}

 class SmartTv extends Tv{
	 boolean caption = true;
	 void displayCaption(String msg) {
		 if(caption) {
			 System.out.println(msg);
		 }
	 }
}
