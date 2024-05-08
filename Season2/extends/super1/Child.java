package extends1.super1;

public class Child extends Parent{
    public String value = "Child";
    @Override
    public void hello() {
        System.out.println("Child Hello");
    }
    public void call() {
        System.out.println("자식의 밸류 : " + this.value); // this 생략 가능
        System.out.println("부모의 밸류 : " + super.value);

        this.hello(); // 자식이 가지고 있는 (오버라이딩딘 hello  함수 호출)
        super.hello(); // 부모가 가지고 있는 hello 호출
    }
}
