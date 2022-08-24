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
<<<<<<< HEAD
    // US_28 location
=======

    // US_28 location


>>>>>>> main
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

    @FindBy(xpath = "//button[@id='save-entity']")
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

    @FindBy(xpath = "//*[text()='Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!'")
    public WebElement kirmiziUyariYazisi;


















































<<<<<<< HEAD


=======
>>>>>>> main
    //Dilek
    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement roomButton;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement CreateANewRoomButton;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumberKutusu;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomTypeKututsu;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement priceKutusu;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement basariliIslemYesilMesajKutusu;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement isRequiredUyariYazisi;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement statusKutusu;

   @FindBy(xpath = "(//li[@class='page-item'])[last()]")
   public WebElement sonSayfaninOku;

    @FindBy(xpath = "//*[text()='Full']")
    public WebElement fullYazisi;

    @FindBy(xpath = "//*[text()='Available']")
    public WebElement availableYazisi;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionKutusu;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateKutusu;

    @FindBy(xpath="(//th[@class='hand'])[3]")
    public WebElement kacTurRoomTypeButonu;

    @FindBy(xpath = "//*[text()='TWIN']")
    public WebElement twinnType;

    @FindBy(xpath = "(//*[text()='Edit'])[9]")
    public WebElement olusturdugumRoomEditButonu;

    @FindBy(xpath = "//*[text()='15051987']")
    public WebElement idRoom;



































































































































































































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












































































































































<<<<<<< HEAD

=======
>>>>>>> main












































































































































































































































































































































































































































    }









































































































































































































































































































































































































































































































