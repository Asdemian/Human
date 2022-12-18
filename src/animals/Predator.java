package animals;

public class Predator extends Mammal {


    public Predator(String name, int age, String environment,
                     int speed, String food) {
        super(name, age, environment, speed, food);
    }

    public void hunt() {
        System.out.println("Хищнк охотится");
    }
    @Override
    public void eat() {
        System.out.println("Хищнк кушает " +getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Хищнк спит ");
    }

    @Override
    public void go() {
        System.out.println("Хищнк ходит в лесу");
    }

    @Override
    public void walk() {
        System.out.println("Хищнк гуляет в лесу");
    }
}
