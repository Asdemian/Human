package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик (" + getBrand() + ") (" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик (" + getBrand() + ") (" + getModel() + ") остановился");
    }

    @Override
    public String toString() {
        return " Грузовик " + super.toString();
    }
}
