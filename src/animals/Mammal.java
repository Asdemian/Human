package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String environment;
    private int speed;
    private String food;

    public Mammal(String name, int age, String environment,
                  int speed, String food) {
        super(name, age, environment);
        this.environment = environment;
        this.speed = speed;
        if (StringUtil.isNullOrEmpty(food)) {
            this.food = "Еда";
        } else this.food = food;
    }

    public abstract void walk();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Млекопитающие "+super.toString()+

                " скорость передвижения (" + speed +
                " км/ч) пища (" + food + ')' +
                " " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed &&
                Objects.equals(environment, mammal.environment) &&
                Objects.equals(food, mammal.food);
    }


}
