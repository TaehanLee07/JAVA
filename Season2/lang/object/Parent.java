package lang.object;
// public class Parent extend Object {
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
/*
클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속 받는다.
- 자바가 extends Object 코드를 넣어주는것이다.
- extends Object 는 생략하는 것을 권장한다.

*/
