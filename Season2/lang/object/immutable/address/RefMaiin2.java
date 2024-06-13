package lang.immutable.address;

public class RefMaiin2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산");
        b = new ImmutableAddress("부산");
        // 위 방법을 제외한 방법으로 할시 컴파일 에러가 발생한다.
        System.out.println("부산 -< b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
