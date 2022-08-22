package pages;


import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;




public class DoctorPage {
    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPagesButton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myAppointmentsButton;

    @FindBy(xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTimeButton;

    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateTimeButton;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusButton;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesisKutusu;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmentKutusu;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosisKutusu;

    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescriptionKutusu;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionKutusu;

    @FindBy(xpath = "//button [@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement appointmentBasariliYazisi;

    @FindBy(xpath = "//*[text()='Physician']")
    public WebElement physicanBolumu;

    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patientBolumu;

    @FindBy(xpath = "//th//*[text()='Status']")
    public WebElement ikinicStatusBolumu;

    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement zorunluAlanUyariYazisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement amensisUyariYazisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement treatmentUyariYazisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement diagnosisUyariYazisi;






























































    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointmentsButonu;

    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement welcomeToMedunnaYazisi;

    @FindBy(xpath = " //*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr[1]/td[13]/div/a")
    public WebElement hastaBilalEditButonu;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestATestButonu;

    @FindBy(xpath = "//tr//td[2]") // hangi sutunda oldugunu buldum
    public List<WebElement> testIsimListesi;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> testSecmeButonuListesi;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultsButonu;

    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResultsButonu;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idGorunurluk;

    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameGorunurluk;

    @FindBy(xpath = "//*[text()='Default Min. Value']")
    public WebElement defaultMinValueGorunurluk;

    @FindBy(xpath = "//*[text()='Default Max. Value']")
    public WebElement defaultMaxValueGorunurluk;

    @FindBy(xpath = "//*[text()='Test']")
    public WebElement testGorunurluk;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement descriptionGorunurluk;

    @FindBy(xpath = "//*[text()='Date']")
    public WebElement dateGorunurluk;

    @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInPatientButonu;

    //*[@id="save-entity"]


















































































//US014 location

    @FindBy(xpath = "//*[.='My Inpatients']")
    public WebElement myInpatientsButton;

    @FindBy(xpath = "(//*[.='In Patients'])[2]")
    public WebElement inPatientsText;

    @FindBy(xpath = "(//tbody/tr/td[1])[1]")
    public WebElement inPatientsID;

    @FindBy(xpath = "(//tbody/tr/td[2])[1]")
    public WebElement inPatientsStartDate;

    @FindBy(xpath = "(//tbody/tr/td[3])[1]")
    public WebElement inPatientsEndDate;

    @FindBy(xpath = "(//tbody/tr/td[4])[1]")
    public WebElement inPatientsStatus;

    @FindBy(xpath = "(//tbody/tr/td[5])[1]")
    public WebElement inPatientsDescription;

    @FindBy(xpath = "(//tbody/tr/td[6])[1]")
    public WebElement inPatientsCreatedDate;

    @FindBy(xpath = "(//tbody/tr/td[7])[1]")
    public WebElement inPatientsRoom;

    @FindBy(xpath = "(//tbody/tr/td[8])[1]")
    public WebElement inPatientsAppointment;

    @FindBy(xpath = "(//tbody/tr/td[9])[1]")
    public WebElement inPatientsPatient;

    @FindBy(css = ".btn-primary")
    public WebElement inPatientsEditButton;

    @FindBy(xpath= "(//*[text()='Edit'])[2]")
    public WebElement inPatientsEditButton2;

    @FindBy(xpath = "(//*[.='Create or edit a In Patient'])[4]")
    public WebElement inPatientEditPageText;

    @FindBy(xpath = "//input[@id='in-patient-id']")
    public WebElement editInPatientID;

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement editInPatientStartDate;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement editInPatientEndDate;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement editInPatientDescription;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement editInPatientCreatedDate;

    @FindBy(xpath = "//select[@id='in-patient-appointment']")
    public WebElement editInPatientAppointment;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement editInPatientStatusDropDown;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement editInPatientRoomDropDown;

    @FindBy(xpath = "//select[@id='in-patient-patient']")
    public WebElement editInPatientPatient;

    @FindBy(xpath = "//button [@type='submit']")
    public WebElement editInPatientSaveButton;

    @FindBy(xpath = "//*[.='InPatient status can not be changed with this type of status']")
    public WebElement editInPatientEkranaCikanMesaj;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container'")
    public WebElement editInPatientEkranaCikanMesajj;


















}



