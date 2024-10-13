package access;

public class Speaker {
    private int volume; // 직접 접근을 막음

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100)
            System.out.println("최대 음량입니다");
        else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 10 감소");
    }

    void showVolume() {
        System.out.println("현재 볼륨 : " + volume);
    }
}
