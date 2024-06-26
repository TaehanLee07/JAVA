package wrapperC;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive- > wrapper
        int val = 7;
        Integer boxedVal = val;

        // Wrapper -> primitive
        int unBoxedVal = boxedVal;

        System.out.println("boxedVal = " + boxedVal);
        System.out.println("unboxedVal = " + unBoxedVal);
    }
}
/*
- 오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 valueOf, xxxValue()등의 코드를 추가해주는 기능이다.
- 떄문에 기본형과 래퍼형을 서로 편리하게 변환할 수 있다.
*/
