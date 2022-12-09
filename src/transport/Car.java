package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission; // коробка передач
    private final String bodyType;  // тип кузова
    private String registrationNumber; // регистр номер
    private final int numberOfSeats;  // количество мест
    private boolean summerTires; // резина

      public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (color == null) {
            color = "белый";
        }
        this.color = color;
        if (productionYear < 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        if (productionCountry == null) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Седан";
        }
        this.bodyType = bodyType;
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;
        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;
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

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getnumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(this.engineVolume, 0D) <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTyres() {
        setSummerTires(!summerTires);
    }

    public boolean isValidNumber() {
        // x000xx000
        boolean result = true;

        result = result && registrationNumber.length() == 9;
        result = result && Character.isLetter(registrationNumber.charAt(0))
                && Character.isLetter(registrationNumber.charAt(4))
                && Character.isLetter(registrationNumber.charAt(5));
        result = result && Character.isDigit(registrationNumber.charAt(1))
                && Character.isDigit(registrationNumber.charAt(2))
                && Character.isDigit(registrationNumber.charAt(3))
                && Character.isDigit(registrationNumber.charAt(6))
                && Character.isDigit(registrationNumber.charAt(7))
                && Character.isDigit(registrationNumber.charAt(8));
        return result;
    }

    @Override
    public String toString() {
        return brand + " " + model + " , " + productionYear + " год выпуска, сборка в "
                + productionCountry + ", " + color + " цвета, объем двигателя "
                + engineVolume + ", Коробка передачь (" + transmission + ')' +
                ", Тип кузова (" + bodyType + ')' + ", Регистрационный номер: ("
                + registrationNumber + ')' + ", Количество мест- " + numberOfSeats +
                ", Тип резины " + summerTires + '.';
    }

    public void print() {
        System.out.println(this);
    }
}


