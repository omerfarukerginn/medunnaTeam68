package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.Driver;

public class US_016_UI_StepDefinition {
    AdminPage us016 = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Admin  Items&Titles butonuna tiklar ve ardindan Room butonuna tiklar")
    public void admin_items_titles_butonuna_tiklar_ve_ardindan_room_butonuna_tiklar() {
        us016.itemsTitlesButon.click();
        us016.roomButton.click();
    }
    @Then("Admin  Create a new Room butonuna tiklar")
    public void admin_create_a_new_room_butonuna_tiklar() {
        us016.CreateANewButonu.click();


    }
    @Then("Admin  Room Number bolumunu doldurur ve unique olmalidir")
    public void admin_room_number_bolumunu_doldurur_ve_unique_olmalidir() {


    }
    @Then("Admin  Typi'ni TWIN,DELUXE,PREMIUM_DELUXE,SUIT ve DAYCARE olarak secebilir")
    public void admin_typi_ni_twin_deluxe_premium_deluxe_suit_ve_daycare_olarak_secebilir() {

    }
    @Then("Admin  Price kutusuna fiyat bilgisi girer")
    public void admin_price_kutusuna_fiyat_bilgisi_girer() {

    }
    @Then("Admin  Save butonuna tiklar")
    public void admin_save_butonuna_tiklar() {

    }
    @Then("Admin  A new Room is created with identifier mesajinin oldugu kutuyu  gorur.")
    public void admin_a_new_room_is_created_with_identifier_mesajinin_oldugu_kutuyu_gorur() {

    }



}