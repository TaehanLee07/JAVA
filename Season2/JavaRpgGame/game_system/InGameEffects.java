package game_system;

import characters.Character;

public class InGameEffects {
    // 이로운 효과 목록
    public int absoluteDef; // 절대 방어
    public int magicShield; // 주문 방어
    public int bloodClot; // 흡혈
    public int protect; // 보호

    public boolean ignore; // 무시
    public boolean invincibility; // 무적
    public boolean blessing; // 축복

    // 상태 이상 효과들
    public int flames; // 화상
    public int weakness; // 약화
    public int weakSpot; // 취약
    public int bleeding; // 출혈

    public boolean stun; // 기절
    public boolean silence; // 침묵
    public boolean control; // 억제

    public void isIgnore() {
        System.out.println("모든 상태이상을 무시합니다.");
        if (stun || silence || control) {
            stun = false;
            silence = false;
            control = false;
        } else if (flames >= 1 || weakness >= 1 || weakSpot >= 1 || bleeding >= 1) {
            flames = 0;
            weakness = 0;
            weakSpot = 0;
            bleeding = 0;
        }
    }

    public void invincibility(Character character) {
        character.shieldAmount *= 2;
        System.out.println("축복 상태를 발동하여 회복량과 보호막 획득량이 2배 증가합니다.");
    }
}
