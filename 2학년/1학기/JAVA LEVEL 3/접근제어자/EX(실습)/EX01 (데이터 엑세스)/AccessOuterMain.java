package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod(); // publicMethod 호출 1

        // default - 패키지가 다르기 때문에 import를 받아왔다고 해도 자동완성도 안 되고 호출도 불가능함. -> 다른 패키지에서 호출이 불가능함.
        // data.defaultField = 2;
        // data.defaultMethod();

        // private - 자동완성도 안 되고 호출도 불가능함. -> 다른 클래스에서 호출이 불가능함.
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
        // publicMethod 호출 100
        // defaultMethod 호출 200 -> default로 막아놨더라도 해당 필드를 사용하는 메소드를 사용하면 접근이 가능함.
        // privateMethod 호출 300 -> private로 막아놨더라도 해당 필드를 사용하는 메소드를 사용하면 접근이 가능함.
    }
}
