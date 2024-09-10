package dayTwo.src;

public interface Tv {
    
    // Tv 전원 관련 메서드
    void powerOn();
    void powerOff();
    
    // 채널 관련 메서드
    void changeChannel(int channel);
    void showCurrentChannel();

    // 페어링 관련 메서드
    boolean isPairing();
    void doPairing();

    void doPairing(Tv pairTv);

    void quitPairing();

    String getTvName();

    void streamingService();
}
