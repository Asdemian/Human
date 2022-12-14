package transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        System.out.println("Автобус (" + getBrand() + ") " +
                "(" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус (" + getBrand() + ")" +
                " (" + getModel() + ") остановился");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 100);
    }
}
