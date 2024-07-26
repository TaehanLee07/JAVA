public enum FuelType {
    GASOLINE(0.8), DIESEL(0.9), ELECTRIC(0.95);

    double efficiency;

    FuelType(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void calculateRequiredFuel(Double distance) {
    }
}
