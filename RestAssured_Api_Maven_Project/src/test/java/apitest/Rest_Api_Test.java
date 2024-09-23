package apitest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Rest_Api_Test {

    int id;

    @Test(priority = 1)
    void getUsers() {
        given()

        .when()
            .get("https://reqres.in/api/users?page=2")
        .then()
            .statusCode(200)
            .body("page", equalTo(2))
            .log().all();
    }

    @Test(priority = 2)
    void createUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Md ");
        data.put("job", "TA");

        // Send request and validate response
        id = given()
            .contentType("application/json")   
            .body(data)

        .when()
            .post("https://reqres.in/api/users")

        .then()
            .statusCode(201)
            .log().all()  // Log the response
            .extract()    // Extract response
            .jsonPath().getInt("id");  // Extract 'id' from the response
    }

    @Test(priority = 3, dependsOnMethods = {"createUser"})
    void updateUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Ayan ");
        data.put("job", "Student");

        given()
            .contentType("application/json")   
            .body(data)

        .when()
            .put("https://reqres.in/api/users/" + id)

        .then()
            .statusCode(200)
            .log().all();                     
    }

    @Test(priority = 4)
    void deleteUser() {
        given()

        .when()
            .delete("https://reqres.in/api/users/" + id)

        .then()
            .statusCode(204)
            .log().all();
    }
}
