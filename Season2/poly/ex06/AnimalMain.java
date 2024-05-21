package poly.ex06;

public class AnimalMain{
    public static void main(String[] args) {

        Dog d = new Dog();
        Chiken c = new Chiken();
        Bird b = new Bird();

        b.fly();
        b.sound();
        c.fly();
        c.sound();
        c.move();

        d.move();
        d.sound();
//      d.fly 에러

    }

    public void soundAnimal(AbstatctAnimal animal) {
        animal.sound();
    }
    public void flyAnimal(Fly animal) {
        animal.fly();
    }

}
