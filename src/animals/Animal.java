package animals;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private int age;
    private String environment;

    public Animal(String name, int age, String environment) {

        if (StringUtil.isNullOrEmpty(name)) {
            this.name = "Животное";
        } else this.name = name;
        if (StringUtil.isNullOrEmpty(environment)) {
            this.environment = "Земля";
        } else this.environment = environment;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name)
                && Objects.equals(environment, animal.environment);
    }

    @Override
    public String toString() {
        return " " +
                "Имя (" + name + ')' +
                " Лет (" + age +
                ") среда обитания (" + environment + ')' +
                " ";
    }
}
