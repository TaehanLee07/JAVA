package remoteControl;

public interface Tv {
    void setPower(boolean power); // power : true 켠것 else 꺼진 것
    void changeChannel(int channel); // 인자로 전달받은 채널번호로 변경
    int getCurrentChannel(); // 현재 채널 확인
    boolean isPowerOn(); // Tv의 전원이 켜져있는지 여부 확인
    boolean isPaired(); // Tv와 리모콘의 페어링 여부 확인
    void setPair(boolean pair); // Tv와 리모컨의 페어링 상태를 설정
    String getTvName(); //  Tv의 이름 반환
}
