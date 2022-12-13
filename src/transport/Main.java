package transport;

public class Main {
    public static void main(String[] args) {
        Car sorento2021 = new Car("KIA", "Sorento2021", 2.5);
        Car toyotaRAV4 = new Car("Toyota", "RAV4", 2.0);
        Car hondaCRV = new Car("Honda", "CR-V", 2.0);
        Car kiaSportage = new Car("KIA", "Sportage", 2.4);

        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 3.5);
        Bus paz = new Bus("ПАЗ", "4234", 4.0);
        Bus nefaz = new Bus("НефАЗ", "5299", 3.5);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 4.5);

        Truck mercedesBenz = new Truck("Mercedes-Benz", "Actros", 5.0);
        Truck volvo = new Truck("Volvo", "FH16", 4.7);
        Truck scania = new Truck("Scania", "R730 V8", 4.5);
        Truck man = new Truck("MAN", "TGX", 5.5);
        sorento2021.start();
        sorento2021.stop();
        liaz5292.start();
        liaz5292.stop();
        mercedesBenz.start();
        mercedesBenz.stop();
    }
}
