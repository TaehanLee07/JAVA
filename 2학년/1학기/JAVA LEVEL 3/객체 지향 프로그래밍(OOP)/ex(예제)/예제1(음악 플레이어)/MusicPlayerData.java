package oop;

public class MusicPlayerData {

    boolean isOn;
    int volume;

    void on() {
        isOn = true;
        System.out.println("플레이어 On");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 Off");
    }

    void volUp() {
        volume++;
        System.out.println("볼륨 1 증가 현재 볼륨 : " + volume);
    }

    void volDown() {
        volume--;
        System.out.println("볼륨 1 감소 현재 볼륨 : " + volume);

    }

    void showState() {
        if (isOn)
            System.out.println("음악플레이어 상태 : On 볼륨 : " + volume);
        else
            System.out.println("음악플레이어 상태 : On 볼륨 : " + volume);
    }

}
