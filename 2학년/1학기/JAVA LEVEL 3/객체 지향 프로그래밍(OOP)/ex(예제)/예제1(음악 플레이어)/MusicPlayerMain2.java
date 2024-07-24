package oop;

public class musicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData MD = new MusicPlayerData();
        MD.isOn = true;
        MD.volume = 70;
        if (MD.isOn)
            System.out.println("음악플레이어 On");
        else
            System.out.println("음악플레이어 Off");
        System.out.println("현재 볼륨은 : " + MD.volume);

        MD.volume--;
        System.out.println("현재 볼륨은 : " + MD.volume);
      
        MD.volume++;
        System.out.println("현재 볼륨은 : " + MD.volume);
    }
}
