package Przeciążanie;

public class Planet {
    private String name;
    private double rotationPeriodInDays;
    private int diameter;
    private int numberOfMoons;
    private boolean hasRings;

    public Planet(String name, double rotationPeriodInDays, int diameter, int numberOfMoons, boolean hasRings) {
        this.name = name;
        this.rotationPeriodInDays = rotationPeriodInDays;
        this.diameter = diameter;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
    }

    public String info()
    {
        return ("Name:" +name+
                "\nRotation period(days): " + rotationPeriodInDays +
                "\nDiameter (km): " + diameter +
                "\nMoons: " + numberOfMoons +
                "\nHas rings?: " + hasRings);
    }

    public String info(String message)
    {
        return ("Name:" +name+
                "\nRotation period(days): " + rotationPeriodInDays +
                "\nDiameter (km): " + diameter +
                "\nMoons: " + numberOfMoons +
                "\nHas rings?: " + hasRings+
                "\n\n"+ message);
    }

}
