import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class IncorrectCurrencyCode {


    @Test
    public void getCurrencyLiveEndpointTest(){
        Response response = given().get("https://api.apilayer.com/currency_data/live?apikey=luK5fxMDDKWU2z5BOq0nBdxXdfx3eZNc&source=UST&currencies=EUR, CAD, RUB");
//        Response response = given().auth().oauth2(Consts.TOKEN).get(Consts.URL + Consts.LIVE_ENDPOINT);
        System.out.println(response.asString());

    }
}
