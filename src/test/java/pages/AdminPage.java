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
    @FindBy(xpath = "//*[text()='Physicians']") //"//(//div[4]//div[1])[2]//h2]")
    public WebElement physicianBaslik;
    @FindBy (xpath = "//(//div[4]//div[1])[2]")
    public List<WebElement> physicianTablosu;
    @FindBy (xpath = "//*[@href='/physician/new']")
    public WebElement createPhysicianButonu;
    @FindBy (xpath = "//*[@name='searchSSN']")
    public WebElement createSsnKutusu;
    @FindBy (xpath = "//*[@name='useSSNSearch']")
    public WebElement createCheckbox;
    @FindBy (xpath = "//*[@class='btn btn-secondary']")
    public WebElement createSearch;
    @FindBy (xpath = "//*[@class='Toastify__toast-body']")
    public WebElement createOnayKutusu;
    @FindBy (xpath = "//*[@href='/physician/2051/edit?page=1&sort=id,asc']")
    public WebElement physicianEdit;
    @FindBy (xpath = "//*[@id='physician-id']")
    public WebElement physicianIdKutusu;











































































    // NAIL BITIS NOKTASI
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
















































































































































































    // US_015 Ridvan

    @FindBy(xpath="//*[text()='Patient']")
    public WebElement patientButonuDDMenu;

    @FindBy (xpath="//a[@id='jh-create-entity']")
    public WebElement createNewPatientButton;

    @FindBy (xpath="//input[@id='patient-firstName']")
    public WebElement patientFirstNameBox;

    @FindBy (xpath="//input[@id='patient-lastName']")
    public WebElement patientLastNameBox;

    @FindBy (xpath="//input[@id='patient-birthDate']")
    public WebElement patientBirthDateBox;

    @FindBy (xpath="//input[@id='email']")
    public WebElement patientEmailBox;

    @FindBy (xpath="//input[@id='patient-phone']")
    public WebElement patientPhoneBox;

    @FindBy (xpath="//select[@id='patient-gender']")
    public WebElement patientGenderBox;

    @FindBy (xpath="//select[@id='patient-bloodGroup']")
    public WebElement patientBloodGroupBox;

    @FindBy (xpath="//input[@id='patient-adress']")
    public WebElement patientAdressBox;

    @FindBy (xpath="//textarea[@id='patient-description']")
    public WebElement patientDescriptionBox;

    @FindBy (xpath="//select[@id='patient-user']")
    public WebElement patientUserBox;

    @FindBy (xpath="//select[@id='patient-country']")
    public WebElement patientCountryBox;

    @FindBy (xpath="//select[@id='patient-cstate']")
    public WebElement patientStateBox;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement patientSaveButton;

    @FindBy (xpath="//div[contains(text(),'A new Patient is created')]")
    public WebElement patientSaveBasariliYazisi;

    @FindBy (xpath="//a[@class='btn btn-info btn-sm']")
    public WebElement patientViewButton;

    @FindBy (xpath="//div[4]//dd[1]")
    public WebElement patientViewSSN;

    @FindBy (xpath="//div[4]//dd[2]")
    public WebElement patientViewFirstName;

    @FindBy (xpath="//div[4]//dd[3]")
    public WebElement patientViewLastName;

    @FindBy (xpath="//div[4]//dd[4]")
    public WebElement patientViewBirthDate;

    @FindBy (xpath="//div[4]//dd[5]")
    public WebElement patientViewPhone;

    @FindBy (xpath="//div[4]//dd[6]")
    public WebElement patientViewGender;

    @FindBy (xpath="//div[4]//dd[7]")
    public WebElement patientViewBloodGroup;

    @FindBy (xpath="//div[4]//dd[8]")
    public WebElement patientViewAdress;

    @FindBy (xpath="//div[4]//dd[9]")
    public WebElement patientViewDescription;

    @FindBy (xpath="//div[4]//dd[10]")
    public WebElement patientViewCreatedDate;

    @FindBy (xpath="//div[4]//dd[11]")
    public WebElement patientViewUser;

    @FindBy (xpath="//div[4]//dd[12]")
    public WebElement patientViewCountry;

    @FindBy (xpath="//div[4]//dd[13]")
    public WebElement patientViewStateCity;









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


