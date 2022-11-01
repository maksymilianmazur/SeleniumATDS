package test;

import org.junit.Test;

public class PlanetarySystemTests {

    @Test
    public void firstTest(){
        PlanetarySystem planetarySystem = new PlanetarySystem();
        PlanetarySystem solarSystem = new PlanetarySystem("sun","yellow dwarf",8);
        solarSystem.setNumberOfPlanets(2);
        solarSystem.printNumberOfPlanets();

        PlanetarySystem keplerSystem = new PlanetarySystem("Kepler-444","K dwarf",5);

    }
}
