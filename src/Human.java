public class Human {

    int yearOfBirth;
    String name;
    String town;

    @Override
    public String toString() {
        return " Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + "году. Будем знакомы!";
    }
}
