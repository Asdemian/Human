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
    private Key key;
    private Insurance insurance;

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
        setKey(null);
        setInsurance(null);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance(null, 6000, null);
        }
        this.insurance = insurance;
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
                ", Тип резины (" + summerTires + "). Запуск " + key + " Страховка "
                + insurance ;
    }

    public void print() {
        System.out.println(this);
    }

    public static class Key {
        private final boolean remoteRun;
        private final boolean withouKeyAccess;

        public Key(boolean remoteRun, boolean withouKeyAccess) {
            this.remoteRun = remoteRun;
            this.withouKeyAccess = withouKeyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithouKeyAccess() {
            return withouKeyAccess;
        }

        @Override
        public String toString() {
            return "(" +
                    " удаленный " + remoteRun +
                    " бесключевой " + withouKeyAccess +
                    ')';
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (cost <= 0) {
                cost = 6000;
            }
            this.cost = cost;
            if (number == null || number.isEmpty()) {
                number = "XXXXXXXXX";
            }
            this.number = number;
        }

        public void printExpired() {
            boolean expired = expireDate.isAfter(LocalDate.now());
            if (expired) {
                System.out.println("Страховка закончилась");
            }
        }

        public void printNumber() {
            boolean correct = number.length() == 9;
            if (!correct) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "(" +
                    " Срок действия " + expireDate +
                    " Стоимость " + cost +
                    " Номер страховки " + number +
                    ')';
        }
    }
}


