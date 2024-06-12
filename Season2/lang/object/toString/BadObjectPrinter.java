package lang.object.toString;

import lang.object.Parent;

public class BadObjectPrinter {
    public static void print(Car car) {
        String string = "객체 정보 출력 : " + car.carInfo();
        System.out.println(string);
    }
    public static void print(Dog dog) {
        String string = "객체 정보 출력 : " + dog.dogInfo();
        System.out.println(string);
    }

}
/*
구체적인 것에 의존
- BadObjectPrinter : 구체적인 타입인 Car, Dog를 사용한다 따라서 이후에 출력해야 할 구체적인 클래스가 10개로 늘어나면
- 결과적으로 메서드도 10개를 늘어나야 한다.
- BadObjectPrint는 클래스가 구체적인 특정 클래스인 Car, Dog 를 사용하는 것을 BadObjectPrinter는 Car, Dog에 의존한다고 표현한다.
- 이 문제를 해결하기 위해 자바에서는 객체의 정보를 사용할 때 다형적 참조문제를 해결해줄 Object 클래스의 메서드 오버라이딩
    문제를 해결해 줄 Object.toString() 메서드가 있다.
추상적인 것에 의존
- 앞서만든 Car, Dog와 같은 구체적인 클래스를 사용하는것이 아니라 추상적인 Object클래스를 사용했다.
- 이렇게 ObjectPrinter 클래스가 Object클래스를 사용하는 것을 ObjectPrinter 클래스가 Object 클래스에 의존한다고 표현한다.

OCP 원칙
- Open : 새로운 클래스를 추가하고 toString() 오버라이딩 해서 기능을 확장할 수 있다.
- Close : 새로운 클래스를 추가해도 Object, 와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter()는 변경하지 않아도 된다.

*/
