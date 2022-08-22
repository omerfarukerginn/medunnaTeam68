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













































































































































































































































































































































































































//Ebru 411-510 arasi
    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement administration;

    @FindBy (xpath="(//div[@role='menu'])[2]")
    public WebElement userManagement;

    @FindBy (xpath="//a[@class='btn btn-info btn-sm']")// 20 tane var, 19.siradakini alirsin
    public List<WebElement> viewButonu;

    @FindBy (xpath="//a[@class='btn btn-primary btn-sm']") //fidan@gmail.com
    public List<WebElement> editButonu;

    @FindBy (xpath = "//dd[2]") //firstName icin getTest yapilir, assert edilir
    public WebElement firstName;

    @FindBy (xpath = "//dd[3]") //lastName icin getTest yapilir, assert edilir
    public WebElement lastName;

    @FindBy (xpath = "//dd[4]") //email icin getTest yapilir, assert edilir
    public WebElement email;

    @FindBy (xpath = "//dd[6]") //email icin getTest yapilir, assert edilir
    public WebElement createdBy;







































































































































































































    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement humanButton;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement singInButtonu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisSonrasiSingIn;

    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement welcomeToMedunnaYazisi;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButonu;

    @FindBy(xpath = "//a[@href='/country']")
    public WebElement countryButonu;

    @FindBy(xpath = "//*[text()='Create a new Country']")
    public WebElement createCountryButonu;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement createCountryNameButonu;

    @FindBy(xpath = "//input[@class='form-control is-touched is-pristine av-valid form-control']")
    public WebElement tarihSaatButonu;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButonu;
}


