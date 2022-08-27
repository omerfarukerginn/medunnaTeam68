package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_016_UI_StepDefinition {
    AdminPage us016 = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());
    Random rand = new Random();
    int rdn = 999999;
    String roomrandm = String.valueOf(rand.nextInt(rdn));

    @Then("Admin  Items&Titles butonuna tiklar ve ardindan Room butonuna tiklar")
    public void admin_items_titles_butonuna_tiklar_ve_ardindan_room_butonuna_tiklar() {
        us016.itemsTitlesButon.click();

        ReusableMethods.waitFor(2);

        us016.roomButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Admin  Create a new Room butonuna tiklar")
    public void admin_create_a_new_room_butonuna_tiklar() {
        us016.CreateANewRoomButton.click();
        ReusableMethods.waitFor(2);


    }

    @Then("Admin  Room Number bolumunu doldurur ve unique olmalidir")
    public void admin_room_number_bolumunu_doldurur_ve_unique_olmalidir() {


        us016.roomNumberKutusu.sendKeys(roomrandm);
        ReusableMethods.waitFor(2);


    }

    @Then("Admin  Typi'ni TWIN,DELUXE,PREMIUM_DELUXE,SUIT ve DAYCARE olarak secebilir")
    public void admin_typi_ni_twin_deluxe_premium_deluxe_suit_ve_daycare_olarak_secebilir() {
        us016.roomTypeKututsu.click();
        Driver.selectAnItemFromDropdown(us016.roomTypeKututsu, "TWIN");
        us016.roomTypeKututsu.click();
        Driver.selectAnItemFromDropdown(us016.roomTypeKututsu, "DELUXE");
        us016.roomTypeKututsu.click();
        Driver.selectAnItemFromDropdown(us016.roomTypeKututsu, "PREMIUM_DELUXE");
        us016.roomTypeKututsu.click();
        Driver.selectAnItemFromDropdown(us016.roomTypeKututsu, "SUIT");
        us016.roomTypeKututsu.click();
        Driver.selectAnItemFromDropdown(us016.roomTypeKututsu, "DAYCARE");
        ReusableMethods.waitFor(1);

    }

    @Then("Admin  Price kutusuna fiyat bilgisi girer")
    public void admin_price_kutusuna_fiyat_bilgisi_girer() {
        us016.priceKutusu.sendKeys("150");
        ReusableMethods.waitFor(2);

    }

    @Then("Admin  Save butonuna tiklar")
    public void admin_save_butonuna_tiklar() {
        us016.saveButonu.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(2);

    }

    @And("Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur")
    public void AdminIsleminBasariliOldugunuGosterenYesilMesajKutusunuGorur() {
        Assert.assertTrue(us016.basariliIslemYesilMesajKutusu.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    @And("Admin  Room Number kutusunu bos birakir")
    public void adminRoomNumberKutusunuBosBirakir() {
        us016.roomNumberKutusu.clear();
        ReusableMethods.waitFor(2);

    }

    @Then("Admin This field is required uyari yazisini gorur")
    public void adminThisFieldIsRequiredUyariYazisiniGorur() {
        Assert.assertTrue(us016.isRequiredUyariYazisi.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    @Then("Admin  Status butonuna tiklar")
    public void admin_status_butonuna_tiklar() {
        us016.statusKutusu.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Admin  Status butonunu bos birakir")
    public void admin_status_butonunu_bos_birakir() {
        us016.statusKutusu.clear();
        ReusableMethods.waitFor(2);

    }

    @Then("Admin  Status'un Available olarak belirlendigini gorur")
    public void admin_status_un_available_olarak_belirlendigini_gorur() {
        Assert.assertTrue(us016.availableYazisi.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    @And("Admin status'un Full olarak belirlendigini gorur")
    public void adminStatusUnFullOlarakBelirlendiginiGorur() {
        Assert.assertTrue(us016.fullYazisi.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Admin  This field is required uyari yazisini gorur.")
    public void admin_this_field_is_required_uyari_yazisini_gorur() {
        Assert.assertTrue(us016.isRequiredUyariYazisi.isDisplayed());
        ReusableMethods.waitFor(2);

    }


    @And("Admin  Description kutusuna bilgi girer")
    public void adminDescriptionKutusunaBilgiGirer() {
        us016.descriptionKutusu.sendKeys("son gunlerini yasiyor");
        ReusableMethods.waitFor(2);

    }

    @And("Admin  Description kutusunu bos birakir")
    public void adminDescriptionKutusunuBosBirakir() {
        us016.descriptionKutusu.clear();
        ReusableMethods.waitFor(2);

    }


    @Then("Admin Created Data bolumune Gun Ay Yil  olarak gecmis bir tarih girer")
    public void admin_created_data_bolumune_gun_ay_yil_olarak_gecmis_bir_tarih_girer() {
        us016.createdDateKutusu.sendKeys("20/08/2022");
        ReusableMethods.waitFor(2);


    }


    @And("Admin Room Type bolumune tiklar")
    public void adminRoomTypeBolumuneTiklar() {
        us016.kacTurRoomTypeButonu.click();
        ReusableMethods.waitFor(3);

    }

    @Then("Admin Room Type olarak ayni secilen odalari gorebilir")
    public void adminRoomTypeOlarakAyniSecilenOdalariGorebilir() {
        Assert.assertTrue(us016.twinnType.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @And("Admin Edit butonuna tiklar")
    public void adminEditButonunaTiklarVeBilgileriGuncellerYaDaDegistirir() {
        us016.olusturdugumRoomEditButonu.click();
        ReusableMethods.waitFor(2);

    }


    @And("Admin islem yaptigi son sayfanin okuna tiklar")
    public void adminIslemYaptigiSonSayfaninOkunaTiklar() {
        ReusableMethods.hooverByJS(us016.sonSayfaninOku);
        ReusableMethods.waitFor(2);


    }

    @And("Admin sayfanin basina gelir")
    public void adminSayfaninBasinaGelir() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Admin olusturdugu odaya tiklar")
    public void adminOlusturduguOdayaTiklar() {
        us016.idRoom.click();
    }

    @Then("Admin islem yaptigi sayfaya tiklar")
    public void adminIslemYaptigiSayfayaTiklar() {
        ReusableMethods.waitFor(2);
        // actions.sendKeys(Keys.).click(us016.sonSayfaninOku).perform();
        //ReusableMethods.hooverByJS(us016.sonSayfaninOku);
        Driver.getDriver().navigate().to("https://www.medunna.com/room?page=84&sort=id,asc");
        //  Driver.getDriver().navigate().to("https://medunna.com/room?page=+" + arg81 + "+ &sort=roomType,asc");
     /*   List<WebElement> roomId = Driver.getDriver().findElements(By.xpath("//div[@class='table-responsive']//tbody//tr[1]//td[2]"));
        for (int i = 0; i < roomId.size(); i++) {
            if (roomId.get(i).equals(Integer.parseInt(roomrandm))) {
                System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody//tr[1]//td[3]")).getText());
                System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody//tr[1]//td[4]")).getText());

            }
        }*/
  //actions.sendKeys(Keys.PAGE_UP).perform();

    }
}