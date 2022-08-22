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
        adminPage.administration.click();
        ReusableMethods.hooverByJS(adminPage.userManagement);
    }

    @Then("Kullanici View butonuna tiklar")
    public void kullanici_view_butonuna_tiklar() {

        //yeniden bak bu random olayina, 19. olayina odaklan, oradaki bilgileri assert edersin
        Random rnd = new Random();
        int rand1 = rnd.nextInt(21);

        for (int i = 0; i < adminPage.viewButonu.size(); i++) {
            adminPage.viewButonu.get(rand1).click();
        }
    }

    @Then("Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular")
    public void kullanici_first_name_lastname_email_language_created_by_seceneklerinin_gorundugunu_dogrular() {
        //daha dinamik sekli dusunulebilinir; Array list yapilabilinir. oraya bilgielr atilip
        //cekilebilinir.

        String expectedFirstName = "Ciftci";
        String expectedLastName = "Fidan";
        String expectedEmail = "fidan@gmail.com";
        String expectedCreatedBy = "anonymousUser";

        Assert.assertEquals(expectedFirstName, adminPage.firstName.getText());
        Assert.assertEquals(expectedLastName, adminPage.lastName.getText());
        Assert.assertEquals(expectedEmail, adminPage.email.getText());
        Assert.assertEquals(expectedCreatedBy, adminPage.createdBy.getText());


    }
}
