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
    public WebElement IdTextBox;

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
    public WebElement genderTextBox;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroupTextBox;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement userTextBox;

    @FindBy(xpath = "//select[@id='patient-country']")
    public WebElement countryTextBox;

    @FindBy(xpath = "//select[@id='patient-cstate']")
    public WebElement stateCityTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement guncellendiYaziElementi;































}
