package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();
        // default
        data.defaltField = 2;
        data.defaultMethod();
        //private : 다른 클래스에서 접근 불가

        // inner
        data.innerAccess();


    }
}
