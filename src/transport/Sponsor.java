package transport;

public class Sponsor {
    public final String nameSponsor;
    public final int amount;

    public Sponsor(String nameSponsor, int amount) {
        this.nameSponsor = nameSponsor;
        this.amount = amount;
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public int getAmount() {
        return amount;
    }

    public void sponsorshipOfArrival() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", nameSponsor, amount);
    }

    @Override
    public String toString() {
        return " " +
                "(" + nameSponsor + ')' +
                " сумма поддержки в атогонках (" + amount +
                ')';
    }
}
