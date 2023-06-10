package serialization;

import org.testng.annotations.Test;
import pl.javastart.pojo.Category;
import pl.javastart.pojo.Pet;
import pl.javastart.pojo.Tag;

import java.util.Collections;

import static org.testng.Assert.assertEquals;


public class StartClassSerialization {

    @Test
    public void start() {
        Category category = new Category();
        category.setId(2);
        category.setName("cats");
        Tag tag = new Tag();
        tag.setId(2);
        tag.setName("cats-category");
        Pet cat = new Pet();
        cat.setId(124);
        cat.setCategory(category);
        cat.setPhotoUrls(Collections.singletonList("http://photos.com/cat1.jpg"));
        cat.setTags(Collections.singletonList(tag));
        cat.setStatus("available");

        SerializationAndDeserializationTests test_1 = new SerializationAndDeserializationTests();
        Pet createdPet = test_1.createPetAndCheckDeserialization(cat); //przypisanie odpowiedzi z post'a do obiektu javovego
        Pet getCreatedPet = test_1.getPet(createdPet); // odczytanie utworzonego obiektu i przypisanie odpowiedzi do obiektu javowego
        assertEquals(createdPet.getId(), getCreatedPet.getId()); // porównanie obiektów
        assertEquals(createdPet.getCategory(), getCreatedPet.getCategory());

    }


}
