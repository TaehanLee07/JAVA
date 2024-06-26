package wrapperC;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive- > wrapper
        int val = 7;
        Integer boxedVal = Integer.valueOf(val);

        // Wrapper -> primitive
        int unBoxedVal = boxedVal.intValue();

        System.out.println("boxedVal = " + boxedVal);
        System.out.println("unboxedVal = " + unBoxedVal);
    }
}
/*
Boxing : valueOf()
unBoxing : xxxValue()

- 개발자들이 오랜기간 개발을 하나보니 기본형을 래퍼클래스로 변환하거나 또는 래퍼클래스를 래퍼 클래스로 변환하는 일이 잦아졌다.
- 자바 1.5부터 오토 박싱과 오토 언박싱을 지원한다
*/
