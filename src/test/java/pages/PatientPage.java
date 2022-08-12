package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PatientPage {

    public  PatientPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath= "//*[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointmentButton;
    @FindBy (xpath = "//*[@id='firstName']")
    public WebElement firstNameKutusu;
    @FindBy (xpath = "//*[@name='ssn']")
    public WebElement ssnKutusu;
    @FindBy (xpath = "//*[@id='lastName']")
    public WebElement lastNameKutusu;
    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailKutusu;
    @FindBy (xpath = "//*[@id='phone']")
    public WebElement phoneKutusu;
    @FindBy (xpath = "//*[@id='appoDate']")
    public WebElement appoDateTimeKutusu;
    @FindBy (xpath = "//*[@class='col-md-12']")
    public WebElement sendAnAppoRequestButton;
    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButton;
    @FindBy (xpath="//*[@href='/account/register']")
    public WebElement birinciRegisterButton;
    @FindBy (xpath= "//*[@id='username']")
    public WebElement userNameKutusu;
    @FindBy (xpath= "//*[@id='firstPassword']")
    public WebElement newPasswordKutusu;
    @FindBy (xpath= "//*[@name='secondPassword']")
    public WebElement newPasswordConfirmKutusu;
    @FindBy (xpath= "//*[@type='submit']")
    public WebElement ikinciRegisterButton;
    @FindBy (xpath = "//*[@id='login-item']")
    public WebElement birinciSigninButton;
    @FindBy (xpath = "//*[@id='password']")
    public WebElement signinPasswordKutusu;
    @FindBy (xpath = "(//span[text()='Sign in'])[3]")
    public WebElement ikinciSigninButton;
    @FindBy (xpath = "//span[text()='MY PAGES(PATIENT)']") //li[@id='entity-menu']
    public WebElement myPagesPatientButton;
    @FindBy (xpath = "//span[text()='My Appointments']") //a[@class='dropdown-item active']
    public WebElement myAppointmentsButton;
    @FindBy (xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement bosFirstNameMesaji;
    @FindBy (xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement bosLastNameMesaji;
    @FindBy (xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement bosSSNMesaji;
    @FindBy (xpath = "(//div[text()='Your email is required.'])")
    public WebElement bosEmailMesaji;
    @FindBy (xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement bosPhoneMesaji;
    @FindBy (xpath = "(//td[text()='167139'])")
    public WebElement id;









    //bende calismayan kodlari yeniden burada olusturdum Ebru
    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy (xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement makeAnAppointmentSection;

    @FindBy (xpath="//*[contains(text(), 'Appointment registration saved!')]")
    public WebElement appointmentRegistrationSavedText; ////div[@role='alert']

    @FindBy (xpath="//input[@id='appoDate']")
    public WebElement appointmentDateSection;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement sendAnAppointmentRequestButton;


    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> gecerliTarihlerListesi;

    @FindBy (xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement appointmentDateCanNotBePaseDate;




}
