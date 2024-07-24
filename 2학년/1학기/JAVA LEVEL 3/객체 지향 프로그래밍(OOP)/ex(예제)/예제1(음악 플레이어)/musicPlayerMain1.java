package oop;

public class musicPlayerMain1 {
    public static void main(String[] args) {
        boolean isOn = false;
        int volume = 0;
        
        isOn = true;

        System.out.println("플레이어 On");

        volume++;
        System.out.println("현재 볼륨 : "  + volume);

        volume++;
        System.out.println("현재 볼륨 : "  + volume);

        volume--;
        System.out.println("현재 볼륨 : "  + volume);

        // 음악플레이어 상태
        if (isOn)
            System.out.println("음악플레이어 상태는 On 상태 볼륨은 : " + volume);
        else 
            System.out.println("음악플레이어 상태는 Off");

        isOn = false;
        System.out.println("종료합니다");
    }
}
