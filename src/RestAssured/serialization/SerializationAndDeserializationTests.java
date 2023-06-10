package serialization;

import org.testng.annotations.Test;
import pl.javastart.pojo.Category;
import pl.javastart.pojo.Pet;
import pl.javastart.pojo.Tag;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SerializationAndDeserializationTests {

    @Test
    public void givenPetWhenPostPetThenPetIsCreatedTest() {

        Category category = new Category();
        category.setId(1);
        category.setName("dogs");

        Tag tag = new Tag();
        tag.setId(1);
        tag.setName("dogs-category");

        Pet pet = new Pet();
        pet.setId(123);
        pet.setCategory(category);
        pet.setPhotoUrls(Collections.singletonList("http://photos.com/dog1.jpg"));
        pet.setTags(Collections.singletonList(tag));
        pet.setStatus("available");

        Pet actualPet = given().log().all().body(pet).contentType("application/json")
                .when().post("https://swaggerpetstore.przyklady.javastart.pl/v2/pet")
                .then().log().all().statusCode(200)
                .extract().as(Pet.class);

        assertEquals(actualPet.getId(), pet.getId(), "Pet id");
        assertEquals(actualPet.getCategory().getId(), pet.getCategory().getId(), "Category id");
        assertEquals(actualPet.getCategory().getName(), pet.getCategory().getName(), "Category name");
        assertEquals(actualPet.getPhotoUrls().get(0), pet.getPhotoUrls().get(0), "Photo URL");
        assertEquals(actualPet.getTags().get(0).getId(), pet.getTags().get(0).getId(), "Pet tag id");
        assertEquals(actualPet.getTags().get(0).getName(), pet.getTags().get(0).getName(), "Pet tag name");
        assertEquals(actualPet.getStatus(), pet.getStatus(), "Pet status");
    }

    public Pet createPetAndCheckDeserialization(Pet cat) {
        Pet actualPet = given().log().all()
                .contentType("application/json")
                .body(cat)
                .when().post("https://swaggerpetstore.przyklady.javastart.pl/v2/pet")
                .then().log().all().statusCode(200)
                .extract().as(Pet.class);
        return actualPet;
    }

    public Pet getPet(Pet createdPet){
        Pet getCreatedPet = given().log().all()
                .pathParam("petId",createdPet.getId())
                .contentType("application/json")
                .when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/{petId}")
                .then().log().all().statusCode(200)
                .extract().as(Pet.class);
        return getCreatedPet;


    }

}