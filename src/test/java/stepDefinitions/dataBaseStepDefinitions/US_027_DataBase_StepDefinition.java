package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_027_DataBase_StepDefinition {
    String query;
    String filename1= "src/test/resources/testData/Messages.txt";

    @Given("ofe Kullanici database ile baglanti kurar")
    public void ofe_kullanici_database_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }

    @Given("ofe Admin query tanimlar")
    public void ofe_admin_query_tanimlar() {
        query="select * from public.cmessage";
        System.out.println(DatabaseUtility.getColumnNames(query));
    }

    @Given("ofe Admin messages bilgilerine ulasir ve kaydeder")
    public void ofe_admin_messages_bilgilerine_ulasir_ve_kaydeder() {
        List<Object> idList=DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveMessageId(filename1,idList);
    }

    @Given("ofe Admin DB ile messages bilgilerini dogrular")
    public void ofe_admin_db_ile_messages_bilgilerini_dogrular() {
        List<Object> actualTestItems= ReadTxt.returnMessageIDList(filename1);
        List<Object> expectedTestItems= new ArrayList<>();
        expectedTestItems.add(236980);
        Assert.assertTrue("message id uyusmuyor",actualTestItems.containsAll(expectedTestItems));

    }

}
