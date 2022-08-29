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

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> tumUlkeIsimleri;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;

    //@FindBy(xpath = "//*[text()='Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!'")
    //public WebElement kirmiziUyariYazisi;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-country']")
    public WebElement ikiciDeleteButonu;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement kirmiziUyariYazisi;

    @FindBy(xpath = "//*[@class='modal-content']")
    public WebElement deleteOperationYazisi;




































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

    @FindBy(xpath = "(//th[@class='hand'])[3]")
    public WebElement kacTurRoomTypeButonu;

    @FindBy(xpath = "//*[text()='TWIN']")
    public WebElement twinnType;

    @FindBy(xpath = "//*[text()='DAYCARE']")
    public WebElement daycareType;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement idRoom;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButonuOnAlti;


    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']")
    public WebElement deleteOnAltiUSIkinci;

    @FindBy(xpath = "(//*[text()='Delete'])[6]")
    public WebElement deleteDilek;








































    //US_017 baslama
    @FindBy(xpath = "//span[text()='Test Item']")  //a[@class='dropdown-item active']
    public WebElement testItemButton;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewTestItemButton;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement testItemNameBox;
    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement testItemDescriptionBox;
    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement testItemPriceBox;
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']']")
    public WebElement testItemDefaultValMinBox;
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement testItemDefaultValMaxBox;
    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement testItemCreatedDateBox;
    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement testItemSaveButton;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement onayYazisiCreate;
    @FindBy(xpath = "(//*[text()='Edit'])[13]")
    public List<WebElement> testItemEditButton; //(//*[@class='btn btn-primary btn-sm'])[16]
    @FindBy(xpath = "(//li[@class='page-item'])[5]")
    public WebElement sayfaGecme49; //(//*[@class='page-link'])[6]  //a[text()='49'] (//li[@class='page-item'])[last()]
    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[13]")
    public WebElement testItemId;
    @FindBy(xpath = "//thead//tr[1]//th[1]") //thead//tr[1]//th[1]  //tr//th[1]
    public List<WebElement> tumTestItemId;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement testItemSaveButton2;
    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[12]")
    public List<WebElement> testItemViewButton;
    @FindBy(xpath = "//dl//dt[1]")
    public WebElement testItemsName;
    @FindBy(xpath = "//dl//dt[2]")
    public WebElement testItemsDescription;
    @FindBy(xpath = "//dl//dt[3]")
    public WebElement testItemsPrice;
    @FindBy(xpath = "//dl//dt[4]")
    public WebElement testItemsDefaultMnValue;
    @FindBy(xpath = "//dl//dt[5]")
    public WebElement testItemsDefaultMxValue;
    @FindBy(xpath = "//dl//dt[6]")
    public WebElement testItemsCreatedDate;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[12]")
    public WebElement testItemsDeleteButton;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement testItemsDeleteButton2;


















































//US_017 bitis





















































    // NAIL 311-410 - BASLAMA NOKTASI

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

    @FindBy(xpath = "//dd[2]") //firstName icin getTest yapilir, assert edilir

    public WebElement firstName;

    @FindBy(xpath = "//dd[3]") //lastName icin getTest yapilir, assert edilir
    public WebElement lastName;

    @FindBy(xpath = "//dd[4]") //email icin getTest yapilir, assert edilir
    public WebElement email;

    @FindBy(xpath = "//dd[6]") //email icin getTest yapilir, assert edilir
    public WebElement createdBy;

    @FindBy (xpath="//a[@class='btn btn-primary btn-sm']") //fidan@gmail.com
    public List<WebElement> editButonu;

    @FindBy (xpath="//input[@name='activated']")
    public WebElement activeButonu;
    @FindBy (xpath="//select[@id='authorities']")
    public WebElement kullaniciProfilleri;

    @FindBy (xpath="//div[@role='alert']")
    public WebElement olumluAlertBilgisi;

    @FindBy (xpath="(//li[@class='page-item'])[5]")
    public WebElement kullanicininOlduguSafya;

    @FindBy (xpath="(//*[text()='Delete'])[12]") //12.user'i silme
    public WebElement onIkinciUseriSilmeButonu;





























































    //Omer 511-610 arasi

    @FindBy(xpath = "//a[@href='/c-message'][1]")
    public WebElement itemsTitlesMessagesButton;



    //Omer 511-610 arasi

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm'][1]")
    public WebElement messagesPageIlkViewButton;


    @FindBy(xpath = "//span[@id='name']")
    public WebElement messagesViewNameWebElement;

    @FindBy(xpath = "//span[@id='email']")
    public WebElement messagesViewEmailWebElement;

    @FindBy(xpath = "//span[@id='message']")
    public WebElement messagesViewMessageWebElement;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewMessageButton;

    @FindBy(xpath = "//input[@id='c-message-name']")
    public WebElement nameForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-email']")
    public WebElement emailForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-subject']")
    public WebElement subjectForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement messageForNewMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement messagesPageIlkEditButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement messagesPageIlkDeleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement messagesPopUpDeleteButton;





























































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

    @FindBy (xpath="//a[@class='btn btn-primary btn-sm']")
    public WebElement patientEditButton;

    @FindBy (xpath="//*[@id=\"patient-firstName\"]")
    public WebElement patientEditFirstNameBox;

    @FindBy (xpath="//*[@id=\"patient-lastName\"]")
    public WebElement patientEditLastNameBox;

    @FindBy (xpath="//*[@id=\"patient-birthDate\"]")
    public WebElement patientEditBirthDateBox;

    @FindBy (xpath="//*[@id=\"email\"]")
    public WebElement patientEditEmailBox;

    @FindBy (xpath="//*[@id=\"patient-phone\"]")
    public WebElement patientEditPhoneBox;

    @FindBy (xpath="//*[@id=\"patient-gender\"]")
    public WebElement patientEditGenderBox;

    @FindBy (xpath="//*[@id=\"patient-bloodGroup\"]")
    public WebElement patientEditBloodGroupBox;

    @FindBy (xpath="//*[@id=\"patient-adress\"]")
    public WebElement patientEditAdressBox;

    @FindBy (xpath="//*[@id=\"patient-description\"]")
    public WebElement patientEditDescriptionBox;

    @FindBy (xpath="//*[@id=\"patient-user\"]")
    public WebElement patientEditUserBox;

    @FindBy (xpath="//*[@id=\"patient-country\"]")
    public WebElement patientEditCountryBox;

    @FindBy (xpath="//*[@id=\"patient-cstate\"]")
    public WebElement patientEditStateBox;

    @FindBy (xpath="//button[@id='save-entity']")
    public WebElement patientEditSaveButton;

    @FindBy (xpath="//div[@class='Toastify__toast-body']")
    public WebElement patientEditBasariliYazisi;

    @FindBy (xpath="//span[text()='Appointment']")
    public WebElement appointmentDDMButton;

    @FindBy (xpath="(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement appointmentEditButton;

    @FindBy (xpath="//*[@id='appointment-physician']")
    public WebElement appointmentDoktorAtamaDDM;

    @FindBy (xpath="//*[@id='save-entity']")
    public WebElement appointmentSaveButton;











































// US19 location


































































































































































































































































































    // US19 location


   @FindBy (xpath="(//a[@class='btn btn-danger btn-sm'])[1]")

    public WebElement appointmentDoktorAtamasiBasariliYazisi;

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




























































































































































































































































































    // Administration

    @FindBy(xpath = "(//*[text()='Delete'])[17]")
    public WebElement AdministorDeletedButton;

    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement KayitliStaffSayfasi;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement AdministorViewdButton;

    @FindBy(xpath = "(//*[text()='Edit'])[17]")
    public WebElement AdministorEditdButton;

    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement AdministorSayfaAtlamadButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement  AdministorDeletedButton2;













}







