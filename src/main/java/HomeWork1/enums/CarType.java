package HomeWork1.enums;

public enum CarType {
    Toyota(10,1.8),
    Porche (20, 3.9),
    BMW (30,5.1);


    private double amountOfFuel;
    private double fuelPerKm;

    CarType(double amountOfFuel, double fuelPerKm) {
        this.amountOfFuel = amountOfFuel;
        this.fuelPerKm = fuelPerKm;
    }

    public double getAmountOfFuel() {
        return amountOfFuel;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }
}
