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





































































































































































































    // NAIL 311-410 - BASLAMA NOKTASI

    @FindBy(xpath = "(//*[@href='/physician'])[1]")
    public WebElement physicianSekmesi;
    @FindBy(xpath = "//*[text()='Physicians']") //"//(//div[4]//div[1])[2]//h2]")
    public WebElement physicianBaslik;
    @FindBy (xpath = "//(//div[4]//div[1])[2]")
    public List<WebElement> physicianTablosu;
    @FindBy (xpath = "//*[@href='/physician/new']")
    public WebElement createPhysicianButonu;
    @FindBy (xpath = "//*[@name='searchSSN']") // PHYSICIAN LOCATE LERI
    public WebElement createPhysicianSsnKutusu;
    @FindBy (xpath = "//*[@name='useSSNSearch']")
    public WebElement createPhysicianCheckbox;
    @FindBy (xpath = "//*[@class='btn btn-secondary']")
    public WebElement createPhysicianSearch;


    @FindBy (xpath = "//*[@class='Toastify__toast-body']") // YESIL ONAY KUTUSU tum ASSERT onay ISLEMI ICIN calisir
    public WebElement createPhysicianOnayKutusu;


    @FindBy (xpath = "//*[@href='/physician/2051/edit?page=1&sort=id,asc']")
    public WebElement physicianEdit;
    @FindBy (xpath = "//*[@id='physician-id']")
    public WebElement physicianEditIdKutusu;
    @FindBy (xpath = "//*[@name='firstName']")
    public WebElement physicianEditFirstNameKutusu;
    @FindBy (xpath = "//*[@name='lastName']")
    public WebElement physicianEditLastNameKutusu;
    @FindBy (xpath = "//*[@name='birthDate']")
    public WebElement physicianEditBirthDateKutusu;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement physicianEditSaveButonu;
    @FindBy (xpath = "//*[@name='speciality']")
    public WebElement physicianEditSpeKutusu;
    @FindBy (xpath = "//*[@id='file_image']")
    public WebElement physicianEditDossyaSecButonu;

    @FindBy (xpath = "///*[@class='Toastify__toast-body']")
    public WebElement physicianEditImageOnayi;

    @FindBy(xpath = "//*[@name='examFee']")
    public WebElement physicianEditFeeKutusu;
    @FindBy (xpath = "//*[@name='user.id']")
    public WebElement physicianEditUserKutusu;
    @FindBy (xpath = "//*[@href='/physician/2051/delete?page=1&sort=id,asc']")
    public WebElement physicianDeleteButonu_1;
    @FindBy (xpath = "//*[@class='btn btn-danger']")
    public WebElement physicianDeleteButonu_2;


































































    // NAIL 311-410 - BITIS NOKTASI
    //Ebru 411-510 arasi
    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement administration;

    @FindBy (xpath="(//div[@role='menu'])[2]")
    public WebElement userManagement;

    @FindBy (xpath="//a[@class='btn btn-info btn-sm']")// 20 tane var, 19.siradakini alirsin
    public List<WebElement> viewButonu;

    @FindBy (xpath = "//dd[2]") //firstName icin getTest yapilir, assert edilir
    public WebElement firstName;

    @FindBy (xpath = "//dd[3]") //lastName icin getTest yapilir, assert edilir
    public WebElement lastName;

    @FindBy (xpath = "//dd[4]") //email icin getTest yapilir, assert edilir
    public WebElement email;

    @FindBy (xpath = "//dd[6]") //email icin getTest yapilir, assert edilir
    public WebElement createdBy;

    @FindBy (xpath="//a[@class='btn btn-primary btn-sm']") //fidan@gmail.com
    public List<WebElement> editButonu;

    @FindBy (xpath="//input[@name='activated']")
    public WebElement activeButonu;
    @FindBy (xpath="//select[@id='authorities']")
    public WebElement kullaniciProfilleri;
    @FindBy (xpath="(//li[@class='page-item'])[6]")
    public WebElement sonSayfayaGoturenOk;

    @FindBy (xpath="//a[@class='btn btn-danger btn-sm']")
    public WebElement silmeButonu;

    @FindBy (xpath="//div[@role='alert']")
    public WebElement olumluAlertBilgisi;












































































































































































































































































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


