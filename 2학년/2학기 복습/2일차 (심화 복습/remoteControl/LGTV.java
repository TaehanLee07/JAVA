package remoteControl;

public class LGTV implements Tv {

    private int currentChannel = 1; // Tv의 초기채널은 1
    private boolean powerOn = false;
    private boolean paired = false;
    private int volume = 50;



    @Override
    public void setPower(boolean power) {
        // 리모컨과 페어링된 경우에만 전원을 키고 끌 수 있다.
        if (paired) {
            powerOn = power;
            if (power) {
                System.out.println("LG Tv is now On");
            } else {
                System.out.println("LG Tv is now Off");
            }
        } else {
            System.out.println("LG Tv is not Paired");
        }
    }

    @Override
    public void changeChannel(int channel) {
        // 페어링 된 상태에서 Tv도 켜져 있어야함
        if (paired && powerOn) {
            this.currentChannel = channel;
            System.out.println("현재 채널은 " + channel);
        } else if (!paired) {
            System.out.println("LG Tv is not Paired");
        }
        else {
            System.out.println("LG Tv is OFF");
        }
    }

    @Override
    public int getCurrentChannel() {
        return currentChannel;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public boolean isPaired() {
        return paired;
    }

    @Override
    public void setPair(boolean pair) {
        paired = pair;
        if (pair) {
            System.out.println("LG Tv paired with remote.");
        } else {
            System.out.println("LG Tv unPaired from remote");
        }
    }

    @Override
    public String getTvName() {
        return "";
    }

    // 공동 기능

    // 고유기능
    public void watchYoutube() {
        if (powerOn) {
            System.out.println("LG Tv: Now streaming Youtube");
        } else {
            System.out.println("LG Tv : is off Cannot stream");
        }
    }

    @Override
    public void adjustVolume(int level) {
        System.out.println("볼륨을 " + level + "로 변경합니다.");
        this.volume = level;
    }
}

