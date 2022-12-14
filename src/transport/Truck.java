package transport;

public class Truck extends Transport implements Competing{

    private WeightСapacity weightСapacity;
    public Truck(String brand, String model, double engineVolume, WeightСapacity weightСapacity) {
        super(brand, model, engineVolume);
        this.weightСapacity = weightСapacity;
    }

    public WeightСapacity getWeightСapacity() {
        return weightСapacity;
    }

    public void setWeightСapacity(WeightСapacity weightСapacity) {
        this.weightСapacity = weightСapacity;
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
