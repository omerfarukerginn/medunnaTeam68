package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //homebutton ve registerbutton locate icin LoginPage sayfasindan obje create edip account menu ve register diyerek call edilmeli
    @FindBy(id = "ssn")
    public WebElement ssnRegisterPage;

    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement invalidSsnMessageRegisterPage;

    @FindBy(name = "firstName")
    public WebElement firstNameRegisterPage;
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement invalidFirstNameMessageRegisterPage;

    @FindBy(name = "lastName")
    public WebElement lastNameRegisterPage;
    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement invalidLastNameMessageRegisterPage;

    @FindBy(name = "username")
    public WebElement userNameRegisterPage;
    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement invalidUserNameMessageRegisterPage;

    @FindBy(id = "email")
    public WebElement emailRegisterPage;
    @FindBy(xpath = "//div[text()='Your email is required to be at least 5 characters.']")
    public WebElement invalidEmailMessageCharacterCountRegisterPage;
    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement invalidEmailMessageRegisterPage;

    @FindBy(name = "firstPassword")
    public WebElement newPassWordRegisterPage;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement newPasswordRegisterPageFirstColor;
    //her basamak ayri ayri locate edilmemis 1. basamak ve diigerleri olarak locate edilmis, bu bir bug olmasa da product owner a bunun requirement yetreince iyi "clear"yansittigini söylemek fena olmaz.
    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public WebElement getNewPassWordRegisterPageStrengthColor;
    @FindBy(xpath = "//input[@placeholder='Confirm the new password']")
    public WebElement confirmationPasswordRegisterPage;
    @FindBy(xpath = "//div[text()='Your confirmation password is required to be at least 4 characters.']")
    public WebElement invalidPasswordConfirmationCountCharacterMessageRegisterPage;
    @FindBy(xpath = "//div[text()='The password and its confirmation do not match!']")
    public WebElement invalidPasswordConfirmationMessageRegisterPage;
    @FindBy(id = "register-submit")
    public WebElement buttonRegisterPage;
    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement successMessageToastContainerRegisterPage;











    //registerButton
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement accountMenuRegisterButton;

    //newPassword section
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordSec;

    //US_003 password
    //1.renk // 5 renk liste hali //li[@class='point']
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordIlkRenk;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement passwordIkinciRenk;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordUcuncuRenk;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement passwordDorduncuRenk;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement passwordBesinciRenk;

}
