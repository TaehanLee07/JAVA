package charcaters;

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
    public int usedMana;
    public int shieldAmount = level;


    void normalAttack(String name, int attackDamage) {
        if (defenseLv >= attackDamage) {
            System.out.println("피해 상쇄됨.");
        } else {
            System.out.println(name + "의 공격 "+ (attackDamage-defenseLv)+ "의 데미지를 입음..");
            health -= attackDamage-defenseLv;
        }
    }



    void passive() {
        // 적군 별 추가예정
    }

    void firstSkill(Character character) {
        if (usedMana >= curMana) {
            System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
        }
    }

    void secondSkill() {

    }

    void thirdSkill() {

    }


    void defense() {
        System.out.println("방어 사용");
        health+=shieldAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    public int getDefenseLv() {
        return defenseLv;
    }

    public void setDefenseLv(int defenseLv) {
        this.defenseLv = defenseLv;
    }

    public int getAntiAbliltyLv() {
        return antiAbliltyLv;
    }

    public void setAntiAbliltyLv(int antiAbliltyLv) {
        this.antiAbliltyLv = antiAbliltyLv;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public int getTotalMana() {
        return totalMana;
    }

    public void setTotalMana(int totalMana) {
        this.totalMana = totalMana;
    }

    public int getCurMana() {
        return curMana;
    }

    public void setCurMana(int curMana) {
        this.curMana = curMana;
    }

    public int getRegenMana() {
        return regenMana;
    }

    public void setRegenMana(int regenMana) {
        this.regenMana = regenMana;
    }
}


