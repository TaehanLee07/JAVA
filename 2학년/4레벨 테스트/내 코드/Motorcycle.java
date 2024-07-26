public class Motorcycle implements Movable {

    private double fuel;
    private FuelType fuelType;

    public Motorcycle(double fuel, FuelType fuelType) {
        this.fuel = fuel;
        this.fuelType = fuelType;
    }

    @Override
    public void move(Double distance) {
        if (distance > fuel * 1.1)
            System.out.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");
        else {
            fuel -= distance * 1.1;
            System.out.println("오토바이가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);
        }
    }

    @Override
    public TransportType getTransportType() {
        return TransportType.MOTORCYCLE;
    }

    public double getRemainingFuel() {
        return fuel;
    }
}
