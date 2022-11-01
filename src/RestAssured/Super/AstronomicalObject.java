package Super;

public class AstronomicalObject {
    private int orbitalPeriodInDays;
    private float radius;
    private String name;

    public AstronomicalObject(String name)
    {
        this.name = name;
    }

    public AstronomicalObject(String name, int orbitalPeriodInDays, float radius)
    {
        this.name = name;
        this.orbitalPeriodInDays = orbitalPeriodInDays;
        this.radius = radius;
    }
    public AstronomicalObject() {}

    public int getOrbitalPeriod() {
        return orbitalPeriodInDays;
    }
}
