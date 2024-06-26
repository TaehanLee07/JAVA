package game_system;

import charcaters.Character;

public class Play {
    public int curTurn;


    void turnStart() {
        System.out.println(curTurn + "번째 턴 시작");
    }

    void turnEnd() {
        System.out.println(curTurn + "턴 끝");
        Character character = new Character();
        character.totalMana += character.regenMana;
    }
}
