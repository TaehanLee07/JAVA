package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public : 다른 패키지에 있어도 잘 작동
        data.publicField = 1;
        data.publicMethod();
        // default : 다른 패키지라 접근 불가
        // data.defaltField = 2;
        // data.defaultMethod();
        // private : 다른 클래스에서 접근 불가

        // inner
        data.innerAccess();


    }
}
