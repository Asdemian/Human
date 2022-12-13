package transport.Driver;

import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String name, boolean hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stoptMove(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель "+getName()+" заправляет автомобиль " +transport.getBrand());
    }
}
