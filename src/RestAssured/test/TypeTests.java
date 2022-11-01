package test;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;


public class TypeTests {

    @Test
    public void doesIntChangeValueTest(){
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;

        System.out.println(firstInt);
        System.out.println(secondInt);
        Assertions.assertEquals(5,secondInt);
    }
    @Test
    public void doesObjectChangeValueTest(){
        PlanetarySystem firstSystem = new PlanetarySystem(); //stworzenie obiektu
        PlanetarySystem secondSystem = firstSystem; // stworzenie referencji, która pokazuje na ten sam obiekt
        firstSystem.setNumberOfPlanets(11);
        firstSystem.printNumberOfPlanets();
        secondSystem.printNumberOfPlanets();
    }

    @Test
    public void doesStringChangeValueTest(){
        String firstString = "test";
        String secondString = firstString;

        firstString = "zmieniam tekst";
        System.out.println(firstString);
        System.out.println(secondString);
    }
}
