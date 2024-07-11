package enumeration.ex1;

public class DiscountService {
    int discountPercent = 0;
    public int discount(String grade, int price) {
        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 90;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 80;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 70;
        } else {
            System.out.println("에러!!");
        }
        return price * discountPercent / 100;

    }
}

