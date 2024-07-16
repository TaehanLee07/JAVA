package enumeration.ref1;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.Baisc, price);
        System.out.println("basic = " + basic);
    }
}
