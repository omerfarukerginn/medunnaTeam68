package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SettingsPage {

    public SettingsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement loginButtonu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement singinButtonu;

    @FindBy(xpath = "(//input[@name='username'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girisSonrasiSingin;
////*[@type='submit']
    @FindBy(xpath = " //*[@id='account-menu']")
    public WebElement kullaniciGiris;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//label[@for='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//label[@for='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameKutusu;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameKutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[text()='Settings saved!']")
    public WebElement settingSaved;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstNameBosUyari;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastNameBosUyari;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement emailBosUYari;

    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement gecersizEmailUYari;





















}
