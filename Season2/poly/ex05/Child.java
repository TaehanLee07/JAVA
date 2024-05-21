package poly.ex05;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("child.methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("child.commonMethod");
    }

    @Override
    public void methodB() {
        System.out.println("child.methodB");
    }
}
