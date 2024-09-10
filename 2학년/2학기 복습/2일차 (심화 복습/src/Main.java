package dayTwo.src;

public class Main {
    public static void main(String[] args) {
        Tv sTv = new SamsungTV();
        Tv lTv = new LGTV();

        System.out.println("삼성 tv 메서드 테스트\n" +
                "==========================");

        // 다른 기능 테스트를 위해 페어링
        sTv.doPairing();

        // 파워 (on/off)
        sTv.powerOff();
        sTv.powerOn();

        // 페어링 해제
        sTv.quitPairing();
        sTv.isPairing();

        // 페어링
        sTv.isPairing();
        sTv.doPairing();
        sTv.isPairing();

        // 채널 확인 및 변경
        sTv.showCurrentChannel();
        sTv.changeChannel(5);
        sTv.showCurrentChannel();

        // 기타 (tv 이름, 스트리밍 서비스)
        System.out.println("현재 tv : "+ sTv.getTvName());
        sTv.streamingService();

        System.out.println("==========================");

        System.out.println("\n");

        System.out.println("LG tv 메서드 테스트\n" +
                "==========================");

        // 다른 기능 테스트를 위해 페어링
        lTv.doPairing();

        // 파워 (on/off)
        lTv.powerOff();
        lTv.powerOn();

        // 페어링 해제
        lTv.quitPairing();
        lTv.isPairing();

        // 페어링
        lTv.isPairing();
        lTv.doPairing();
        lTv.isPairing();

        // 채널 확인 및 변경
        lTv.showCurrentChannel();
        lTv.changeChannel(5);
        lTv.showCurrentChannel();

        // 기타 (tv 이름, 스트리밍 서비스)
        System.out.println("현재 tv : "+ lTv.getTvName());
        lTv.streamingService();

        System.out.println("==========================");

        System.out.println("\n");

        System.out.println("UniversalRemote 메서드 테스트\n" +
                "==========================\n");
        UniversalRemote uTv = new UniversalRemote();
        uTv.doPairing(sTv);
        System.out.println(uTv.getTvName() + "의 UniversalRemote");


    }
}
