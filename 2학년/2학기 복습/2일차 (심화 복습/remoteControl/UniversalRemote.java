package remoteControl;

public class UniversalRemote implements RemoteControl {

    private Tv pairedTv;
    private int currentVolume = 50;

    // Tv와 리모컨을 페어링 하는 메소드 하나 필요함
    public void pairWith(Tv tv) {
        // 아마 다른 tv와 페어링 되어있을 경우
        if (pairedTv != null && pairedTv != tv) {
            System.out.println(pairedTv.getTvName() + "pairing has been disconnected.");
            pairedTv.setPair(false);
        }

        pairedTv = tv;
        tv.setPair(true);
    }

    @Override
    public void setPower(boolean power) {
        // 페어링 된 티비가 있고 그 티비가 페어링 된 상태일 떄만 전원 설정 가능
        if (pairedTv != null && pairedTv.isPaired()) {
            pairedTv.setPower(power);
        } else {
            System.out.println("No Tv is paired");
        }
    }

    @Override
    public void setChannel(int channel) {
        // 페어링 된 tv가 있고 tv의 전원이 켜져있을때만 가능
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            pairedTv.changeChannel(channel);
        } else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }

    @Override
    public void nextChannel() {
        // 페어링 tv 존재 tv 전원이 연결상태여야 사용 가능
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            int currentChannel = pairedTv.getCurrentChannel();
            if (currentChannel == 999) {
                pairedTv.changeChannel(0);
            } else {
                pairedTv.changeChannel(currentChannel + 1);
            }
        } else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }

    @Override
    public void previousChannel() {
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            int currentChannel = pairedTv.getCurrentChannel();
            if (currentChannel == 0) {
                pairedTv.changeChannel(999);
            } else {
                pairedTv.changeChannel(currentChannel - 1);
            }
        } else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }
    public void watchStreaming() {
        // 페어링 된 tv가 삼성인 경우 넷플릭스가 나와야함
        if (pairedTv instanceof SamsungTv) {
            ((SamsungTv) pairedTv).watchNetlix();
        } else if (pairedTv instanceof LGTV) {
            ((LGTV) pairedTv).watchYoutube();
        } else if (pairedTv instanceof APPLETV) {
            ((APPLETV) pairedTv).watchWavve();
        }
        else
            System.out.println("N0 streaming available for this Tv");
    }

    public void adjustVolume(int level) {
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            if (currentVolume >= 101 || currentVolume < 0) {
                System.out.println("볼륨은 100을 초과 할 수 없고 0 아래로 내려갈 수 없습니다.");
            } else {
                System.out.println("볼륨을 " + level + "로 설정합니다.");
                currentVolume = level;
            }
        } else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }


}
