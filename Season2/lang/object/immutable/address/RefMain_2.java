package lang.immutable.address;

public class RefMain_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -< b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /*
           참조형 데이터타입이기에 a 와 b 모두 같은값인 부산이 나온다
        */
    }
}
/*
사이드 이펙트 해결 방안
a 와 b 가 처음부터 서로 다른 인스턴스를 참조하게 만들면 된다

지금까지 발생한 모든 문제는 같은 객체(인스턴스)를 변수 a, b 가 함께 공유하기 때문에 발생한다.
따라서 객체를 공유하지 않으면 문제가 해결한다.
다만 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막을 수 있는 방법이 없다는 것이 문제다.

 */
