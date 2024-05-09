package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // 다운캐스팅
        Child child = (Child)poly; // 자식 타입으로 형변환
        child.childMethod();
        // 일시적 다운캐스팅 메모리 공간을 아낄 수 있다
        ((Child)poly).childMethod();
    }
}
