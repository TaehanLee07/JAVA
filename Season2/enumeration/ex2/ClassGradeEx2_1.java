package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService dis = new DiscountService();
        int basic = dis.discount(ClassGrade.BASIC, price);
        int gold = dis.discount(ClassGrade.GOLD, price);
        int diamond = dis.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);

    }
}
