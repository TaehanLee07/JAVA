package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        
        // 모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }
        
        // Stirng -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능하다.

        /*
        1. Arrays.toString(): 배열의 참조값이 아닌 내부의 값을 출력할 때 사용
        2. values(): 모든 ENUM 상수를 포함하는 배열을 반환
        3. name(): ENUM 상수의 이름을 문자열로 반환함
        4. ordinal(): ENUM 상수의 선언 순서( 0부터 시작)을 반환한다.
        5. toString(): ENUM 상수의 이름을 문자열로 변환한다. name() 메서드와 유사하지만, toString()은
            직접 오바라이딩을 할 수 있다.
        주의!! - ordinal()은 가급적 사용하지 않는 것이 좋다!
        만약 중간에 BAISC과 GOLD사이에 SILVER 라는 값이 들어오면 DIAMOND는 2번에서 밀려 3번이 된다.
        */
    }
}
// 모든 열거형은 java.lang.Enum을 자동으로 상속 받는다.
// 따라서 그 클래스가 가지고 있는 기능들을 사용할 수 있다.
