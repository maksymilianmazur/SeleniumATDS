package test;

public class PlanetarySystem {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem(String starName, String starType, int numberOfPlanets) {
        this.starName = starName;
        this.starType =starType;
        this.numberOfPlanets = numberOfPlanets;
        System.out.println("Name of the star is: "+starName+ " Star type is: "+starType+ " Number of the planets: "+numberOfPlanets);
    }
    public PlanetarySystem(){}

    public String getStarName(){return starName;}
    public void setNumberOfPlanets(int number) {numberOfPlanets = number;}
    public int getNumberOfPlanets(){return numberOfPlanets;}
    public void printNumberOfPlanets (){System.out.println("Number of planets: "+ numberOfPlanets);}
    public void printNameOfPlanets (){System.out.println("Name of planet: "+ starName);}
    public void printTypeOfPlanets (){System.out.println("Type of planet: "+ starType);}
}
