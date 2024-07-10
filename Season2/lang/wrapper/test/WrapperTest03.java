package lang.wrapper;

public class WrapperTest03 {
    public static void main(String[] args) {
        String str = "100";

        // String str을 Integer로 변환해서 출력
        // Interger를 int로 변환해서 출력
        // int를 Integer로 변환해서 출력
        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1; // 오토 언박싱
        Integer integer2 = intValue;

        System.out.println("str to Integer = " + integer1);
        System.out.println("Istr to int = " + intValue);
        System.out.println("istr to Integer = " + integer2);

    }

}
