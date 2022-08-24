package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US_020_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Kullanici User management butonuna tiklar")
    public void kullanici_user_management_butonuna_tiklar() {
        ReusableMethods.waitForVisibility(adminPage.administration, 5).click();
        ReusableMethods.waitForVisibility(adminPage.userManagement, 5).click();

    }

    @Then("Kullanici View butonuna tiklar")
    public void kullanici_view_butonuna_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hooverByJS(adminPage.sonSayfayaGoturenOk);
        ReusableMethods.hooverByJS(adminPage.viewButonu.get(0));

        /*
        Kodun dinamik hali:

        Random rnd = new Random();
        int rand1 = rnd.nextInt(21);

        for (int i = 0; i < adminPage.viewButonu.size(); i++) {
            ReusableMethods.hooverByJS(adminPage.viewButonu.get(rand1));

        }
         */
    }

    @Then("Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular")
    public void kullanici_first_name_lastname_email_language_created_by_seceneklerinin_gorundugunu_dogrular() {
        Assert.assertTrue(adminPage.firstName.isDisplayed());
        Assert.assertTrue(adminPage.lastName.isDisplayed());
        Assert.assertTrue(adminPage.email.isDisplayed());
        Assert.assertTrue(adminPage.createdBy.isDisplayed());

    }

    @Then("Kullanici Edit butonuna tiklar")
    public void kullanici_edit_butonuna_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.hooverByJS(adminPage.editButonu.get(0));
        /*
        Kodun dinamik hali:
        Random rnd = new Random();
        int rand1 = rnd.nextInt(21);

        for (int i = 0; i < adminPage.editButonu.size(); i++) {
            ReusableMethods.hooverByJS(adminPage.editButonu.get(rand1));
            System.out.println(rand1);
        }
         */
    }

    @Then("Kullanici  kayitli kisiyi active eder")
    public void kullanici_kayitli_kisiyi_active_eder() {

        if (!adminPage.activeButonu.isSelected()) {
            adminPage.activeButonu.click();
        } else {
            System.out.println("Kullanici daha onceden active edilmistir.");
        }

    }

    @Then("Kullanici kayitli kisiyi Admin olarak secer")
    public void kullanici_kayitli_kisiyi_admin_olarak_secer() {


        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(4);
        Select select = new Select(adminPage.kullaniciProfilleri);
        select.deselectAll();

        int kullanicilar = 2;

        switch (kullanicilar) {
            case 1:
                select.selectByValue("ROLE_ADMIN");
                break;
            case 3:
                select.selectByValue("ROLE_PATIENT");
                break;
            case 4:
                select.selectByValue("ROLE_STAFF");
                break;
            case 5:
                select.selectByValue("ROLE_PHYSICIAN");
                break;
            default:
                System.out.println("hatali rakam girisi");
        }


    }

}
