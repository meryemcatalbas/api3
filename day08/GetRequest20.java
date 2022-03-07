package get_http_request.day08;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest20 extends JsonPlaceHolderBaseUrl {
     /*
https://jsonplaceholder.typicode.com/todos/2
1) Status kodunun 200,
2) respose body'de,
         "completed": değerinin false
         "title": değerinin "quis ut nam facilis et officia qui"
         "userId" sinin 1 ve
    header değerlerinden
         "via" değerinin "1.1 vegur" ve
         "Server" değerinin "cloudflare" olduğunu test edin…
*/

@Test
    public void test(){

    //https://jsonplaceholder.typicode.com/todos/2
    Response response = given().spec(spec04).when().get("/{1}/{2}/{3}");
    //"/{1}/{2}/{3}" -> /api/v1/employees
    //http://dummy.restapiexample.com/api/v1/employees

    //response.prettyPrint();

    //1) Status kodunun 200,
    Assert.assertEquals(200, response.statusCode());
    response.then().assertThat().statusCode(200);

}








}
