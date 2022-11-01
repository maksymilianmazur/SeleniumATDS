package Super;

public class Planet extends AstronomicalObject {
    private int numberOfMoons;
    private int mass;
    private float rotationPeriodInDays;
    private boolean hasRings;

    public Planet(String name)
    {
        super(name); //odniesienie się do konstruktora klasy nadrzędnej
    }

    public Planet(String name, int orbitalPeriodInDays, float radius,boolean hasRings)
    {
        super(name,orbitalPeriodInDays,radius); //odniesienie się do konstruktora klasy nadrzędnej
        this.hasRings = hasRings;
    }

    public Planet (int mass)
    {
        this.mass = mass;
    }

    @Override //informacja o tym, że metoda nadpisuję metodę w klasie nadrzędnej
    public int getOrbitalPeriod()
    {
        return super.getOrbitalPeriod()/365;
    }
}
