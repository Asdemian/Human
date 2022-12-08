import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(LocalDate.now().getYear() - 35,
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
    }
}