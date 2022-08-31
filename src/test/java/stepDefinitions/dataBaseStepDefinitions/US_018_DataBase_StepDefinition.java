package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_018_DataBase_StepDefinition {

    String query;
    String filename1= "src/test/resources/testData/Physicianid.txt";
    String filename2= "src/test/resources/testData/PhysicianFirstName.txt";


    @Given("Kullanici Db ile baglanti kurar")
    public void kullanici_db_ile_baglanti_kurar() {

        DatabaseUtility.createConnection();
    }
    @Given("Admin Query tanimlar")
    public void admin_query_tanimlar() {

        query="select * from public.jhi_user";

        System.out.println(DatabaseUtility.getColumnNames(query));

    }
    @Given("Admin Physician bilgilerine ulasir ve kaydeder")
    public void admin_physician_bilgilerine_ulasir_ve_kaydeder() {

        List<Object>idList=DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.savePhysicianId(filename1,idList);
        //

    }
    @Given("Admin Db ile Physician bilgilerini dogrular")
    public void admin_db_ile_physician_bilgilerini_dogrular() {

        List<Object>actualPhysician = ReadTxt.returnPhysicianIDsList(filename1);
        List<Object>expectedPhysician = new ArrayList<>();
        expectedPhysician.add(157290);
        Assert.assertTrue("ID uyusmuyor",actualPhysician.containsAll(expectedPhysician));

    }


}