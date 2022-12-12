package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int MaximumMovementSpeed;
    private String fuel;
    private double fuelPercentage;

    public Transport(String brand, String model, int productionYear,
                     String productionCountry, String color,
                     int maximumMovementSpeed, String fuel, double fuelPercentage) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (productionYear < 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        if (productionCountry == null) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
        setMaximumMovementSpeed(maximumMovementSpeed);
        this.fuel = fuel;
        this.fuelPercentage = fuelPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getMaximumMovementSpeed() {
        return MaximumMovementSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed <= 0) {
            maximumMovementSpeed = 120;
        }
        this.MaximumMovementSpeed = maximumMovementSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "<<" +
                "  " + brand +
                " >> модель " + model +
                " год выпуска " + productionYear +
                " в " + productionCountry +
                " цвет " + color +
                " скорость " + MaximumMovementSpeed + " км/ч топливо ("
                +fuel+ ") заправлен на " +fuelPercentage+ " %";
    }
}
