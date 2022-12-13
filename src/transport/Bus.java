package transport;

public class Bus extends Transport {


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    /*   public Bus(String brand, String model, int productionYear,
                   String productionCountry, String color, int maximumMovementSpeed,
                   String fuel, double fuelPercentage) {
            super(brand, model, productionYear, productionCountry, color,
                    maximumMovementSpeed, fuel, fuelPercentage);
        }

        @Override
        public void refill() {
            System.out.println("Автобус запрален топливом " + getFuel());
            setFuelPercentage(100);
        }

      */
 @Override
 public void start() {
     System.out.println("Автобус (" + getBrand() + ") (" + getModel() + ") начал движение");
 }

    @Override
    public void stop() {
        System.out.println("Автобус (" + getBrand() + ") (" + getModel() + ") остановился");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }
}
