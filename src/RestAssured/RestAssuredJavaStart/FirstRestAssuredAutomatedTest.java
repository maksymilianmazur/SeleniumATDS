package RestAssuredJavaStart;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstRestAssuredAutomatedTest {

    @Test
    public void givenNonExistingPetIdWhenGetPetThenPetNotFoundTest() {
        given().log().uri().log().method()
                .when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/0")
                .then().log().all().statusCode(404);
    }

}
