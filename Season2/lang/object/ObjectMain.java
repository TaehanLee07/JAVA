package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString() : Object 클래스의 메서드이다
        System.out.println(child.toString());
    }
}
