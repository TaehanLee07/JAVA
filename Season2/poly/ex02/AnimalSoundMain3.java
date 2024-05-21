package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }
    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}

/*
    2 가지 문제점
    1. Animal 클래스를 생성할 수 있는 문제
    2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩 하지 않았을시 가능성
* */
