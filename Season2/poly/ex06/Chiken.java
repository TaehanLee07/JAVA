package poly.ex06;

public class Chiken extends AbstatctAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("꼬꼬댁");
    }

    @Override
    public void fly() {
        System.out.println("치킨이 하늘을 난다~");
    }
}
