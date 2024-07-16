package restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Get_Post_Examples {
    @Test
    public void testGet() {
       baseURI = "https://reqres.in/api/";
         get("users?page=2")
                .then()
                .statusCode(200)
                .body("data[1].id", equalTo(8))
                .body("data.first_name", hasItem("Lindsay"))
                .body("data[1].first_name", equalTo("Lindsay"));
    }

    @Test
    public void testPost() {
        baseURI = "https://reqres.in/api/";
        given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post("users")
                .then()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));
    }

    @Test
    public void testPostUsingMap(){
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "Debopriya Deb Roy");
//        map.put("job", "Software Engineer");


        JSONObject request = new JSONObject();
        request.put("name", "Debopriya Deb Roy");
        request.put("job", "Software Engineer");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api/";
        given()
                .header("Content-Type", "application/json")
                .body(request.toJSONString())
                .when()
                .post("users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Debopriya Deb Roy"))
                .body("job", equalTo("Software Engineer"));

    }
}