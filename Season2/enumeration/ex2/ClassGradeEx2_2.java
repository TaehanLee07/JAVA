package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService dis = new DiscountService();

        /* ClassGrade newClassGrade = new ClassGrade();
        int result = dis.discount(newClassGrade, price);
        System.out.println("newCLassGrade 등급의 할인 금액 = " + result); */
    }
}
/* 사용자가 직접 인스턴스를 만들어서 접근 할 수 있는 문제가 생길 수 있다.
생성자를 private 처리해서 막아준다.

타입 안전 열거형 (Type-Safe Enum Pattern) 장점
- 타입 안정성 향상: 정해진 객체만 사용할 수 있기 떄문에 잘못된 값을 이볅하는 문제를 근본적으로 방지할 수 있다.
- 데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

단점
- 많은 코드를 작성해야 한다.
- 생성자를 private 로 처리해야 한다. */
