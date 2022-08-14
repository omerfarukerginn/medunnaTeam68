package stepDefinitions.apiStepDefinitions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pojos.Account;
import pojos.Registrant;

import utilities.ConfigReader;

import java.io.File;


import static baseUrl.MedunnaBaseUrl.spec;

import static io.restassured.RestAssured.given;

import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.*;

public class US_001_API_StepDefinition {
    SoftAssert softAssert=new SoftAssert();
    Response response;
    Registrant[] registrants;
    File file=new File( "api_all_registrant_data" );
    Faker faker=new Faker();
    Registrant registrant = new Registrant();
    @When("kullanici gecerli bir endpointle kayit bilgilerini almali")
    public void kullaniciGecerliBirEndpointleKayitBilgileriniAlmali() {
        response=given().headers( "Authorization",
                                   "Bearer " +  generateToken() ,
                                    "Content-Type",
                                    ContentType.JSON,
                                    "Accept",
                                     ContentType.JSON).when().get( ConfigReader.getProperty( "apigetallUsers" ) );
       // response.prettyPrint();

    }
    @Then("kullanci status code {int} almali")
    public void kullanciStatusCodeAlmali(int arg0) {
       softAssert.assertEquals( response.getStatusCode(),200 );
       softAssert.assertAll();
    }
    @When("kullanici deserilizasyon yapmali")
    public void kullanici_deserilizasyon_yapmali() throws Exception {
        ObjectMapper objectMapper=new ObjectMapper();
        registrants=objectMapper.readValue( response.asString(), Registrant[].class );


    }



    @Then("kullanci alinan bütün kayitlari dogrulamali")
    public void kullanciAlinanBütünKayitlariDogrulamali() {

       softAssert.assertEquals( saveRegistrantDataUI( registrants ),registrants);



    }
    @When("kullanici gecerli bir endpointle kayitli kisiler olusturur")
    public void kullanici_gecerli_bir_endpointle_kayitli_kisiler_olusturur() throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("1", "api", "2", "register");
        String firstname = faker.name().firstName();
        String lastname=faker.name().lastName();
        String SSN=faker.idNumber().ssnValid();
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(SSN);
        registrant.setLogin(firstname+lastname);
        registrant.setPassword(SSN+firstname);
        registrant.setEmail(faker.internet().emailAddress(firstname+lastname));
        response = given().spec(spec)
                .contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{1}/{2}");
        saveRegistrantData(registrant);
        response.prettyPrint();
        response.then().statusCode(201);
        ObjectMapper obj = new ObjectMapper();
        Account actualRegistrant = obj.readValue(response.asString(),Account.class);
        System.out.println("Actual Data: " + actualRegistrant);
        Assert.assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
        Assert.assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
        Assert.assertEquals(registrant.getSsn(),actualRegistrant.getSsn());
        spec.pathParams("1", "api", "2", "register");
        registrant.setSsn(faker.idNumber().ssnValid());
        registrant.setFirstName(faker.name().firstName()+"byrm");
        registrant.setLastName(faker.name().lastName()+"hzl");
        registrant.setLogin(registrant.getFirstName()+registrant.getLastName()+"byrmhzl");
        registrant.setEmail(faker.internet().safeEmailAddress(registrant.getFirstName()+registrant.getLastName()));
        registrant.setPassword(faker.internet().password(8,10,true,true,true)+"byrmhz");
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{1}/{2}");


        }


    @Then("kullanici kayitli kisileri dogrular")
    public void kullanici_kayitli_kisileri_dogrular() throws JsonProcessingException {

        try {
            response.then().statusCode(201);
            saveRegistrantData(registrant);
            System.out.println(registrant.toString());
        } catch (Exception e) {

        }
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        Registrant actualRegistrant = obj.readValue(response.asString(),Registrant.class);
        System.out.println("Actual Data: " + actualRegistrant);

        Assert.assertEquals(registrant.getSsn(),actualRegistrant.getSsn());//Kayitli kisiler
        Assert.assertEquals( registrant.getEmail(),actualRegistrant.getEmail() );//kayitli mailler
        Assert.assertEquals( registrant.getLogin(),actualRegistrant.getLogin() );//kayitli username(loginler)
    }




}


