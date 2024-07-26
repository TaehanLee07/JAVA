public enum TransportType {
    CAR(150, "자동차"),
    BICYCLE(20, "자전거"),
    TRAIN(300, "기차"),
    MOTORCYCLE(100, "오토바이");

    private final double speed;
    private final String description;

    TransportType(double speed, String description) {
        this.speed = speed;
        this.description = description;
    }

    public double getSpeed() {
        return speed;
    }

    public String getDescription() {
        return description;
    }
}
