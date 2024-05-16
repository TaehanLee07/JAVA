package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        // 업 캐스팅
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child; // 업 캐스팅은 생략이 가능하다.

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
