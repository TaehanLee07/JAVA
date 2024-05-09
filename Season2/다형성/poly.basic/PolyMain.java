package poly.basic;

public class PolyMain {
    /*
      1. 객체지향 프로그래밍의 대표 특성 : 캡슐화 상속 다형성
      2. 다형성은 객체지향 프로그래밍의 꽃이라 불린다
      3. 다형성은 말 그대로 '다양한 형태' , '여러 형태' 를 뜻함
      4. 프로그래밍에서  다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 능력을 뜻한다.
      5. 보통 하나의 객체는 하나의 타입으로 고정되어 있는데 다형성을 사용하면 하나의 객체가 다른 타입으로 사용될 수 있다는 뜻이다.

      다형성 2가지 핵심 이론
      다형적 참조
    */
    public static void main(String[] args) {
        // 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod 오류 발생 즉 자식의 기능은 호출할 수 없다.

        // Child child1 = new Parent(); 오류 발생 즉 자식은 부모를 담을 수 없다.
 
        // Upcasting : 생략 가능
        // Downcasting : 부모 타입을 잠깐 자식 타입으로
    }
}
