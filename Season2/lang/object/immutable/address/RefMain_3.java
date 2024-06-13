package lang.immutable.address;

public class RefMain_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("부산 -< b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
/*
불변 객체
필요성 : 공유하면 안되는 객체를 여러 변수에서 공유했기 때문에 문제가 발생한다.
    - 하지만 앞서 살펴 보았듯이 객체의 공유를 막을 수 있는 방법이 없다.
    - 그런데 사이드 이펙트의 더 근본적인 원인을 고려해보면 객체를 공유하는 것 자체는 문제가 아니었다.
    - 문제의 직접적인 원인은 공유한 객체의 값을 변경한 것에 있다!!!

 */
