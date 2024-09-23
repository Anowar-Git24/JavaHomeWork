package restassured;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {
    @Test
    public void test1() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());

        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.getTime());

        int statusCode = response.getStatusCode();
        AssertJUnit.assertEquals(statusCode, 200);
    }
}