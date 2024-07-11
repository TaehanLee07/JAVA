package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    int discountPercent = 0;
    public int discount(ClassGrade classGrade, int price) {
        if (classGrade == classGrade.BASIC) {
            discountPercent = 90;
        } else if (classGrade == classGrade.GOLD) {
            discountPercent = 80;
        } else if (classGrade == classGrade.DIAMOND) {
            discountPercent = 70;
        } else {
            System.out.println("에러!!");
        }
        return price * discountPercent / 100;

    }
}
