package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {

        /*
        부모 클래스 (슈퍼 클래스) : 상속을 통해 자신의 필드 와 메서드를 다른 클래스에 제공하는 클래스 (Car.java)
        자식 클래스 (서브 클래스) : 부모 클래스로 부터 필드 와 메서드를 상속받는 클래스 (ElectricCar, GasCar)
        자바는 다중 상속을 지원하지 않는다 그래서 extends 대상은 하나만 선택할 수 있다. (단일 상속)
        자바는 인터페이스를 이용해서 다중 구현을 사용하면 다중 상속과 같은 기능을 사용할 수 있다.
        */

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 상속받았기 때문에 사용가능함
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
