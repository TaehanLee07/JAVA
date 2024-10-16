package remoteControl;

public interface RemoteControl {
    void setPower(boolean power); // 전원 온오프
    void setChannel(int channel); // 채널 설정
    void nextChannel(); // 다음 채널
    void previousChannel(); // 이전 채널
    void adjustVolume(int level);
}
