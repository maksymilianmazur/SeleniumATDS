package RestAssuredJavaStart;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test {

    String body = "{\n" +
            "   \"client_cid\":43,\n" +
            "   \"sensor_mid\":186888,\n" +
            "   \"contractor_id\":1,\n" +
            "   \"profile_signal_moid\":34,\n" +
            "   \"profile_signal_freq_minutes\":15,\n" +
            "   \"zone_signals_freq_minutes\":1440,\n" +
            "   \"lat\":53.963271441561744,\n" +
            "   \"lon\":16.62007401151315,\n" +
            "   \"params\":{\n" +
            "      \"type\":\"PV\",\n" +
            "      \"power\":0.0,\n" +
            "      \"inclination\":0.0,\n" +
            "      \"orientation\":0.0,\n" +
            "      \"efficiency\":0.0,\n" +
            "      \"cut_in_speed\":0.0,\n" +
            "      \"cut_out_speed\":0.0,\n" +
            "      \"hub_height\":0.0\n" +
            "   }\n" +
            "}";

    @BeforeClass
    public void setupConfiguration() {
        // RestAssured.baseURI = "";
        //RestAssured.basePath = "v2";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        RestAssured.requestSpecification = new RequestSpecBuilder().setContentType("application/json").build();
        RestAssured.responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();
    }




    @Test
    public void executePredictionEnergyDelivered() {


        given()
                .relaxedHTTPSValidation()
                .queryParam("graph_name", "Estymacja", "task_priority", "9", "task_async", "false", "since", "1680300000000", "till", "1685570400000")
                .body(body)
                .log().all()
                .when()
                .post("https://api-besmart.energa.loc/api/tasks/graphs/run/name")
                .then()
                .log().all();

    }


}