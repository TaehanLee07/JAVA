package generics.coffee;

import generics.user.User;
import generics.user.VipUser;

public class CoffeeMain {
    public static void main(String[] args) {

        CoffeeBuyNumber c1 = new CoffeeBuyNumber(10);
        c1.ready();

        CoffeeBuyNickName c2 = new CoffeeBuyNickName("유재석");
        c2.ready();

        System.out.println("-----------------------");
        // 위처럼 똑같은기능을 하는 클래스를 두개 만들지않기 위해 오브젝트로 만든다.

        CoffeeByName c3 = new CoffeeByName(11);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        // 오브젝트 클래스 이기때문에 모든 값이 들어갈 수 있다.

        System.out.println("-----------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // 오브젝트의 문제
        // c4Name = (String)c3.name; // 실행 시 런타임때 오류가 난다.
        // int 를 String으로 형변환이 원래 안되지만 Object이기에 일단은 되는거 같지만
        // 런타임시 오류가 난다. 이러한 이유 때문에 제네릭 클래스가 사용된다.

        System.out.println("-----------------------");

        // 제네릭 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();

        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        System.out.println("-----------------------");

        Coffee<String> c6 = new Coffee<>("하하");
        c6.ready();

        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-----------------------");

        CoffeeBuyUser<User> c7 = new CoffeeBuyUser<>(new User("노홍철"));
        c7.ready();

        System.out.println();

        CoffeeBuyUser<User> c8 = new CoffeeBuyUser<>(new VipUser("정형돈"));
        c8.ready();

        System.out.println("-----------------------");

        orderCoffee("홍길동");
        orderCoffee("장발장", "아메리카노");

    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
