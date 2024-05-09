package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // 다운캐스팅
        // 부모 타입을 자식 타입으로
        Child child = (Child)poly; // 자식 타입으로 형변환
        child.childMethod();
    }
}
