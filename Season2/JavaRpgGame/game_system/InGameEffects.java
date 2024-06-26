package game_system;

import charcaters.Character;

public class InGameEffects {
    // 이로운 효과 목록
    public int absoultDef; // 절대 방어
    public int magicShield; // 주문 방어
    public int bloodClot; // 흡혈
    public int protect; // 보호

    public boolean ignore; // 무시
    public boolean invincibility; // 무적
    public boolean blessing; // 축복
    // 상태 이상 효과들
    public int flames; // 화상
    public int weekNess; // 약화
    public int weekSpot; // 취약
    public int bleeding; // 출혈

    public boolean stun; // 기절
    public boolean silence; // 침묵
    public boolean control; // 억제

    void isIgnore() {
        System.out.println("모든 상태이상을 무시합니다.");
        if (stun || silence || control) {
            stun = false;
            silence = false;
            control = false;
        } else if (flames >= 1 || weekNess >= 1 || weekSpot >= 1 || bleeding >= 1) {
            flames = 0;
            weekNess = 0;
            weekSpot = 0;
            bleeding = 0;
        }
    }

    void Invincibility(Character character) {
        character.shieldAmount *= 2;
    }
}
