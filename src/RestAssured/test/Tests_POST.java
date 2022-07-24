import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class Tests_POST {
    @Test
    //stworzenie Hashmapy, a następnie włożenie jej do JSONObject
    public void post_1() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Maksymilian");
        map.put("job","Software Tester");
        System.out.println(map);
        JSONObject request = new JSONObject(map);
        System.out.println(request);
    }
    @Test
    //stworzenie Hashmapy, a następnie włożenie jej do JSONObject
    public void post_2() {
        JSONObject request = new JSONObject();
        request.put("name","Maksymilian");
        request.put("job","Software Tester");
        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).log().all();

    }

    @Test
    //stworzenie Hashmapy, a następnie włożenie jej do JSONObject
    public void patch_3() {
        JSONObject request = new JSONObject();
        request.put("name","Maksymilian");
        request.put("job","Software Tester");
        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users").
                then().
                statusCode(201).log().all();
    }
}
