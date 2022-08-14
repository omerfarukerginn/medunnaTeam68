package stepDefinitions.dataBaseStepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US_010_DataBase_StepDefination {
/*
    @Test
    public void test() {
        DBUtils.createConnection();
        String query = "select * from appointment where id=159230";
        System.out.println(DBUtils.getColumnNames(query));

        List<Object> statusList = getColumnData(query, "status");
        System.out.println(statusList);

        String fileName1 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentStatus(fileName1, statusList);
        List<Object> actualAppointmentStatus = ReadTxt.returnAppointmentStatusList(fileName1);
        List<Object> expectedAppointmentStatus= new ArrayList<>();
        expectedAppointmentStatus.add("PENDING");
        Assert.assertTrue("STATUS Kodlar uyusmuyor", actualAppointmentStatus.containsAll(expectedAppointmentStatus));

        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList);

        String fileName2 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentStartDate(fileName2, startDateList);
        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName1);
        List<Object> expectedAppointmentStartDate= new ArrayList<>();
        expectedAppointmentStartDate.add("2022-08-05T00:00:00Z");
        Assert.assertTrue("STARTDATE Kodlar uyusmuyor", actualAppointmentStartDate.containsAll(expectedAppointmentStartDate));

        List<Object> endDateList = getColumnData(query, "end_date");
        System.out.println(endDateList);

        String fileName3 = "src/test/resources/testData/AppointmentGenel.txt";
        WriteToTxt.saveAppointmentEndDate(fileName3, startDateList);
        List<Object> actualAppointmentEndDate = ReadTxt.returnAppointmentEndDateList(fileName1);
        List<Object> expectedAppointmentEndDate= new ArrayList<>();
        expectedAppointmentEndDate.add("2022-08-05T01:00:00Z");
        Assert.assertTrue("ENDDATE Kodlar uyusmuyor", actualAppointmentEndDate.containsAll(expectedAppointmentEndDate));
    }

*/

    //List<Object> dbAppoint;

    String query = "select * from appointment";
   // String query = "select *from public.appointment";
    String fileName1 = "src/test/resources/testdata/AppointmentId.txt";
    String fileName2 = "src/test/resources/testdata/AppointmentSD.txt";
    String fileName3 = "src/test/resources/testdata/AppointmentED.txt";
    String fileName4 = "src/test/resources/testdata/AppointmentS.txt";

    // DB ile baglanti kur
    @Given("Kullanici database ile baglanti kurar")
    public void kullanici_database_ile_baglanti_kurar() {

        DBUtils.createConnection();
    }

    // Query tanimla
    @Given("Kullanici query tanimlar")
    public void kullanici_query_tanimlar() {


        System.out.println("82.satir"+DBUtils.getColumnNames(query) + "\n");
    }

    // Randevu datalarina ulas ve kaydet
    @Given("Kullanici randevu bilgilerine ulasir ve kaydeder")
    public void kullanici_randevu_bilgilerine_ulasir_ve_kaydeder() {


        System.out.println("===============ID LIST===============");
        List<Object> idList = getColumnData(query, "id");
        System.out.println(idList + "\n");
        WriteToTxt.saveAppointmentId(fileName1, idList);


        System.out.println("===============START DATE LIST===============");
        List<Object> startDateList = getColumnData(query, "start_date");
        System.out.println(startDateList + "\n");
        WriteToTxt.saveAppointmentStartDate(fileName2, startDateList);


        System.out.println("===============END DATE LIST===============");
        List<Object> endDateList = getColumnData(query, "end_date");
        System.out.println(endDateList + "\n");
        WriteToTxt.saveAppointmentEndDate(fileName3, endDateList);

        System.out.println("===============STATUS LIST===============");
        List<Object> statusList = getColumnData(query, "status");
        System.out.println(statusList + "\n");
        WriteToTxt.saveAppointmentStatus(fileName4, statusList);



        // Randevu datalarini dogrula





        List<Object> actualAppointmentIDs = ReadTxt.returnAppointmentIDsList(fileName1);
        List<Object> expectedAppointmentIDs = new ArrayList<>();
        expectedAppointmentIDs.add(160060); // giris id si
        Assert.assertTrue("ID UYUSMUYOR", actualAppointmentIDs.containsAll(expectedAppointmentIDs));



        List<Object> actualAppointmentStartDate = ReadTxt.returnAppointmentStartDateList(fileName2);
        List<Object> expectedAppointmentStartDate = new ArrayList<>();
        expectedAppointmentStartDate.add("2021-12-22 17:00:00.0");
        Assert.assertTrue("START DATE UYUSMUYOR", actualAppointmentStartDate.containsAll(expectedAppointmentStartDate));


        List<Object> actualAppointmentEndDate = ReadTxt.returnAppointmentEndDateList(fileName3);
        List<Object> expectedAppointmentEndDate = new ArrayList<>();
        expectedAppointmentEndDate.add("2022-08-05 01:00:00.0");
        Assert.assertTrue("END DATE UYUSMUYOR", actualAppointmentEndDate.containsAll(expectedAppointmentEndDate));




        List<Object> actualAppointmentStatus = ReadTxt.returnAppointmentStatusList(fileName4);
        List<Object> expectedAppointmentStatus = new ArrayList<>();
        expectedAppointmentStatus.add("COMPLETED");
        Assert.assertTrue("COMPLETED", actualAppointmentStatus.containsAll(expectedAppointmentStatus));




        }


    @Then("Kullanici DB ile randevu bilgilerini {string}, {string},{string},{string} dogrular")
    public void kullaniciDBIleRandevuBilgileriniDogrular(String patientId, String start_date, String end_date, String status) {


      //  dbAppoint=DBUtils.getColumnData(query,patientId);
        /*
        dbAppoint=DBUtils.getColumnData(query,start_date);
        dbAppoint=DBUtils.getColumnData(query,end_date);
        dbAppoint = DBUtils.getColumnData(query, status);

        Assert.assertTrue(dbAppoint.contains(start_date));
        Assert.assertTrue(dbAppoint.contains(end_date));
        Assert.assertTrue(dbAppoint.contains(status));
         */

    }
}
