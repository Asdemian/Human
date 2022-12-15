package transport.Driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String name;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = name;
        setHasDriverLicense(hasDriverLicense);
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        if (hasDriverLicense == false) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stoptMove(T transport);

    public abstract void refill(T transport);

    public void printConclusion(T transport) {
        System.out.println("Водитель " + name + " ездит на "
                + transport.getBrand() + " и будет участвовать в заезде");
    }

}
