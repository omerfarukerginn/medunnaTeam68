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
    String fileName= "src/test/resources/testdata/AppointmentData.txt";


    @Given("Eb Kullanici database ile baglanti kurar")
    public void eb_kullanici_database_ile_baglanti_kurar() {
        DBUtils.createConnection();
    }

    @Given("Eb Kullanici query tanimlar")
    public void eb_kullanici_query_tanimlar() {
        query= "select * from appointment";
    }

    @Given("Eb Kullanici randevu bilgilerine ulasir ve kaydeder")
    public void eb_kullanici_randevu_bilgilerine_ulasir_ve_kaydeder() {

        System.out.println("===============ID LIST===============");
        List<Object> idList = getColumnData(query, "patient_id");
        System.out.println(idList + "\n");
        WriteToTxt.saveAppointmentId(fileName, idList);

        System.out.println("===============START DATE LIST===============");
        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList + "\n");
        WriteToTxt.saveAppointmentStartDate(fileName, startDateList);

        System.out.println("===============NAME LIST===============");
        List<Object> statusList = getColumnData(query, "created_by");
        System.out.println(statusList + "\n");
        WriteToTxt.saveAppointmentStatus(fileName, statusList);

    }

    @Then("Eb Kullanici DB ile randevu bilgilerini {string}, {string},{string} ile dogrular")
    public void eb_kullanici_db_ile_randevu_bilgilerini_ile_dogrular(String patientId, String Name, String start_date) {

        List<Object> actualAppointmentIDs = ReadTxt.returnAppointmentIDsList(fileName);
        Assert.assertTrue("ID UYUSMUYOR", actualAppointmentIDs.contains(patientId));

        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName);
        Assert.assertTrue("START DATE UYUSMUYOR", actualAppointmentStartDate.contains(start_date));
    }


}
