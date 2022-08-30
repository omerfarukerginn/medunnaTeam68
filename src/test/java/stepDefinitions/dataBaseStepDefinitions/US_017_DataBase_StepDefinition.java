package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_017_DataBase_StepDefinition {

    String query;
    String filename1= "src/test/resources/testData/CTestItem.txt";

    @Given("SU Kullanici database ile baglanti kurar")
    public void su_kullanici_database_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }

    @Given("SU Admin query tanimlar")
    public void su_admin_query_tanimlar() {

        query="select * from public.c_test_item";
        System.out.println(DatabaseUtility.getColumnNames(query));

    }
    @Given("SU Admin testItems bilgilerine ulasir ve kaydeder")
    public void su_admin_test_items_bilgilerine_ulasir_ve_kaydeder() {

        List<Object> idList=DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveTestItemsId(filename1,idList);


    }

    @Given("SU Admin DB ile testItems bilgilerini dogrular")
    public void su_admin_db_ile_test_items_bilgilerini_dogrular() {
        List<Object> actualTestItems= ReadTxt.returnTestItemsIDList(filename1);
        List<Object> expectedTestItems= new ArrayList<>();
        expectedTestItems.add(232887);
        Assert.assertTrue("id uyusmuyor",actualTestItems.containsAll(expectedTestItems));

    }

}
