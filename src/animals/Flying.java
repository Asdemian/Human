package animals;

public class Flying extends Bird{

    public Flying(String name, int age, String environment,
                      String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Летающая птичка кушает на земле и на лету");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птичка спит ночью или днем");
    }

    @Override
    public void go() {
        System.out.println("Летающая птичка перемещается по " +getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птичка охотится на земле и в воздухе");
    }

}
