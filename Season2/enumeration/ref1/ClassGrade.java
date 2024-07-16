package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade Baisc = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
}
// 상수를 정의할 때 각각의 등급에 따른 할인율이 적용됨
