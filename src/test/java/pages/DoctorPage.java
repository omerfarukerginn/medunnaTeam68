package pages;


import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;




public class DoctorPage {
    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
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

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointmentsButton;

    @FindBy(xpath = "//*[text()='Appointments']")
    public WebElement appointmentsPage;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTimeButton;

    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateTimeButton;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusButton;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='The Appointment is updated with identifier 160060']")
    public WebElement appointmentBasariliYazisi;


}



