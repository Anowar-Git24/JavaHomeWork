package restassured;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Put_Patch_Delete_Examples {
    @Test
    public void testPut() {
        JSONObject request = new JSONObject();
        request.put("name", "Debopriya Deb Roy");
        request.put("job", "Software Engineer");
        System.out.println(request.toString());

        baseURI = "https://reqres.in/api/";
        given()
            .header("Content-Type", "application/json")
            .body(request.toString())
            .when()
            .put("users/2")
            .then()
            .statusCode(200)
            .body("name", equalTo("Debopriya Deb Roy"))
            .body("job", equalTo("Software Engineer"));
    }

    @Test
    public void testPatch() {
        JSONObject request = new JSONObject();
        request.put("name", "Debopriya Deb Roy");
        request.put("job", "Software Engineer");
        System.out.println(request.toString());

        baseURI = "https://reqres.in/api/";
        given()
            .header("Content-Type", "application/json")
            .body(request.toString())
            .when()
            .patch("users/2")
            .then()
            .statusCode(200)
            .body("name", equalTo("Debopriya Deb Roy"))
            .body("job", equalTo("Software Engineer"));
    }

    @Test
    public void testDelete() {
        baseURI = "https://reqres.in/api/";
        given()
            .when()
            .delete("users/2")
            .then()
            .statusCode(204);
    }
}