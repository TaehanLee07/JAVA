public class TestTransportMain1 {
    public static void main(String[] args) {
        TransportManager<Car> carManager = new TransportManager<>();
        Car car = new Car(50.0, FuelType.GASOLINE);
        carManager.setTransport(car);
        carManager.moveTransport(20.567);
        System.out.println("남은 연료: " + car.getRemainingFuel());
        System.out.println("교통수단 종류: " + car.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Bicycle> bicycleManager = new TransportManager<>();
        Bicycle bicycle = new Bicycle(3);
        bicycleManager.setTransport(bicycle);
        bicycleManager.moveTransport(10.234);
        System.out.println("교통수단 종류: " + bicycle.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Train> trainManager = new TransportManager<>();
        Train train = new Train();
        trainManager.setTransport(train);
        trainManager.moveTransport(100.789);
        System.out.println("교통수단 종류: " + train.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Motorcycle> motorcycleManager = new TransportManager<>();
        Motorcycle motorcycle = new Motorcycle(10.0, FuelType.DIESEL);
        motorcycleManager.setTransport(motorcycle);
        motorcycleManager.moveTransport(5.5);
        System.out.println("남은 연료: " + motorcycle.getRemainingFuel());
        System.out.println("교통수단 종류: " + motorcycle.getTransportType().getDescription());
    }
}
