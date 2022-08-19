package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.RegisterPage;
import utilities.DBUtils;
import utilities.DatabaseUtility;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US_001_DataBase_StepDefinition {
    SoftAssert softAssert=new SoftAssert();
    RegisterPage registerPage=new RegisterPage();


    @When("Kullanici database baglanir")
    public void kullanici_database_baglanir() {
        DBUtils.createConnection();

    }

    @When("kullanici daha önce olusturan emailin veri biriminde olup olmadigini dogrular")
    public void kullanici_daha_önce_olusturan_emailin_veri_biriminde_olup_olmadigini_dogrular() {
        List<List<Object>> list=DBUtils.getQueryResultList( "SELECT email FROM jhi_user" );
        softAssert.assertTrue( list.contains( "bay@g.k" ));
        softAssert.assertAll();

    }







}
