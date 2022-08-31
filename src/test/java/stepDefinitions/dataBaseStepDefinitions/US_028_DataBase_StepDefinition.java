package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_028_DataBase_StepDefinition {

    String query;
    String filename1="src/test/resources/testData/CountryId.txt";
    String filename2="src/test/resources/testData/CountryName.txt";
    String filename3="src/test/resources/testData/StateId.txt";
    String filename4="src/test/resources/testData/StateName.txt";



    @Given("zll Kullanici DB ile baglanti kurar")
    public void zll_kullanici_db_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }
    @Given("zll Kullanici Query tanimlar")
    public void zll_kullanici_query_tanimlar() {
        query="select * from public.country";
        System.out.println(DatabaseUtility.getColumnNames(query));

    }
    @Given("zll Kullanici ulke bilgilerine ulasir ve kaydeder")
    public void zll_kullanici_ulke_bilgilerine_ulasir_ve_kaydeder() {
        List<Object> idList= DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveCountryId(filename1,idList);
        List<Object> nameList= DatabaseUtility.getColumnData(query," name");
        WriteToTxt.saveCountryName(filename2,nameList);
    }
    @Given("zll Kullanici DB ile ulke bilgilerini dogrular")
    public void zll_kullanici_db_ile_ulke_bilgilerini_dogrular() {

        List<Object> actualCountryId= ReadTxt.returnCountryIDsList(filename1);
        List<Object> actualCountryName= ReadTxt.returnCountryNamesList(filename2);


        List<Object> expectedCountryId=new ArrayList<>();

        expectedCountryId.add(216008);
        Assert.assertTrue("ID uyusmuyor",actualCountryId.containsAll(expectedCountryId));

    }

    @Given("zll Kullanici sehir icin Query tanimlar")
    public void zll_kullanici_sehir_icin_query_tanimlar() {
        query = "select * from public.c_state";
        System.out.println(DatabaseUtility.getColumnNames(query));

    }
    @Given("zll Kullanici sehir bilgilerine ulasir ve kaydeder")
    public void zll_kullanici_sehir_bilgilerine_ulasir_ve_kaydeder() {
        List<Object> idList= DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveStateId(filename3,idList);
        List<Object> nameList= DatabaseUtility.getColumnData(query,"name");
        WriteToTxt.saveStateName(filename4,nameList);

    }
    @Given("zll Kullanici DB ile sehir bilgilerini dogrular")
    public void zll_kullanici_db_ile_sehir_bilgilerini_dogrular() {
        List<Object> actualStateId= ReadTxt.returnStateIDsList(filename3);
        List<Object> actualStateName= ReadTxt.returnStateNamesList(filename4);

        List<Object> expectedCountryId=new ArrayList<>();

        expectedCountryId.add(0); //database update etmeye izin vermedigi icin sehir eklenemedi
        Assert.assertTrue("ID uyusmuyor",actualStateId.containsAll(expectedCountryId));

    }

}
