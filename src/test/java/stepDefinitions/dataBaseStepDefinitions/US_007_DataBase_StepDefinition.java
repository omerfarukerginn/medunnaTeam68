package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.Collections;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US_007_DataBase_StepDefinition {

     String query;
     String fileName1= "src/test/resources/testData/AppointmentStartDate.txt";
     String fileName2= "src/test/resources/testData/AppointmentName.txt";

    @Given("Eb Kullanici database ile baglanti kurar")
    public void eb_kullanici_database_ile_baglanti_kurar() {
        DBUtils.createConnection();
    }

    @Given("Eb Kullanici query tanimlar")
    public void eb_kullanici_query_tanimlar() {
        query= "select * from public.appointment where patient_id=159071;";
        System.out.println("28.satir"+DBUtils.getColumnNames(query) + "\n");
    }


    @Given("Eb Kullanici randevu bilgilerine ulasir ve kaydeder")
    public void eb_kullanici_randevu_bilgilerine_ulasir_ve_kaydeder() {

        /*

        System.out.println("===============PATIENT ID LIST===============");
        List<Object> idList = getColumnData(query, "patient_id");
        System.out.println(idList + "\n");
        WriteToTxt.saveAppointmentId(fileName, idList);



         */

        System.out.println("===============START DATE LIST===============");
        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList + "\n");
        WriteToTxt.saveAppointmentStartDate(fileName1, startDateList);

        System.out.println("===============NAME LIST===============");
        List<Object> isimList = getColumnData(query, "created_by");
        System.out.println(isimList + "\n");
        WriteToTxt.saveAppointmentStatus(fileName2, isimList);

    }




    @Then("Eb Kullanici DB ile randevu bilgilerini dogrular")
    public  void ebKullaniciDBIleRandevuBilgileriniDogrular() {

        /*
        List<Object> actualAppointmentIDs = ReadTxt.returnAppointmentIDsList(fileName);
        Assert.assertTrue("ID UYUSMUYOR", actualAppointmentIDs.contains(159071));

         */


        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName1);
        Assert.assertTrue("START DATE UYUSMUYOR", actualAppointmentStartDate.contains("2022-08-15 00:00:00.0"));



        List<Object> actualAppointmentName = ReadTxt.returnAppointmentNameList(fileName2);
        Assert.assertTrue("ISIM UYUSMUYOR", actualAppointmentName.contains("hastamahmut"));




    }
}
