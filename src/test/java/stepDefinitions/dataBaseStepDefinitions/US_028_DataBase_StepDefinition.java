package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.*;
import utilities.DatabaseUtility;

public class US_028_DataBase_StepDefinition {

    String query;
    String filename1="src/test/resources/testData/CountryId.txt";
    String filename2="src/test/resources/testData/CountryName.txt";

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

    }
    @Given("zll Kullanici DB ile ulke bilgilerini dogrular")
    public void zll_kullanici_db_ile_ulke_bilgilerini_dogrular() {

    }


}
