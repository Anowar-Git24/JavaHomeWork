package restassured;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import org.testng.annotations.Test;

public class Example2 {
    @Test
    public void test2() {
       get("https://reqres.in/api/users?page=2")
               .then()
               .statusCode(200)
               .body("data[1].id", equalTo(8))
               .body("data.first_name", hasItem("Md"));

    }
}