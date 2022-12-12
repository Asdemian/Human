package animals;

public class Amphibian extends Animal {


    public Amphibian(String name, int age, String environment) {
        super(name, age, environment);
    }

    @Override
    public String toString() {
        return "Земноводное " + super.toString();
    }

    public void hunt() {
        System.out.println("Земноводное охотится на берегу");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное кушает рыбку" );
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Земноводное перемещается на земле и в воде");
    }
}
