package lang.object.poly;

public class ObjectPolyExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }
    private static void action(Object obj) {
        // 부모는 자식 메서드를 참조할 수 없다.
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
