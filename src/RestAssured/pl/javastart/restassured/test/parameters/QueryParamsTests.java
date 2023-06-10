package pl.javastart.restassured.test.parameters;

import org.junit.Assert;
import org.testng.annotations.Test;
import pl.javastart.pojo.Pet;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;

public class QueryParamsTests {

    @Test
    public void addPet(Pet pet) {

        given().log().all()
                .contentType("application/json")
                .body(pet)
                .when().post("https://swaggerpetstore.przyklady.javastart.pl/v2/pet")
                .then().log().all().statusCode(200);


    }

    public Pet[] givenExistingPetWithStatusSoldWhenGetPetWithSoldStatusThenPetWithStatusIsReturnedTest() {

        Pet[] petsWithSoldStatus = given()
                .log().all()
                .queryParam("status", "sold")
                .contentType("application/json")
                .when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/findByStatus")
                .then().log().all().statusCode(200)
                .extract().as(Pet[].class);
        return petsWithSoldStatus;

    }

    public void checkStatus(Pet[] pets) {

        for (int i = 0; i < pets.length; i++) {
            assertEquals(pets[i].getStatus(), "sold");

        }

    }


}
