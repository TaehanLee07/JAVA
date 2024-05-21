package poly.ex4;

public class Cow implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println("소 이동");
    }

    @Override
    public void sound() {
        System.out.println("음메");
    }
}
