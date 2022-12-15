package transport;


import transport.Driver.Driver;
import transport.Driver.DriverB;
import transport.Driver.DriverC;
import transport.Driver.DriverD;


public class Main {
    public static void main(String[] args) {
        Car sorento2021 = new Car("KIA", "Sorento2021", 2.5, BodyType.SEDAN);
        Car toyotaRAV4 = new Car("Toyota", "RAV4", 2.0, BodyType.SEDAN);
        Car hondaCRV = new Car("Honda", "CR-V", 2.0, BodyType.CROSSOVER);
        Car kiaSportage = new Car("KIA", "Sportage", 2.4, BodyType.SEDAN);

        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 3.5, capacity.AVERAGE);
        Bus paz = new Bus("ПАЗ", "4234", 4.0, capacity.BIG);
        Bus nefaz = new Bus("НефАЗ", "5299", 3.5, capacity.ESPECIALLY_SMALL);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 4.5, capacity.ESPECIALLY_SMALL);

        Truck mercedesBenz = new Truck("Mercedes-Benz", "Actros", 5.0, WeightСapacity.N2);
        Truck volvo = new Truck("Volvo", "FH16", 4.7, WeightСapacity.N1);
        Truck scania = new Truck("Scania", "R730 V8", 4.5, WeightСapacity.N2);
        Truck man = new Truck("MAN", "TGX", 5.5, WeightСapacity.N1);

        // sorento2021.pitStop();

        // liaz5292.pitStop();
        //mercedesBenz.printType();

        //  mercedesBenz.pitStop();

        DriverB semen = new DriverB("Семен", true, 7);
        DriverC evlampiy = new DriverC("Евлампий", true, 20);
        DriverD prohor = new DriverD("Прохор", true, 15);


       /* semen.refill(hondaCRV);
        semen.printConclusion(hondaCRV);

        evlampiy.refill(scania);
        evlampiy.printConclusion(scania);

        prohor.refill(paz);
        prohor.printConclusion(paz);

*/
       /* System.out.println(sorento2021);
        System.out.println(hondaCRV);
        System.out.println(paz);
        System.out.println(liaz5292);
        System.out.println(man);
        System.out.println(scania);
*/
      /*  boolean chek = Data.validate("1234qwerty", "123qwerty", "1238qwerty");
        if (chek) {
            System.out.println("Вводимые данные верны");
        } else
            System.out.println("Вводимые данные не верны");

       */
        System.out.println(mercedesBenz.passDiagnostics());
        System.out.println(paz.passDiagnostics());

    }

}



