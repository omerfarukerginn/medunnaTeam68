package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Room;

import static io.restassured.RestAssured.*;
import static junit.framework.TestCase.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRoomData;

public class US_016_API_StepDefinition {
static RequestSpecification spec;
static Room exceptedRoom= new Room();
static Response response;
public static void main(String[] args) throws JsonProcessingException {
    spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    spec.pathParams("1","api","2","rooms");

    exceptedRoom.setRoomNumber(78459615);
    exceptedRoom.setRoomType("TWIN");
    exceptedRoom.setStatus(true);
    exceptedRoom.setPrice(157.5);
    exceptedRoom.setDescription("Breakfast");

    response= given().spec(spec).contentType(ContentType.JSON).
            header("Authorization","Bearer "+generateToken()).
            body(exceptedRoom).when().post("/{1}/{2}");
    response.prettyPrint();
    response.then().statusCode(200);

    ObjectMapper obj = new ObjectMapper();
    Room actualRoom=obj.readValue(response.asString(),Room.class);
    assertEquals(exceptedRoom.getRoomNumber(),actualRoom.getRoomNumber());
    assertEquals(exceptedRoom.getRoomType(),actualRoom.getRoomType());
    assertEquals(exceptedRoom.getStatus(),actualRoom.getStatus());
    assertEquals(exceptedRoom.getPrice(),actualRoom.getPrice());
    assertEquals(exceptedRoom.getDescription(),actualRoom.getDescription());



}
    @Given("Admin set path params for room creation")
    public void admin_set_path_params_for_room_creation() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","rooms");
    }

    @Given("Admin enters expected data for room creation")
    public void admin_enters_expected_data_for_room_creation() {
        exceptedRoom.setRoomNumber(7878622);
        exceptedRoom.setRoomType("TWIN");
        exceptedRoom.setStatus(true);
        exceptedRoom.setPrice(157.5);
        exceptedRoom.setDescription("Breakfast");

    }

    @Given("Admin sends request and receives response for room creation")
    public void admin_sends_request_and_receives_response_for_room_creation() {
       response= given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+generateToken()).
                        body(exceptedRoom).when().post("/{1}/{2}");
       response.prettyPrint();
       response.then().statusCode(201);


    }


    @Given("Admin save all API information for room creation")
    public void admin_save_all_api_information_for_room_creation() {
    saveRoomData(exceptedRoom);

    }

    @Given("Admin verify API records for room creation")
    public void admin_verify_api_records_for_room_creation() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        Room actualRoom=obj.readValue(response.asString(),Room.class);
        assertEquals(exceptedRoom.getRoomNumber(),actualRoom.getRoomNumber());
        assertEquals(exceptedRoom.getRoomType(),actualRoom.getRoomType());
        assertEquals(exceptedRoom.getStatus(),actualRoom.getStatus());
        assertEquals(exceptedRoom.getPrice(),actualRoom.getPrice());
        assertEquals(exceptedRoom.getDescription(),actualRoom.getDescription());

    }

    @Given("Admin set path params for room read")
    public void admin_set_path_params_for_room_read() {

    }
    @Given("Admin enters expected data for room read")
    public void admin_enters_expected_data_for_room_read() {

    }
    @Given("Admin sends request and receives response for room read")
    public void admin_sends_request_and_receives_response_for_room_read() {

    }
    @Given("Admin save all API information for room read")
    public void admin_save_all_api_information_for_room_read() {

    }
    @Given("Admin verify API records for room read")
    public void admin_verify_api_records_for_room_read() {

    }

    @Given("Admin set path params for room update")
    public void admin_set_path_params_for_room_update() {

    }
    @Given("Admin enters expected data for room update")
    public void admin_enters_expected_data_for_room_update() {

    }
    @Given("Admin sends request and receives response for room update")
    public void admin_sends_request_and_receives_response_for_room_update() {

    }
    @Given("Admin save all API information for room update")
    public void admin_save_all_api_information_for_room_update() {

    }
    @Given("Admin verify API records for room update")
    public void admin_verify_api_records_for_room_update() {

    }

    @Given("Admin set path params for room delete")
    public void admin_set_path_params_for_room_delete() {

    }
    @Given("Admin sends request and receives response for room delete")
    public void admin_sends_request_and_receives_response_for_room_delete() {

    }
    @Given("Admin verify API records for room delete")
    public void admin_verify_api_records_for_room_delete() {

    }



}
