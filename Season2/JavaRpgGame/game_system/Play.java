package game_system;

import characters.Character;

public class Play {
    public int curTurn;

    public void turnStart() {
        System.out.println(curTurn + "번째 턴 시작");
    }

    public void turnEnd(Character character) {
        System.out.println(curTurn + "턴 끝");
        character.totalMana += character.regenMana;
        System.out.println("캐릭터의 마나가 " + character.regenMana + "만큼 회복되었습니다.");
    }
}
