package enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // enum에서는 switch 변경가능
        if (grade == Grade.BAISC)
            discountPercent = 10;
        else if (grade == Grade.GOLD)
            discountPercent = 20;
        else if (grade == Grade.DIAMOND)
            discountPercent = 30;
        else
            System.out.println("할인 X");

        return price * discountPercent / 100;
    }
}
