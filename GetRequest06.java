package get_http_request;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest06 {
    //https://restful-booker.herokuapp.com/booking/5 url’ine
    //accept type’i “application/json” olan GET request’i yolladigimda
    //gelen response’un
    //status kodunun 200
    //ve content type’inin “application/json”
    //ve firstname’in “Jim”
    //ve totalprice’in 600
    //ve checkin date’in 2015-06-12"oldugunu test edin
    @Test
    public void test05(){
        String url="https://restful-booker.herokuapp.com/booking/4";
        Response response = given().when().get(url);

        response.prettyPrint();

        response.then()
                .assertThat()
                .contentType("application/json")
                .statusCode(200);
        response.then().body("firstname", Matchers.equalTo("Jim")
                ,"totalprice",Matchers.equalTo("411"));
    }
}
