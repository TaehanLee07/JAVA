package characters;

public class Character {
    public String name;
    public long health;  // 체력
    public int attackDamage;    // 공격력
    public int abilityPower;    // 주문력
    public int defenseLv; // 방어력
    public int antiAbliltyLv; // 마법 저항력
    public short level; // 레벨
    public int totalMana;
    public int curMana;
    public int regenMana;
    public int shieldAmount = level;

    void normalAttack(String name, int attackDamage) {
        if (defenseLv >= attackDamage) {
            System.out.println("피해 상쇄됨.");
        } else {
            System.out.println(name + "의 공격 " + (attackDamage - defenseLv) + "의 데미지를 입음..");
            health -= attackDamage - defenseLv;
        }
    }

    void passive() {
        // 캐릭터 별 추가예정
    }

    void firstSkill(Character character) {
        if (curMana < usedMana) {
            System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
        }
    }

    void secondSkill(Character character) {

    }

    void thirdSkill(Character character) {

    }

    void defense() {
        System.out.println("방어 사용");
        health += shieldAmount;
    }

    void invincibility() {
        System.out.println("무적 상태가 발동되어 이번턴에는 죽지않습니다.");
        if(this.health <= 0) {
            this.health == 1;
            System.out.println("무적 상태!");
        }
    }
}
