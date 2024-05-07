package extends1.ex2;

public class ElectricCar extends Car{

    /*
    전기차는 extends Car 를 사용해서 부모 클래스인 Car를 상속받음
    그 덕분에 ElectricCar 에서도 move 메서드를 사용할수있다.
    */
    public void charge() {
        System.out.println("충전합니다.");
    }
}
