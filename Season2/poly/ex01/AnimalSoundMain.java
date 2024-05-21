package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 종료");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 종료");

        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 종료");
    }

}

/*
    코드의 핵심은 Animal animal 부분이다
    - 다형적 참조 덕에 animal 변수는 자식인 dog, cat, cow의 인스턴스를 참조할 수 있다.
    - 메서드 오버리이딩 덕분에 animal.sound()룰 호출해도 dog.sound(), cat.sound(), cow.sound()의 값이 각 인스턴스의
        메서드를 호출할 수 있다.

**/
