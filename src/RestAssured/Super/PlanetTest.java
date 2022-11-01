package Super;

import org.junit.Test;

public class PlanetTest {
    @Test
    public void test(){
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars",687,3389.5f,false);
        mars.getOrbitalPeriod();
    }
}
