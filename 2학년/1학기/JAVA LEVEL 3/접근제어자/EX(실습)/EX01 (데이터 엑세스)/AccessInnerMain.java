package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod(); // publicMethod 호출 1

        // default
        data.defaultField = 2;
        data.defaultMethod(); // defaultMethod 호출 2

        // private - 자동완성도 안 되고 호출도 불가능함. -> 다른 클래스에서 호출이 불가능함.
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
        // publicMethod 호출 100
        // defaultMethod 호출 200
        // privateMethod 호출 300 -> private로 막아놨더라도 해당 필드를 사용하는 메소드를 사용하면 접근이 가능함.
    }
}
