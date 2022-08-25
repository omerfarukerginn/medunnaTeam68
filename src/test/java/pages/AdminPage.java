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
    @FindBy(xpath = "//(//div[4]//div[1])[2]")
    public List<WebElement> physicianTablosu;
    @FindBy(xpath = "//*[@href='/physician/new']")
    public WebElement createPhysicianButonu;
    @FindBy(xpath = "//*[@name='searchSSN']") // PHYSICIAN LOCATE LERI
    public WebElement createPhysicianSsnKutusu;
    @FindBy(xpath = "//*[@name='useSSNSearch']")
    public WebElement createPhysicianCheckbox;
    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement createPhysicianSearch;


    @FindBy(xpath = "//*[@class='Toastify__toast-body']") // YESIL ONAY KUTUSU tum ASSERT onay ISLEMI ICIN calisir
    public WebElement createPhysicianOnayKutusu;


    @FindBy(xpath = "//*[@href='/physician/2051/edit?page=1&sort=id,asc']")
    public WebElement physicianEdit;
    @FindBy(xpath = "//*[@id='physician-id']")
    public WebElement physicianEditIdKutusu;
    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement physicianEditFirstNameKutusu;
    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement physicianEditLastNameKutusu;
    @FindBy(xpath = "//*[@name='birthDate']")
    public WebElement physicianEditBirthDateKutusu;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement physicianEditSaveButonu;
    @FindBy(xpath = "//*[@name='speciality']")
    public WebElement physicianEditSpeKutusu;
    @FindBy(xpath = "//*[@id='file_image']")
    public WebElement physicianEditDossyaSecButonu;

    @FindBy(xpath = "///*[@class='Toastify__toast-body']")
    public WebElement physicianEditImageOnayi;

    @FindBy(xpath = "//*[@name='examFee']")
    public WebElement physicianEditFeeKutusu;
    @FindBy(xpath = "//*[@name='user.id']")
    public WebElement physicianEditUserKutusu;
    @FindBy(xpath = "//*[@href='/physician/2051/delete?page=1&sort=id,asc']")
    public WebElement physicianDeleteButonu_1;
    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement physicianDeleteButonu_2;


    // NAIL 311-410 - BITIS NOKTASI
    //Ebru 411-510 arasi
    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement administration;

    @FindBy(xpath = "(//div[@role='menu'])[2]")
    public WebElement userManagement;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")// 20 tane var, 19.siradakini alirsin
    public List<WebElement> viewButonu;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']") //fidan@gmail.com
    public List<WebElement> editButonu;

    @FindBy(xpath = "//dd[2]") //firstName icin getTest yapilir, assert edilir
    public WebElement firstName;

    @FindBy(xpath = "//dd[3]") //lastName icin getTest yapilir, assert edilir
    public WebElement lastName;

    @FindBy(xpath = "//dd[4]") //email icin getTest yapilir, assert edilir
    public WebElement email;

    @FindBy(xpath = "//dd[6]") //email icin getTest yapilir, assert edilir
    public WebElement createdBy;







































































































































































































































































































































































































































































































































































































// US19 location


    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement staffButon;

    @FindBy(xpath = "//*[text()='Create a new Staff']")
    public WebElement CreateANewButonu;

    @FindBy(xpath = "//*[@name='useSSNSearch']")
    public WebElement userSearchBox;

    @FindBy(xpath = "//input[@name='searchSSN']")
    public WebElement SSNBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement SearchUserButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement StaffEditButton;

    @FindBy(xpath = "//input[@id='staff-firstName']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='staff-lastName']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement BirthDate;

    @FindBy(xpath = "//input[@id='staff-phone']")
    public WebElement Phone;

    @FindBy(xpath = "//select[@id='staff-gender']")
    public WebElement Gender;

    @FindBy(xpath = "//select[@id='staff-bloodGroup']")
    public WebElement BloodGroup;

    @FindBy(xpath = "//input[@id='staff-adress']")
    public WebElement Adress;

    @FindBy(xpath = "//input[@id='staff-description']")
    public WebElement Description;

    @FindBy(xpath = "//select[@id='staff-user']")
    public WebElement User;

    @FindBy(xpath = "//select[@id='staff-country']")
    public WebElement Country;

    @FindBy(xpath = "//select[@id='staff-cstate']")
    public WebElement StateCity;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement SaveButton2;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement ViewButton;

    @FindBy(xpath = " //h2")
    public WebElement staffGorunurluk;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement SnnIleStaffAramaOnayi;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement StaffBilgilerinKaydedilmeOnayi;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container")
    public WebElement StaffBilgilerinDegistirilmeOnayi;



    @FindBy(xpath = "//button/span[text()='Delete']")
    public WebElement deleteButtonFromAlert;

    // --> Create Staff
    @FindBy(xpath = "//a/span[text()='Register']")
    public WebElement accountRegisterButton;
    @FindBy(name = "ssn")
    public WebElement registrationSsn;
    @FindBy(name = "firstName")
    public WebElement registrationFirstname;
    @FindBy(name = "lastName")
    public WebElement registrationLastname;
    @FindBy(name = "username")
    public WebElement registrationUsername;
    @FindBy(name = "email")
    public WebElement registrationEmail;
    @FindBy(name = "firstPassword")
    public WebElement registrationNewPassword;
    @FindBy(name = "secondPassword")
    public WebElement registrationConfirmPassword;
    @FindBy(xpath = "//div/div[2]/div/p")   //"//div/div/div/div[2]/div/p")
    public WebElement pageDowntoRegister;
    @FindBy(id = "register-submit")
    public WebElement registrationRegisterButton;

    //populated Staff Informations  = staff check

    @FindBy(xpath ="//tbody/tr/td[1]/a")
    public WebElement firststaffIDCheck;
    @FindBy(xpath ="//span[text()='ID']/../../th[11]/span[text()='Created Date']")      //"//thead/tr/th[11]/span[text()='Created Date']")        //"//table/thead/tr/th[11]/span[text()=\'Created Date\']")
    public WebElement staffCeratedDate;
    @FindBy(xpath = "//h2/span[text()='Staff']/../b")          //"//div/h2/b[text()]")    //"//body/div/div/div/div[4]/div/div/div/div/div/h2/b")
    public WebElement staffPageIDCheck;
    @FindBy(xpath = "//tbody/tr[1]/td[15]/div/a[2]")
    public WebElement staffEditButton;
    @FindBy(id = "save-entity")
    public WebElement staffEditSaveButton;
    @FindBy(xpath = "//tbody/tr[1]/td[15]/div/a[3]")
    public WebElement staffDeleteButton;
    @FindBy(xpath = "(//button[@id='jhi-confirm-delete-staff'])/span[text()='Delete']")
    public WebElement staffDeleteAlertDelete;

    // delete from Administration
    @FindBy(xpath = "//thead/tr[1]/th[8]/span")
    public WebElement administrationCreatedDateColumn;
    @FindBy(xpath = "//td[@class='text-right']/div/a[3]")
    public WebElement administrationUserDeleteButton;


    // TOAST Containers
    @FindBy(xpath = "//div[contains(text(),'created')]")
    public WebElement createdToastContainer;
    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    public WebElement deletedToastContainer;
    @FindBy(xpath = "//div[contains(text(),'found')]")
    public WebElement foundToastContainer;
    @FindBy(xpath = "//div[contains(text(),'updated')]")
    public WebElement updatedToastContainer;

}


