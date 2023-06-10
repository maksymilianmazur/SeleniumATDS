package pl.javastart.restassured.test.parameters;

import org.testng.annotations.Test;
import pl.javastart.pojo.Pet;

public class StartClass {

    @Test
    public void test(){
        Pet pet = new Pet();
        pet.setStatus("sold");
        pet.setId(777);
        QueryParamsTests test = new QueryParamsTests();
        test.addPet(pet);

        Pet[] pets = test.givenExistingPetWithStatusSoldWhenGetPetWithSoldStatusThenPetWithStatusIsReturnedTest();
        test.checkStatus(pets);

    }



}
