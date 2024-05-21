package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animal_list = {dog, cat, cow};

        for (int i = 0; i < animal_list.length; i++) {
            System.out.println("동물 소리 시작");
            animal_list[i].sound();
            System.out.println("동물 소리 종료");
            System.out.println();
        }
    }

}
