package transport;

public class Train extends Transport {

    private int cost;
    private int time;
    private String departureStation;
    private String finalStop;
    private int wagons;

    public Train(String brand, String model, int productionYear,
                 String productionCountry, String color, int maximumMovementSpeed,
                 String fuel, double fuelPercentage, int cost, int time, String departureStation,
                 String finalStop, int wagons) {
        super(brand, model, productionYear, productionCountry, color,
                maximumMovementSpeed, fuel, fuelPercentage);
        this.cost = cost;
        this.time = time;
        this.departureStation = departureStation;
        this.finalStop = finalStop;
        this.wagons = wagons;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправлен топливом (" +getFuel()+ ")");
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString() +
                " цена поездки " + cost +
                " время поездки " + time + " ч. " +
                " станция отбытия (" + departureStation + ')' +
                " конечная остановка (" + finalStop + ')' +
                " количество вагонов (" + wagons + ')' + '.';
    }
}
