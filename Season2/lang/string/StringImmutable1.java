package lang.string;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" java");
        System.out.println("Str = " + str); // Hello 출력 : String은 불변 객체 이다.
        // String은 불변 객체이다 따라서 생성 이후에 내부 문자열 값을 변결할 수 없다.

    }
}
