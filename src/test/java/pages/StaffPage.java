package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffPage {

    public StaffPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement insanFiguru;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement ilkSingin;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singinButton;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement dropDownSearchPatientButton ;

    @FindBy(xpath = "//span[text()='Patients']")
    public WebElement patientsYaziElementi;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSsnSearchTextBox;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButton;

    // Hasta bilgileri Edit Elementleri

    @FindBy(xpath = "//input[@name='id']")
    public WebElement idTextBox;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='patient-lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='patient-birthDate']")
    public WebElement birthDateTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='patient-phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//select[@id='patient-gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement userDropDown;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//select[@id='patient-cstate']")
    public WebElement stateCityTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement guncellendiYaziElementi;

    @FindBy(xpath = "//td[text()='668-83-4231']")
    public WebElement ssnHastaBilgisiElementi;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement hataYaziElementi;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement silmeIslemiBasariliYazisi;































































































































































    // NAIL 255-355

    @FindBy(xpath = "(//tr)[2]//td[2]")
    public WebElement hastaSsnOnayi;
    @FindBy (xpath = "//*[@href='/patient-appointments/16094']")
    public WebElement showAppointButonu;
    @FindBy (xpath = "//*[@href='/tests/appointment/16419']")
    public WebElement showTestButonu;
    @FindBy (xpath = "//*[@href='/testresult/test/212461']")
    public WebElement viewResultsButonu;
    @FindBy (xpath = "//*[text()='Test Results']")
    public WebElement testResultBaslikYazisi;
    @FindBy (xpath = "//*[@href='/c-test-result-update/212831']")
    public WebElement resultEditButonu;
    @FindBy (xpath = "(//*[@class='form-group'])[1]")
    public WebElement resultEditId;
    @FindBy (xpath ="(//*[@class='form-group'])[2]")
    public WebElement resultEditDate;
    @FindBy (xpath ="//*[@name='result']")
    public WebElement resultEditResultKutusu;
    @FindBy (xpath ="(//*[@name='description'])[2]")
    public WebElement resultEditDescriptionKutusu;
    @FindBy (xpath ="(//*[@class='form-group'])[7]")
    public WebElement resultEditCreatesDate;
    @FindBy (xpath ="(//*[@class='form-group'])[9]")
    public WebElement resultEditTest;





















































































    // NAIL 255-355

}
