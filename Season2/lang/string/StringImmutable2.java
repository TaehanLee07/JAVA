package lang.string;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = str.concat(" java");
        str.concat(" java");
        System.out.println("Str = " + str);
        System.out.println("Str2 = " + str2);

    }
}
// 변경이 필요한 경우 기존 값을 변경하지 않고 새로운 결과를 만들어서 반환한다.

// String이 불변으로 설계된 이유
// 문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 변경된다.
// 즉 사이드 이펙트가 발생한다.
