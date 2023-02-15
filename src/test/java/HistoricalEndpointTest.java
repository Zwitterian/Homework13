import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HistoricalEndpointTest {

    @Test
    public void getCurrencyHistoricalEndpointTest(){
        Response response = given().get("https://api.apilayer.com/currency_data/historical?date=2018-01-01&apikey=luK5fxMDDKWU2z5BOq0nBdxXdfx3eZNc&source=USD&currencies=EUR, CAD, RUB");
//        Response response = given().auth().oauth2(Consts.TOKEN).get(Consts.URL + Consts.HISTORICAL_ENDPOINT);
        System.out.println(response.asString());
        response.then().body("quotes.USDEUR", equalTo(0.832296F));
        response.then().statusCode(200);
        response.then().body("timestamp", equalTo(1514851199));
        response.then().body("source", equalTo("USD"));


    }
}
