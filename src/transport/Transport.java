package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    public Transport(String brand, String model,
                     double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (brand == null || brand.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void addDriver(Driver<?>... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }
    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }
    @Override
    public String toString() {
        return " " +
                " Брэнд (" + brand + ')' +
                " Модель (" + model + ')' +
                " Объем двигателя (" + engineVolume + ')';
    }

    public abstract void start();

    public abstract void stop();

    public void printType() {
    }

    public abstract boolean passDiagnostics();

    public abstract void repair();

}


