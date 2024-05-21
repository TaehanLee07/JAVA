package poly.ex06;

public class Bird extends AbstatctAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 하늘을 난다.");
    }
}
