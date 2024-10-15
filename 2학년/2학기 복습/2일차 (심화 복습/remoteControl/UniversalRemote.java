package remoteControl;

public class UniversalRemote implements RemoteControl{

    private Tv pairedTv;

    // Tv와 리모컨을 페어링 하는 메소드 하나 필요함

    public void pairWith(Tv tv) {
        // 아마 다른 tv와 페어링 되어있을 경우
        if (pairedTv != null && pairedTv != tv) {
            System.out.println(pairedTv.getTvName() + "s pairing has been disconnected.");
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
        }
        else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }

    @Override
    public void nextChannel() {
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            pairedTv.changeChannel(pairedTv.getCurrentChannel() + 1);
        }
        else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }

    @Override
    public void previousChannel() {
        if (pairedTv != null && pairedTv.isPaired() && pairedTv.isPowerOn()) {
            pairedTv.changeChannel(pairedTv.getCurrentChannel() - 1);
        }
        else if (pairedTv == null || !pairedTv.isPaired()) {
            System.out.println("No Tv is paired");
        } else {
            System.out.println("The Tv is OFF. Cannot change channel");
        }
    }
}
