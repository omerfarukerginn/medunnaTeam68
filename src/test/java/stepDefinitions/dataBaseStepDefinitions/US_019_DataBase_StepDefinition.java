package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_019_DataBase_StepDefinition {

String query;
String filename1="src/test/resources/testData/StaffId.txt";
String filename2="src/test/resources/testData/StaffFristName.txt";



    @Given("Kullanici DB ile baglanti kurar")
    public void kullaniciDBIleBaglantiKurar() {
        DatabaseUtility.createConnection();


    }


    @Given("Kullanici Query tanimlar")
    public void kullanici_query_tanimlar() {
        query="select * from public.jhi_user";
        System.out.println(DatabaseUtility.getColumnNames(query));

    }


    @Given("Kullanici Staff bilgilerine ulasir ve kaydeder")
    public void kullanici_staff_bilgilerine_ulasir_ve_kaydeder() {


        List<Object> idList= DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveStaffId(filename1,idList);

       List<Object> emailList= DatabaseUtility.getColumnData(query,"email");
        System.out.println(emailList);
       WriteToTxt.saveStaffName(filename2,emailList);

    }


    @Given("Kullanici DB ile Staff bilgilerini dogrular")
    public void kullanici_db_ile_staff_bilgilerini_dogrular() {

        List<Object> actualStaffId= ReadTxt.returnStaffIDsList(filename1);

        List<Object> expectedStaffId=new ArrayList<>();

        expectedStaffId.add(159437);
        Assert.assertTrue("ID uygunluk yok",actualStaffId.containsAll(expectedStaffId));


List<Object> actualStaffEmail= ReadTxt.returnStaffEmailList(filename2);

        List<Object> expectedStaffEmail=new ArrayList<>();

        expectedStaffEmail.add("ozan11@gmail.com");
        Assert.assertTrue("email uygunluk yok",actualStaffEmail.containsAll(expectedStaffEmail));


    }



}


