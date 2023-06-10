package restassuredTestTask;

import org.testng.annotations.Test;
import pl.javastart.pojo.User;

import static io.restassured.RestAssured.given;

public class Zadanie5_12 extends TestBase {


    @Test
    public void givenCorrectUserDataWhenCreateUserThenUserIsCreatedTest() {
        setupConfiguration();
        User user = new User(445, "firstuser", "Krzysztof", "Kowalski", "krzysztof@test.com", "password", "+123456789", 123);

        given()
                .body(user)
                .when().post("user")
                .then();

        given()
                .pathParam("username", user.getUsername())
                .when().get("user/{username}")
                .then();
    }

}
