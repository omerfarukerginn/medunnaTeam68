package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class US_027_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();
    Faker faker = new Faker();

    @Then("ofe admin item&titles sekmesini acar")
    public void ofe_admin_item_titles_sekmesini_acar() {
        adminPage.itemsTitlesButon.click();
    }

    @Then("ofe admin messages butonuna tiklar")
    public void ofe_admin_messages_butonuna_tiklar() {
        adminPage.itemsTitlesMessagesButton.click();
    }

    @Then("ofe admin messages sayfasindaki ilk view butonuna tiklar")
    public void ofe_admin_messages_sayfasindaki_ilk_view_butonuna_tiklar() {
        adminPage.messagesPageIlkViewButton.click();
    }

    @Then("ofe admin name, email, message kisimlarinin goruldugunu onaylar")
    public void ofe_admin_name_email_message_kisimlarinin_goruldugunu_onaylar() {
        WebElement name = adminPage.messagesViewNameWebElement;
        WebElement email = adminPage.messagesViewEmailWebElement;
        WebElement message = adminPage.messagesViewMessageWebElement;
        assertTrue(name.isDisplayed());
        assertTrue(email.isDisplayed());
        assertTrue(message.isDisplayed());
    }

    @And("ofe admin create a new message butonuna tiklar")
    public void ofeAdminCreateANewMessageButonunaTiklar() {
        adminPage.createNewMessageButton.click();
    }

    @And("ofe admin yeni mesaj icin ilgili alanlari doldurur")
    public void ofeAdminYeniMesajIcinIlgiliAlanlariDoldurur() {
        adminPage.nameForNewMessage.clear();
        adminPage.nameForNewMessage.sendKeys(faker.funnyName().name());
        adminPage.emailForNewMessage.clear();
        adminPage.emailForNewMessage.sendKeys(faker.internet().emailAddress());
        adminPage.subjectForNewMessage.clear();
        adminPage.subjectForNewMessage.sendKeys(faker.superhero().power());
        adminPage.messageForNewMessage.clear();
        adminPage.messageForNewMessage.sendKeys(faker.rickAndMorty().quote());
    }

    @And("ofe admin messages sayfasindaki ilk edit butonuna tiklar")
    public void ofeAdminMessagesSayfasindakiIlkEditButonunaTiklar() {
        adminPage.messagesPageIlkEditButton.click();
    }

    @And("ofe admin messages sayfasindaki ilk delete butonuna tiklar")
    public void ofeAdminMessagesSayfasindakiIlkDeleteButonunaTiklar() {
        adminPage.messagesPageIlkDeleteButton.click();
    }

    @And("ofe admin acilan popup da delete butonunun tiklanabilir oldugunu onaylar")
    public void ofeAdminAcilanPopupDaDeleteButonununTiklanabilirOldugunuOnaylar() {
        assertTrue(adminPage.messagesPopUpDeleteButton.isEnabled());
    }
}
