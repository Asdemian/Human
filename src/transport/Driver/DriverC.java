package transport.Driver;

import transport.Truck;

public class DriverC extends Driver<Truck>{

    public DriverC(String name, boolean hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stoptMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель "+getName()+" заправляет грузовик " +transport.getBrand());
    }



}
