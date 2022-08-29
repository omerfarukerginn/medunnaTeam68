package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.CTestItem;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveTestData;

public class US_017_API_StepDefinition {

    Response response;
    RequestSpecification spec;
    CTestItem expectedTest= new CTestItem();

    //GET
    @Given("su Admin set path params for test items")
    public void su_user_set_path_params_for_test_items() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1", "api", "2", "c-test-items","3","232887");

    }
    @Given("su Admin enters expected data for test items")
    public void su_user_enters_expected_data_for_test_items() {
        /* {
            "createdBy": "team68",
                "createdDate": "2022-08-25T22:08:04.078855Z",
                "id": 232887,
                "name": "kullanici1",
                "description": "description1",
                "price": 302.00,
                "defaultValMin": "355",
                "defaultValMax": "502"
        } */
        expectedTest.setName("kullanici1");
        expectedTest.setDescription("description1");
        expectedTest.setPrice(302.00);
        expectedTest.setDefaultValMin("355");
        expectedTest.setDefaultValMax("502");


    }
    @Given("su Admin sends request and get response for test items")
    public void su_user_sends_request_and_get_response_for_test_items() {
        response=given() .spec(spec)
                .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
                .contentType(ContentType.JSON)
                .when().get("/{1}/{2}/{3}/");

        response.prettyPrint();
        response.then().statusCode(200);

    }
    @Given("su Admin save all API information for test items")
    public void su_user_save_all_api_information_for_test_items() {
        saveTestData(expectedTest);

    }
    @Given("su Admin verify API for test items")
    public void su_user_verify_api_for_test_items() throws JsonProcessingException {
        ObjectMapper object = new ObjectMapper();
        CTestItem actualData= object.readValue(response.asString(),CTestItem.class);

        Assert.assertEquals(expectedTest.getName(),actualData.getName());
        Assert.assertEquals(expectedTest.getDescription(),actualData.getDescription());
        Assert.assertEquals(expectedTest.getPrice(),actualData.getPrice());
        Assert.assertEquals(expectedTest.getDefaultValMin(),actualData.getDefaultValMin());
        Assert.assertEquals(expectedTest.getDefaultValMax(),actualData.getDefaultValMax());


    }



    //POST
    @Given("su Admin set path params for test item creation")
    public void su_user_set_path_params_for_test_item_creation() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","c-test-items");

    }
    @Given("su Admin enters expected data for test item creation")
    public void su_user_enters_expected_data_for_test_item_creation() {
       /* {
            "createdBy": "team68",
                "createdDate": "2022-08-25T22:08:04.078855Z",
                "id": 232887,
                "name": "kullanici1",
                "description": "description1",
                "price": 302.00,
                "defaultValMin": "355",
                "defaultValMax": "502"
        } */
        expectedTest.setName("kullanici1");
        expectedTest.setDescription("description1");
        expectedTest.setPrice(302.00);
        expectedTest.setDefaultValMin("355");
        expectedTest.setDefaultValMax("502");

    }
    @Given("su Admin sends request and get response for test item creation")
    public void su_user_sends_request_and_get_response_for_test_item_creation() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
                .contentType(ContentType.JSON)
                .body(expectedTest)
                .when()
                .post("/{1}/{2}");

       /* try {
                  response.then().statusCode(200);
              }catch (Exception e){
            su_user_set_path_params_for_test_item_creation();
            su_user_enters_expected_data_for_test_item_creation();
             }
        response.prettyPrint();*/
       response.then().statusCode(200);

    }
    @Given("su Admin save all API information for test item creation")
    public void su_user_save_all_api_information_for_test_item_creation(){
        saveTestData(expectedTest);

    }
    @Given("su Admin verify API for test item creation")
    public void su_user_verify_api_for_test_item_creation() throws JsonProcessingException {
        ObjectMapper object = new ObjectMapper();
        CTestItem actualData= object.readValue(response.asString(),CTestItem.class);

        Assert.assertEquals(expectedTest.getName(),actualData.getName());
        Assert.assertEquals(expectedTest.getDescription(),actualData.getDescription());
        Assert.assertEquals(expectedTest.getPrice(),actualData.getPrice());
        Assert.assertEquals(expectedTest.getDefaultValMin(),actualData.getDefaultValMin());
        Assert.assertEquals(expectedTest.getDefaultValMax(),actualData.getDefaultValMax());

    }

}
