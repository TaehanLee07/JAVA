package access.a;

public class AccessData {
    public int publicField;
    int defaltField;
    private int privateField;

    public void publicMethod() {
        System.out.println("public 메서드 호출 : " + publicField);
    }
    void defaultMethod() {
        System.out.println("default 메서드 호출 : " + defaltField);
    }
    private void privateMethod() {
        System.out.println("private 메서드 호출 : " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaltField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
