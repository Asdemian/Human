import transport.Car;
import transport.Train;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {
    public static void main(String[] args) {

 /*       Human maksim = new Human(LocalDate.now().getYear() - 35,
                "Максим", "Минск", "бренд-менеджером");

        Human ania = new Human(LocalDate.now().getYear() - 29,
                "Аня", "Москва",
                "методистом образовательных программ");

        Human katia = new Human(LocalDate.now().getYear() - 28,
                "Катя", "Калининград", "продакт-менеджером");

        Human artem = new Human(LocalDate.now().getYear() - 27,
                "Артем", "Москва",
                "директором по развитию бизнеса");

        Human vladimir = new Human(LocalDate.now().getYear() - 21,
                "Владимир", "Казань",
                null);
        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katia);
        System.out.println(artem);
        System.out.println(vladimir);
*/
 /*       Car lada = new Car("Lada", "Grande",
                1.7, "Желтого", 2015,
                "России", "АКПП",
                "Флитбэк", "О258OO277",
                4);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",
                3.0, "черного", 2020,
                "Германии", null, null,
                null, 0);

        Car bmw = new Car("BMW", "Z8", 3.0,
                "черный", 2021,
                "Германии", "АККП",
                "Внедорожник", "Р567РЕ067",
                7);

        Car kia = new Car("Kia", "Sportage 4 поколение",
                2.4, "красный", 2018,
                "Южной Корее", "МККП6",
                "Минивэн", "C248CE077",
                4);

        Car hyundai = new Car("Hyundai", "Avante",
                1.6, "оранжевый", 2016,
                "Южной Корее", "АККП5",
                "Шутингбрейк", "Е001ЕЕ001",
                8);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

  */
/*
        Flower rosa = new Flower("Роза", "Голандии",
                35.59);
        Flower chrysanthemum = new Flower("Хризантема",
                null, 15);
        chrysanthemum.setLifeSpan(5);
        Flower pion = new Flower("Пион", "Англия",
                69.9);
        pion.setLifeSpan(1);
        Flower gypsophila = new Flower("Гипсофила",
                "Турция", 19.5);
        gypsophila.setLifeSpan(10);

        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        rosa, rosa, rosa, chrysanthemum, chrysanthemum, chrysanthemum,
                        chrysanthemum, chrysanthemum, gypsophila
                }
        );
        bouquet.bouquetOfFlowers();
*/

        Train lastochka = new Train("Ласточка", "В-901",
                2011, "России", null,
                301,1500, 1,
                "Белорусского вокзал",
                "Минск-Пассажирский", 11);

        Train leningrad = new Train("Ленинград", "D-125",
                2019, "России", null,
                270,1700, 2,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

    }
}