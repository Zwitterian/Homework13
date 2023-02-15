import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LiveEndpointTest {

    @Test
    public void getCurrencyLiveEndpointTest(){
        Response response = given().get("https://api.apilayer.com/currency_data/live?apikey=luK5fxMDDKWU2z5BOq0nBdxXdfx3eZNc&source=USD&currencies=EUR, CAD, RUB");
//        Response response = given().auth().oauth2(Consts.TOKEN).get(Consts.URL + Consts.LIVE_ENDPOINT);
        System.out.println(response.asString());
        response.then().statusCode(200);
        response.then().body("success", notNullValue());
        response.then().body("source", containsString("USD"));


    }

}
