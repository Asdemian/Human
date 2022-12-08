import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.yearOfBirth = LocalDate.now().getYear() - 35;
        maksim.town = "Минск";
        maksim.name = "Максим";
        maksim.job = "бренд-менеджером";

        Human ania = new Human();
        ania.yearOfBirth = LocalDate.now().getYear() - 29;
        ania.town = "Москва";
        ania.name = "Аня";
        ania.job = "методистом образовательных программ";

        Human katia = new Human();
        katia.yearOfBirth = LocalDate.now().getYear() - 28;
        katia.town = "Калининград";
        katia.name = "Катя";
        katia.job = "продакт-менеджером";

        Human artem = new Human();
        artem.yearOfBirth = LocalDate.now().getYear() - 27;
        artem.town = "Москва";
        artem.name = "Артем";
        artem.job = "директором по развитию бизнеса";

        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katia);
        System.out.println(artem);
    }
}