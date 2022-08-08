package pages;

import baseUrl.MedunnaBaseUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //account_Menu
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    //registerButton
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement accountMenuRegisterButton;

    //newPassword section
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordSec;

    //newPasswordConfirmation section
    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement newPasswordConfirmationSec;

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
