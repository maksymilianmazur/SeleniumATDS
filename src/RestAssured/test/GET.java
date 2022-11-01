package test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class GET {


    @Test
    public void test_01() {
        Response response = get("https://reqres.in/api/users?page=2");
//        //RestAssured.put();
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody());
//        System.out.println(response.asString());
//        System.out.println(response.getStatusLine());
//        System.out.println(response.getHeader("content-type"));
//        System.out.println(response.getTime());
//        System.out.println(response.getSessionId());
//        Assert.assertEquals(response.getStatusCode(), 200);

        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        System.out.println("Response body: "+ bodyAsString);
        System.out.println("Response body: "+ body);
    }

    @Test
    public void test_02() {
        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(7));

       // given().
        //System.out.println(given().body("data.id[0]").toString());
        //given().get("https://reqres.in/api/users?page=2").then().statusLine("HTTP/1.1 200 OK");
    }
}
