package enumeration.ex0;

public class DiscountService {

    private String[] grade_list = {"BASIC", "GOLD", "DIAMOND"};
    private int discountPercent = 0;
    public int discount(String grade, int price) {
        if (grade.equals(grade_list[0])) {
            discountPercent = 90;
        } else if (grade.equals(grade_list[1])) {
            discountPercent = 80;
        } else if (grade.equals(grade_list[2])) 
            discountPercent = 70;
     else {
        System.out.println("에러!!");
    }
        
        
        return price * discountPercent / 100;

    }



}

/*
* 고객을 3등급으로 나누고 상품 구매시 등급별로 할인을 적용한다. 할인시 소수점 이하는 버린다.
* Basic = 10%
* Gold = 20%
* Diamond = 30%
* 회원등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 만들어보자.
* 예를 들어 GOLD, 10000 을 입력하면 할인 대상 금액인
* */
