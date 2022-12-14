package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
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
static int roomNumber=20;
static Room exceptedUpdatedRoom=new Room();
public static void main(String[] args) throws JsonProcessingException {
    spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    spec.pathParams("1","api","2","rooms");

    exceptedRoom.setRoomNumber(roomNumber);
    exceptedRoom.setRoomType("TWIN");
    exceptedRoom.setStatus(true);
    exceptedRoom.setPrice(1000);
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

        exceptedRoom.setId(null);
        exceptedRoom.setRoomNumber(roomNumber);
        exceptedRoom.setRoomType("TWIN");
        exceptedRoom.setStatus(true);
        exceptedRoom.setPrice(1000);
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
   JsonPath json= response.jsonPath();
   int myID=json.get("id");
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","rooms","3",myID);

    }
    @Given("Admin enters expected data for room read")
    public void admin_enters_expected_data_for_room_read() {
    /*
    {
        "createdBy": "mehmet84",
        "createdDate": "2022-07-20T14:23:34.061275Z",
        "id": 130671,
        "roomNumber": 34926583,
        "roomType": "SUITE",
        "status": true,
        "price": 10.00,
        "description": "wwwww"
    },

     */
        exceptedRoom.setRoomNumber(roomNumber);
        exceptedRoom.setRoomType("TWIN");
        exceptedRoom.setStatus(true);
        exceptedRoom.setPrice(1000);
        exceptedRoom.setDescription("Breakfast");


    }
    @Given("Admin sends request and receives response for room read")
    public void admin_sends_request_and_receives_response_for_room_read() {
        response= given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+generateToken()).
                when().get("/{1}/{2}/{3}");
        response.prettyPrint();
       // response.then().statusCode(201);


    }
    @Given("Admin save all API information for room read")
    public void admin_save_all_api_information_for_room_read() {
        saveRoomData(exceptedRoom);

    }
    @Given("Admin verify API records for room read")
    public void admin_verify_api_records_for_room_read() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        Room actualRoom=obj.readValue(response.asString(),Room.class);
        assertEquals(exceptedRoom.getRoomNumber(),actualRoom.getRoomNumber());
        assertEquals(exceptedRoom.getRoomType(),actualRoom.getRoomType());
        assertEquals(exceptedRoom.getStatus(),actualRoom.getStatus());
        assertEquals(exceptedRoom.getPrice(),actualRoom.getPrice());
        assertEquals(exceptedRoom.getDescription(),actualRoom.getDescription());

    }

    @Given("Admin set path params for room update")
    public void admin_set_path_params_for_room_update() {
    /*
    {
        "createdBy": "medunnaadmin",
        "createdDate": "2022-03-17T15:56:34.246303Z",
        "id": 31707,
        "roomNumber": 2979009,
        "roomType": "PREMIUM_DELUXE",
        "status": true,
        "price": 250.00,
        "description": "Motorized Bed"
    },

    */
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","rooms");
    }
    @Given("Admin enters expected data for room update")
    public void admin_enters_expected_data_for_room_update() {
        JsonPath json= response.jsonPath();
        int myID=json.get("id");
        exceptedUpdatedRoom.setCreatedBy("teamTeam");
        exceptedUpdatedRoom.setCreatedDate("2022-08-29T15:56:34.246303Z");
        exceptedUpdatedRoom.setId(myID);
        exceptedUpdatedRoom.setRoomNumber(roomNumber);
        exceptedUpdatedRoom.setRoomType("TWIN");
        exceptedUpdatedRoom.setStatus(true);
        exceptedUpdatedRoom.setPrice(1500);
        exceptedUpdatedRoom.setDescription("Lunch");



    }
    @Given("Admin sends request and receives response for room update")
    public void admin_sends_request_and_receives_response_for_room_update() {

        response= given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+generateToken()).
                body(exceptedUpdatedRoom).when().put("/{1}/{2}");
        response.prettyPrint();

    }
    @Given("Admin save all API information for room update")
    public void admin_save_all_api_information_for_room_update() {
        saveRoomData(exceptedUpdatedRoom);

    }
    @Given("Admin verify API records for room update")
    public void admin_verify_api_records_for_room_update() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        Room actualRoom=obj.readValue(response.asString(),Room.class);
        assertEquals(exceptedUpdatedRoom.getRoomNumber(),actualRoom.getRoomNumber());
        assertEquals(exceptedUpdatedRoom.getRoomType(),actualRoom.getRoomType());
        assertEquals(exceptedUpdatedRoom.getStatus(),actualRoom.getStatus());
        assertEquals(exceptedUpdatedRoom.getPrice(),actualRoom.getPrice());
        assertEquals(exceptedUpdatedRoom.getDescription(),actualRoom.getDescription());

    }
    @Given("Admin set path params for room delete")
    public void adminSetPathParamsForRoomDelete() {
        JsonPath json= response.jsonPath();
        int myID=json.get("id");
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","rooms","3",myID);
    }


    @Given("Admin sends request and receives response for room delete")
    public void admin_sends_request_and_receives_response_for_room_delete() {
        response= given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+generateToken()).
               when().delete("/{1}/{2}/{3}");
        System.out.println("response.getStatusCode() = " + response.getStatusCode());


    }
    @Given("Admin verify API records for room delete")
    public void admin_verify_api_records_for_room_delete() {
assertEquals(response.getStatusCode(),204);
    }



}
