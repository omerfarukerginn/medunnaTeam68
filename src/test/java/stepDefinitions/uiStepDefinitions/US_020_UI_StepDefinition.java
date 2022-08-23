package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AdminPage;
import utilities.ReusableMethods;

import java.util.Random;

public class US_020_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();

    @Then("Kullanici User management butonuna tiklar")
    public void kullanici_user_management_butonuna_tiklar() {
        ReusableMethods.waitForVisibility(adminPage.administration, 5).click();
        ReusableMethods.waitForVisibility(adminPage.userManagement, 5).click();

    }
    @Then("Kullanici View butonuna tiklar")
    public void kullanici_view_butonuna_tiklar() {

        //yeniden bak bu random olayina, 19. olayina odaklan, oradaki bilgileri assert edersin
        Random rnd = new Random();
        int rand1 = rnd.nextInt(21);

       for (int i = 0; i < adminPage.viewButonu.size(); i++) {
           ReusableMethods.hooverByJS(adminPage.viewButonu.get(rand1));

       }
    }

    @Then("Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular")
    public void kullanici_first_name_lastname_email_language_created_by_seceneklerinin_gorundugunu_dogrular() {
        Assert.assertTrue(adminPage.firstName.isDisplayed());
        Assert.assertTrue(adminPage.lastName.isDisplayed());
        Assert.assertTrue(adminPage.email.isDisplayed());
        Assert.assertTrue(adminPage.createdBy.isDisplayed());


    }
}
