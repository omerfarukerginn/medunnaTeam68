package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
   /*
   @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy (xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    */






































}
