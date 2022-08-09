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

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement humanButton;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement singInButtonu;

    @FindBy(xpath = "(//input[@name='username'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement girisSonrasiSingIn;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointmentsButton;

   @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy (xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy (xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTimeButton;

    @FindBy (xpath = "//*[text()='End DateTime']")
    public WebElement endDateTimeButton;

    @FindBy (xpath = "//*[text()='Status']")
    public WebElement statusButton;





































































































    @FindBy(xpath = "//*[text()='Welcome to MEDUNNA']")
    public WebElement welcomeToMedunnaYazisi;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement hastaBilalEditButonu;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestATestButonu;

    @FindBy(xpath = "//tr//td[2]") // hangi sutunda oldugunu buldum
    public List<WebElement> testIsimListesi;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> testSecmeButonuListesi;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[text()='A new Test is created with identifier 165847']")
    public WebElement kayitSonrasiGorunurluk;


















































































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


















}



