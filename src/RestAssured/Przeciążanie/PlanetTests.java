package Przeciążanie;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PlanetTests {
    @Test
    public void info_NoParameterProvided_ReturnsFullInfo()
    {
        Planet mars = new Planet("Mars",1.026,6787,2,false);
        Assertions.assertEquals("Name:Mars\n" +
                "Rotation period(days): 1.026\n" +
                "Diameter (km): 6787\n" +
                "Moons: 2\n"+
                "Has rings?: false",
                mars.info());
    }
    @Test
    public void info_MessageProvided_ReturnsFullInfo()
    {
        Planet mars = new Planet("Mars",1.026,6787,2,false);
        String message = "This is the favourite one!";
        Assertions.assertEquals("Name:Mars\n" +
                        "Rotation period(days): 1.026\n" +
                        "Diameter (km): 6787\n" +
                        "Moons: 2\n"+
                        "Has rings?: false"+
                "\n\n"+message,
                mars.info(message));
    }

}
