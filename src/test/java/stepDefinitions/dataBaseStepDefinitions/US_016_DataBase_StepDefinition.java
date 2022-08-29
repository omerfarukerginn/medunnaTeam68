package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class US_016_DataBase_StepDefinition {


    String query;
    String filename1 = "src/test/resources/testData/RoomId.txt";
    String filename2 = "src/test/resources/testData/RoomNumber.txt";


    @Given("Admin DB ile baglanti kurar")
    public void adminDBIleBaglantiKurar()  throws SQLException {
        DatabaseUtility.createConnection();

    }

    @And("Admin Room Query tanimlar")
    public void adminRoomQueryTanimlar() {
        query = "select * from room where room_number=984330261";
        System.out.println(DatabaseUtility.getColumnNames(query));

    }

    @And("Admin Room bilgilerine ulasir ve kaydeder")
    public void adminRoomBilgilerineUlasirVeKaydeder() {

        List<Object> idList= DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveRoomId(filename1,idList);
    }

    @And("Admin DB ile Room  bilgilerini dogrular")
    public void adminDBIleRoomBilgileriniDogrular() {
   //     List<Object> actualRoomId= ReadTxt.returnRoomIDsList(filename1);

        List<Object> expectedRoomId=new ArrayList<>();

        expectedRoomId.add(130660);
      //  Assert.assertTrue("ID uyusmuyor",actualRoomId.containsAll(expectedRoomId));

    }
}
