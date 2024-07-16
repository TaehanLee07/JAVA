package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrde, int price) {
        return price * classGrde.getDiscountPercent() / 100;
    }
}
/*
기존에 if문은 완전히 제거되고, 단순한 할인율 계산 로직만 남았다.
변경된 코드에서는 if문을 사용할 이유가 없다.
단순히 회원등급 안에 있는 getDiscountPercent() 메서드를 호출하면 인수로 넘어온 회원 등급의 할인율을 바로 구할 수 있다.
 */
