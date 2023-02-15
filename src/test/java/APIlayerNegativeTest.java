import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class APIlayerNegativeTest {

    @Test
    public void getCurrencyNegativeResponseCodeTest(){
        Response response = given().get(Consts.URL+Consts.LIVE_ENDPOINT);
        System.out.println(response.asString());
        response.then().statusCode(401);
    }
}
