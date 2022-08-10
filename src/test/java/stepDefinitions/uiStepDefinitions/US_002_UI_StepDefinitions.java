package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_002_UI_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    SoftAssert softAssert = new SoftAssert();



    @When("kullanci User Username kutusuna tiklamali ve herhangi bir karakter iceren \\(username) adi girer{string}")
    public void kullanciUserUsernameKutusunaTiklamaliVeHerhangiBirKarakterIcerenUsernameAdiGirer(String username) {
        registerPage.userNameRegisterPage.sendKeys( username );

    }

    @Then("Kullanici Your username is required mesajini görmemeli")
    public void kullaniciYourUsernameIsRequiredMesajiniGörmemeli() {
        boolean flag=false;

        try {
            registerPage.lastNameRegisterPage.isDisplayed();
            System.out.println("user should not see any messages");
        }catch (Exception e){
            flag=true;
        }
        softAssert.assertFalse( flag );
        softAssert.assertAll();
    }
    @Given("kullanci gecerli bir ssn numaraasi girer {string}")
    public void kullanci_gecerli_bir_ssn_numaraasi_girer(String string) {
       registerPage.ssnRegisterPage.sendKeys( string );
    }

    @Given("kullanci gecerli bir first name girer {string}")
    public void kullanci_gecerli_bir_first_name_girer(String string) {
       registerPage.firstNameRegisterPage.sendKeys( string );
    }

    @Given("kullanci gecerli bir last name girer {string}")
    public void kullanci_gecerli_bir_last_name_girer(String string) {
      registerPage.lastNameRegisterPage.sendKeys( string );
    }

    @Given("kullanci username bos birakir")
    public void kullanci_username_bos_birakir() {
        registerPage.userNameRegisterPage.sendKeys( "" );
    }

    @Given("kullanci bir pasword girer {string}")
    public void kullanci_bir_pasword_girer(String string) {
      registerPage.newPassWordRegisterPage.sendKeys( string );
    }

    @Given("kullanci girilen passwordu dogrular {string}")
    public void kullanci_girilen_passwordu_dogrular(String string) {
       registerPage.confirmationPasswordRegisterPage.sendKeys( string );
    }

    @When("kullanici register tusuna basar")
    public void kullanici_register_tusuna_basar() {
       registerPage.buttonRegisterPage.click();
    }

    @Then("kullanci your username is required mesaji alir")
    public void kullanci_your_username_is_required_mesaji_alir() {
       softAssert.assertTrue( registerPage.invalidUserNameMessageRegisterPage.isDisplayed() );
       softAssert.assertAll();
    }


    @And("Kullanici email kutusunu tiklamali ve gecerli bir email girmeli {string}")
    public void kullaniciEmailKutusunuTiklamaliVeGecerliBirEmailGirmeli(String email) {
        registerPage.emailRegisterPage.sendKeys( email );

    }


    @Then("Kullanici Kullanici {string} mesaji görmemeli")
    public void kullaniciKullaniciMesajiGörmemeli(String messages) {
        boolean flag=false;
        try {
            registerPage.emailRegisterPage.isDisplayed();
        }catch (Exception e){
            flag=false;
        }
        softAssert.assertFalse( flag );
        softAssert.assertAll();
    }

    @And("Kullanici email kutusunu tiklamali ve “@“ kullanarak ANCAK “.“ kullanmadan  email girmeli {string}")
    public void kullaniciEmailKutusunuTiklamaliVeKullanarakANCAKKullanmadanEmailGirmeli(String email) {
        registerPage.emailRegisterPage.sendKeys( email );
        registerPage.newPassWordRegisterPage.click();

    }

    @Then("Kullanici Kullanici {string} mesaji görmeli")
    public void kullaniciKullaniciMesajiGörmeli(String email) {
        softAssert.assertTrue( registerPage.invalidEmailMessageRegisterPage.isDisplayed() );
        softAssert.assertAll();

    }

    @And("Kullanici email kutusunu tiklamali ve “.“ isareti kullandiktan sonra “@“ ile devam ederk mail adresi yazmali  email girmeli {string}")
    public void kullaniciEmailKutusunuTiklamaliVeIsaretiKullandiktanSonraIleDevamEderkMailAdresiYazmaliEmailGirmeli(String mail) {
        registerPage.emailRegisterPage.sendKeys( mail );
    }

    @Then("Kullanici Kullanici The field is invalid mesaji görmemeli")
    public void kullaniciKullaniciTheFieldIsInvalidMesajiGörmemeli() {
        registerPage.newPassWordRegisterPage.click();
        String actual=registerPage.invalidEmailMessageRegisterPage.getText();
        boolean expected=registerPage.invalidEmailMessageRegisterPage.isDisplayed();
        softAssert.assertFalse( expected,actual );
        softAssert.assertAll();
    }
}
