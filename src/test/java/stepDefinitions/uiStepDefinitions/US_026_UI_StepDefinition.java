package stepDefinitions.uiStepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_026_UI_StepDefinition {

    LoginPage loginPage = new LoginPage();
    ContactPage us026 = new ContactPage();
    Faker faker= new Faker();
    Actions actions=new Actions(Driver.getDriver());


    @And("Kullanici contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.contactButton, 20);
        us026.contactButton.click();
    }

    @And("Kullanici name, email, subject ve message kisimlarini doldurur")
    public void kullaniciNameEmailSubjectVeMessageKisimlariniDoldurur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us026.contactNameKutusu,20);
        actions.click(us026.contactNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("subject"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("message"),Keys.ENTER)
                .perform();
    }

    @And("Kullanici send butonuna tiklar")
    public void kullaniciSendButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.sendButton,20);
        us026.sendButton.submit();
    }

    @And("Kullanici Your message has been received yazisinin gorunurlugunu test eder")
    public void kullaniciYourMessageHasBeenReceivedYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us026.dogrulamaYazisi,20);
        Assert.assertTrue(us026.dogrulamaYazisi.isDisplayed());
    }


    @And("Hasta contact butonuna  tiklar")
    public void hastaContactButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.contactButton, 20);
        us026.contactButton.click();
    }

    @And("Hasta name, email, subject ve message kisimlarini doldurur")
    public void hastaNameEmailSubjectVeMessageKisimlariniDoldurur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us026.contactNameKutusu,20);
        actions.sendKeys(us026.contactNameKutusu,faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("subject"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("message"))
                .perform();
    }

    @And("Hasta send butonuna tiklar")
    public void hastaSendButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.sendButton,20);
        us026.sendButton.submit();
    }

    @And("Hasta Your message has been received yazisinin gorunurlugunu test eder")
    public void hastaYourMessageHasBeenReceivedYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us026.dogrulamaYazisi,20);
        Assert.assertTrue(us026.dogrulamaYazisi.isDisplayed());
    }

    @And("Doktor contact butonuna  tiklar")
    public void doktorContactButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.contactButton, 20);
        us026.contactButton.click();
    }

    @And("Doktor name, email, subject ve message kisimlarini doldurur")
    public void doktorNameEmailSubjectVeMessageKisimlariniDoldurur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us026.contactNameKutusu,20);
        actions.sendKeys(us026.contactNameKutusu,faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("subject"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("message"))
                .perform();
    }

    @And("Doktor send butonuna tiklar")
    public void doktorSendButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.sendButton,20);
        us026.sendButton.submit();

    }

    @And("Doktor Your message has been received yazisinin gorunurlugunu test eder")
    public void doktorYourMessageHasBeenReceivedYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us026.dogrulamaYazisi,20);
        Assert.assertTrue(us026.dogrulamaYazisi.isDisplayed());
    }

    @And("Staff contact butonuna  tiklar")
    public void staffContactButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.contactButton, 20);
        us026.contactButton.click();
        
    }

    @And("Staff name, email, subject ve message kisimlarini doldurur")
    public void staffNameEmailSubjectVeMessageKisimlariniDoldurur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us026.contactNameKutusu,20);
        actions.click(us026.contactNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("subject"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("message"),Keys.ENTER)
                .perform();
        
    }

    @And("Staff send butonuna tiklar")
    public void staffSendButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.sendButton,20);
        us026.sendButton.submit();
        
    }

    @And("Staff Your message has been received yazisinin gorunurlugunu test eder")
    public void staffYourMessageHasBeenReceivedYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us026.dogrulamaYazisi,20);
        Assert.assertTrue(us026.dogrulamaYazisi.isDisplayed());
    }

    @And("Admin contact butonuna  tiklar")
    public void adminContactButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.contactButton, 20);
        us026.contactButton.click();
    }

    @And("Admin name, email, subject ve message kisimlarini doldurur")
    public void adminNameEmailSubjectVeMessageKisimlariniDoldurur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us026.contactNameKutusu,20);
        actions.click(us026.contactNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("subject"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("message"),Keys.ENTER)
                .perform();
    }

    @And("Admin send butonuna tiklar")
    public void adminSendButonunaTiklar() {
        ReusableMethods.waitForClickablility(us026.sendButton,20);
        us026.sendButton.submit();

    }

    @And("Admin Your message has been received yazisinin gorunurlugunu test eder")
    public void adminYourMessageHasBeenReceivedYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us026.dogrulamaYazisi,20);
        Assert.assertTrue(us026.dogrulamaYazisi.isDisplayed());
    }
}
