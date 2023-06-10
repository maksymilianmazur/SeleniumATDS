package RestAssuredJavaStart;

import pl.javastart.pojo.User;

import static io.restassured.RestAssured.given;

public class UserUpdateTests {


    public void createUser(User user) {

        given()
                .contentType("application/json")
                .body(user)
                .when().post("user")
                .then().statusCode(200);

    }


    public void givenCorrectUserDataWhenFirstNameLastNameAreUpdatedThenUserDataIsUpdatedTest(User userClone) {

        given()
                .contentType("application/json")
                .pathParam("username", userClone.getUsername())
                .body(userClone)
                .when().put("user/{username}")
                .then().statusCode(200);

    }


    public void getUpdateUser(User user) {

        given()
                .contentType("application/json")
                .pathParam("username", user.getUsername())
                .when().get("user/{username}")
                .then().statusCode(200);

    }


}
