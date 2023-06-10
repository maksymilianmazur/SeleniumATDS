package restassuredTestTask;

import org.testng.annotations.Test;
import pl.javastart.pojo.User;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class Zadanie5_13 extends TestBase {

    @Test
    public void givenCorrectUserDataWhenFirstNameLastNameAreUpdatedThenUserDataIsUpdatedTest() {
        setupConfiguration();
        User user = new User(445, "firstuser", "Krzysztof", "Kowalski", "krzysztof@test.com", "password", "+123456789", 123);

        given()
                .body(user)
                .when().post("user")
                .then().body("code", equalTo(200), "type", equalTo("unknown"), "message", equalTo("445"));

        user.setFirstName("Adam");
        user.setLastName("Malinowski");

        given()
                .pathParam("username", user.getUsername())
                .body(user)
                .when().put("user/{username}")
                .then().body("code", equalTo(200), "type", equalTo("unknown"), "message", equalTo("445"));

        given()
                .pathParam("username", user.getUsername())
                .when().get("user/{username}")
                .then().body("firstName", equalTo("Adam"), "lastName", equalTo("Malinowski"));


    }
}