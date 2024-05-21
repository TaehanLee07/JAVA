package poly.ex06;

public class Dog extends AbstatctAnimal{
    @Override
    void sound() {
        System.out.println("멍멍");
    }

    @Override
    void move() {
        super.move();
    }
}
