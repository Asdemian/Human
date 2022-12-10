package transport;

public class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double MaximumMovementSpeed;

    public Transport(String brand, String model, int productionYear,
                     String productionCountry, String color,
                     double maximumMovementSpeed) {
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
        MaximumMovementSpeed = maximumMovementSpeed;
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

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        MaximumMovementSpeed = maximumMovementSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", MaximumMovementSpeed=" + MaximumMovementSpeed +
                '}';
    }
}
