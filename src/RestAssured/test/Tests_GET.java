import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class Tests_GET {

    @Test
    public void get_1()
    {
        given()
                .header("Content-Type","application/json")
                .get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200)
                .log().all()
                .body("data.id[1]",equalTo(8))
                .body("data.first_name",hasItems("Michael","Tobias"));
    }
}
