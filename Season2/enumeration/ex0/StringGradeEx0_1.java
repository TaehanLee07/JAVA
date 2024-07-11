package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;
        String grade = "gold";

        DiscountService dis = new DiscountService();
        System.out.println("BASIC : " + dis.discount("BASIC", price));
        System.out.println("GOLD : " +dis.discount("GOLD", price));
        System.out.println("DIAMOND : " +dis.discount("DIAMOND", price));
    }
}
