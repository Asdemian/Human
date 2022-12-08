import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.yearOfBirth = LocalDate.now().getYear() - 35;
        maksim.town = "Минск";
        maksim.name = "Максим";

        Human ania = new Human();
        ania.yearOfBirth = LocalDate.now().getYear() - 29;
        ania.town = "Москва";
        ania.name = "Аня";

        Human katia = new Human();
        katia.yearOfBirth = LocalDate.now().getYear() - 28;
        katia.town = "Калининград";
        katia.name = "Катя";

        Human artem = new Human();
        artem.yearOfBirth = LocalDate.now().getYear() - 27;
        artem.town = "Москва";
        artem.name = "Артем";

        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katia);
        System.out.println(artem);
    }
}