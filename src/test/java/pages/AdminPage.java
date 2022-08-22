package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // US_28 location
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement humanButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement singInButtonu;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement itemsTitlesButonu;
    @FindBy(xpath = "//a[@href='/country']")
    public WebElement countryButonu;
    @FindBy(xpath = "//*[text()='Create a new Country']")
    public WebElement createCountryButonu;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement createCountryNameButonu;

    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement tarihSaatButonu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[text()='State/City']")
    public WebElement stateCityButonu;

    @FindBy(xpath = "//*[text()='Create a new State/City']")
    public WebElement createStateCityButonu;

    @FindBy(xpath = "//*[@id='c-state-name']")
    public WebElement createStateCityNameButonu;

    @FindBy(xpath = "//*[@id='c-state-state']")
    public WebElement stateCitySecmeButonu;

    @FindBy(xpath = "(//*[text()='YeniDunya'])[1]")
    public WebElement ulkeIsmi;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> tumUlkeIsimleri;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;

































































































//Dilek
    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement roomButton;








































































































































































































// NAIL BASLAMA NOKTASI

    @FindBy(xpath = "//*[@class='dropdown show nav-item']")
    public WebElement itemsTitlessButonu;
    @FindBy(xpath = "(//*[@href='/physician'])[1]")
    public WebElement physicianSekmesi;
    @FindBy(xpath = "//(//div[4]//div[1])[2]//h2]")
    public WebElement physicianBaslik;
    @FindBy (xpath = "//(//div[4]//div[1])[2]")
    public List<WebElement> physicianTablosu;

























































































    // NAIL BITIS NOKTASI










































































































































































































    // US_28 location

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement humanButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement singInButtonu;
   @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement itemsTitlesButonu;
    @FindBy(xpath = "//a[@href='/country']")
    public WebElement countryButonu;
    @FindBy(xpath = "//*[text()='Create a new Country']")
    public WebElement createCountryButonu;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement createCountryNameButonu;

    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement tarihSaatButonu;
































































// US19 location

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement AccountButton;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement singInButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userrName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordd;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisSonrasiSingInn;

    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement welcomeToMedunnaYazisisi;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButon;

    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement staffButon;

    @FindBy(xpath = "//*[text()='Create a new Staff']")
    public WebElement CreateANewButonu;

    @FindBy(xpath = "//*[@name='useSSNSearch']")
    public WebElement userSearchBox;









}


