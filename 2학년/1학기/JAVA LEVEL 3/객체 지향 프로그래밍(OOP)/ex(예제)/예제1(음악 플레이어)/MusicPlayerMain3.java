package oop;

public class musicPlayerMain3 {
    public static void main(String[] args) {

        //켜기 on(date);
        //볼륨 증가 volumeUp(data)
        //볼륨 감소 volumeDown(data)
        // 상태보기 showState
        // 끄기 off (data)

        MusicPlayerData data = new MusicPlayerData();
        data.off();
        data.on();
        data.volUp();
        data.volDown();
        data.showState();
    }
}
