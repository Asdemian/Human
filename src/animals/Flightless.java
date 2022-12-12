package animals;

public class Flightless extends Bird {


    public Flightless(String name, int age, String environment,
                      String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птичка кушает на земле");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птичка спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птичка перемещается по " +getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птичка охотится на земле");
    }
}
