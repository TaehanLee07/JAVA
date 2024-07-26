public class TestTransportMain2 {
    public static void main(String[] args) {
        TransportManager<Car> carManager = new TransportManager<>();
        Car car = new Car(50.0, FuelType.GASOLINE);
        carManager.setTransport(car);
        carManager.moveTransport(20.567);
        System.out.println("남은 연료: " + (car).getRemainingFuel());
        typeOfTransport(car);

        System.out.println("--------------------------------");

        TransportManager<Bicycle> bicycleManager = new TransportManager<>();
        Bicycle bicycle = new Bicycle(3);
        bicycleManager.setTransport(bicycle);
        bicycleManager.moveTransport(10.234);
        typeOfTransport(bicycle);

        System.out.println("--------------------------------");

        TransportManager<Train> trainManager = new TransportManager<>();
        Train train = new Train();
        trainManager.setTransport(train);
        trainManager.moveTransport(100.789);
        typeOfTransport(train);

        System.out.println("--------------------------------");

        TransportManager<Motorcycle> motorcycleManager = new TransportManager<>();
        Motorcycle motorcycle = new Motorcycle(10.0, FuelType.DIESEL);
        motorcycleManager.setTransport(motorcycle);
        motorcycleManager.moveTransport(5.5);
        System.out.println("남은 연료: " + motorcycle.getRemainingFuel());
        typeOfTransport(motorcycle);

    }
    private static void typeOfTransport(Movable type) {
        System.out.println("교통수단 종류: " + type.getTransportType());
    }

    private static void refRemainFuel(FuelType fuelType) {
        System.out.println("남은 연료: " + fuelType);
    }
}
