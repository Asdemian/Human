package animals;

public class Herbivore extends Mammal {


    public Herbivore(String name, int age, String environment,
                     int speed, String food) {
        super(name, age, environment, speed, food);
    }

    public void grazer() {
        System.out.println("Травоядное животное пасется");
    }



    @Override
    public void eat() {
        System.out.println("Травоядное кушает" + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит в сумерках");
    }

    @Override
    public void go() {
        System.out.println("Травоядное бегает по травке");
    }

    @Override
    public void walk() {
        System.out.println("Травоядное гуляет по травке");
    }
}


