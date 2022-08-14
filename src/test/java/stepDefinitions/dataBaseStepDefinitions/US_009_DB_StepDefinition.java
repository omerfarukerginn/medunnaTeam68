package stepDefinitions.dataBaseStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.DatabaseUtility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class US_009_DB_StepDefinition {

    @Given("user connects to database")
    public void user_connects_to_database() {

        DatabaseUtility.createConnection();

    }
    @When("user gets the {string} from {string} table with the {string} of {string}")
    public void user_gets_the_from_table_with_the_of(String column, String table, String idColumn, String actualId) {

        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DatabaseUtility.executeQuery(query);
    }
    @Then("the {string} of the person should be {string}")
    public void the_of_the_person_should_be(String firstNameColumn, String actualFirstName) throws SQLException {

        DBUtils.getResultset().next();

        Assert.assertEquals(DBUtils.getResultset().getObject(firstNameColumn), actualFirstName);

    }
    @Then("close the database connection")
    public void close_the_database_connection() {
        DatabaseUtility.closeConnection();

    }
}
