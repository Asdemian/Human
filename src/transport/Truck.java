package transport;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик (" + getBrand() + ")" +
                " (" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик (" + getBrand() + ") " +
                "(" + getModel() + ") остановился");
    }

    @Override
    public String toString() {
        return " Грузовик " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик проехал пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 150);
    }
}
