package dayTwo.src;

public class UniversalRemote implements Tv{
    private String tvName;
    private int currentChannel;
    private boolean isOnTv;
    private boolean isPairing;
    private Tv pairingChannel;


    public UniversalRemote() {
        this.tvName = pairingChannel.getTvName();
        this.currentChannel = 1;
        this.isOnTv = false;
        this.isPairing = true;
    }

    // Tv 메서드 구현
    public void powerOn() {
        if (isPairing) {
            System.out.println("Tv의 전원이 켜집니다.");
            isOnTv = true;
        }
        else
            System.out.println("페어링 먼저 해주세요");
    }

    @Override
    public void powerOff() {
        if (isPairing) {
            isOnTv = false;
            System.out.println("Tv의 전원이 꺼집니다.");
        }
        else
            System.out.println("페어링 먼저 해주세요");
    }

    @Override
    public void changeChannel(int channel) {
        if (isPairing) {
            currentChannel = channel;
            System.out.println("채널을 " + channel + "번 째 채널로 변경합니다.");
        }
        else
            System.out.println("페어링 먼저 해주세요");
    }

    @Override
    public void showCurrentChannel() {
        if (isPairing)
            System.out.println("현재 채널은 " + currentChannel + " 입니다.");
        else
            System.out.println("페어링 먼저 해주세요");
    }

    @Override
    public boolean isPairing() {
        if (isPairing)
            return true;
        else
            return false;
    }

    @Override
    public void doPairing() {

    }
    @Override
    public void doPairing(Tv pairTv) {
        if (isPairing)
            System.out.println("이미 페어링이 된 상태입니다.");

        else {
            System.out.println("페어링 합니다.");
            pairingChannel = pairTv;
            isPairing = true;
        }
    }

    @Override
    public void quitPairing() {
        if (!isPairing)
            System.out.println("이미 페어링이 해제된 상태입니다.");
        else {
            isPairing = false;
            System.out.println("페어링 해제 합니다.");
        }

    }

    @Override
    public String getTvName() {
        return tvName;
    }

    @Override
    public void streamingService() {
        if (isPairing)
            if (isOnTv)
                pairingChannel.streamingService();
            else
                System.out.println("스트리밍 서비스를 이용하시려면 먼저 전원을 켜주세요");
        else
            System.out.println("페어링 먼저 해주세요");
    }
}
