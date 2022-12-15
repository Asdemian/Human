package animals;

public class Main {
    public static void main(String[] args) {
        Animal horse = new Herbivore("Лошадь", 4, "поле", 60, "овес");
        Animal gazelle = new Herbivore("Газель", 2, "дюны", 87, "листья");
        Animal giraffe = new Herbivore("Жираф", 1, "саванна", 26, "цветы");

        Animal hyena = new Predator("Гиена", 5, "саванна", 98, "падаль");
        Animal tiger = new Predator("Тигр", 5, "джунгли", 60, "мясо");
        Animal bear = new Predator("Медведь", 5, "тайга", 59, "малина");

        Animal frog = new Amphibian("Лягушка", 1, "болото");
        Animal alreadyFreshwater = new Amphibian("Уж пресноводный", 1, "озеро");

        Animal peacock = new Flightless("Павлин", 3, "зоопарк", "лапы");
        Animal penguin = new Flightless("Пингвин", 6, "Антарктика", "лапы");
        Animal dodoBird = new Flightless("Птица додо", 2, "остров Маврикий", "лапы");

        Animal seagull = new Flying("Чайка", 2, "море", "лапы");
        Animal albatross = new Flying("Альбатрос", 5, "море", "лапы");
        Animal falcon = new Flying("Сокол", 3, "пустыня", "лапы");

        System.out.println(horse);
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}
