package stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import utilities.ApiUtils;

import static io.restassured.RestAssured.given;

public class US_001_API_StepDefinition {
    SoftAssert softAssert=new SoftAssert();


    @When("kullanici yetkili bir get endpointle kayitli kullanici bilgilerini almali")
    public void kullanici_yetkili_bir_get_endpointle_kayitli_kullanici_bilgilerini_almali() {


    }
    @When("Kullanici alinan end pointleri deserilasyon yapmali")
    public void kullanici_alinan_end_pointleri_deserilasyon_yapmali() {

    }

    @When("Kullanici alinan kayitlari validate etmeli")
    public void kullanici_alinan_kayitlari_validate_etmeli() {

    }


    }


