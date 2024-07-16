package enumeration.ex3;

public class EnumEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // Grade grade = new Grade(); : enum은 객체 생성이 불가하다.
        // enum은 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가능 하다.
        // 생성할 경우에는 컴파일 오류가 발생한다. (enum뭐시기 에러 뜸)
    }
}
/*
열거형의 장점
 - 1. 타입 안정성 향상 : 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능성이 없다.
   만약 유효하지 않은 값을 입력할 경우 컴파일 오류가 발생한다.
 - 2. 간결성 및 일관성 : 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장된다.
 = 3. 확장성 : 새로운 회원 등급을 타입을 추가하고 싶을 때, ENUM에 상수를 추가하기만 하면된다.
*/
