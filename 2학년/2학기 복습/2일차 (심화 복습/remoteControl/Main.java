package remoteControl;

public class Main {
    public static void main(String[] args) {
        Tv samsungTv = new SamsungTv();
        Tv lgTv = new LGTV();
        Tv appleTv = new APPLETV();
        UniversalRemote remote = new UniversalRemote();

        // 삼성 Tv와 페어링
        remote.pairWith(samsungTv);
        remote.setPower(true); // 전원 on
        remote.setChannel(5); // 5번 채널로 변경
        remote.watchStreaming();
        remote.adjustVolume(80);
        remote.setPower(false);

        System.out.println("=============================");

        // LG Tv와 페어링
        remote.pairWith(lgTv);
        remote.setPower(true); // 전원 on
        remote.setChannel(5); // 5번 채널로 변경
        remote.watchStreaming();
        remote.adjustVolume(70);
        remote.setPower(false);

        System.out.println("=============================");
        // APPLE Tv와 페어링
        remote.pairWith(appleTv);
        remote.setPower(true); // 전원 on
        remote.setChannel(5); // 5번 채널로 변경
        remote.watchStreaming();
        remote.adjustVolume(60);
        remote.setPower(false);
    }
}
