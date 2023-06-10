package RestAssuredJavaStart;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.javastart.pojo.User;

public class StartClass {

    @BeforeTest
    public void setupConfiguration() {
        RestAssured.baseURI = "https://swaggerpetstore.przyklady.javastart.pl";
        RestAssured.basePath = "v2";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }


    @Test
    public void startTest() {
        UserUpdateTests test = new UserUpdateTests();
        User user = new User(445, "firstuser", "Maksymilian", "Mazur", "maksymilian.mazur@atende", "testowe", "55555555", 1);
        test.createUser(user);
        user.setFirstName("Manuel");
        user.setLastName("Arboleda");
        test.givenCorrectUserDataWhenFirstNameLastNameAreUpdatedThenUserDataIsUpdatedTest(user);
        test.getUpdateUser(user);

    }
}
