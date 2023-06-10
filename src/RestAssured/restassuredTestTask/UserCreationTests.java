package restassuredTestTask;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.javastart.pojo.User;

import static io.restassured.RestAssured.given;

public class UserCreationTests {


    @BeforeTest
    public void setupConfiguration() {
        RestAssured.baseURI = "https://swaggerpetstore.przyklady.javastart.pl";
        RestAssured.basePath = "v2";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void pojoUserTest() {
        User user = new User(445, "firstuser", "Maksymilian", "Mazur", "maksymilian.mazur@atende", "testowe", "55555555", 1);
        given()
                .contentType("application/json")
                .body(user)
                .when().post("user")
                .then().statusCode(200);

    }


    @Test
    public void givenNonExistingPetIdWhenGetPetThenPetNotFoundTest() {
        User user = new User(446, "firstuser", "Krzysiek", "Mazur", "xd.xd@atende", "testowe", "95555555", 1);
        given()
                .contentType("application/json")
                .body(user)
                .when().post("user")
                .then().statusCode(200);
    }


    @Test
    public void givenCorrectUserDataWhenCreateUserThenUserIsCreatedTest() {
        given()
                .pathParam("username", "firstuser")
                .when().get("user/{username}")
                .then().statusCode(200);
    }


}
