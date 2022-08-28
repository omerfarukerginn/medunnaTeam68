package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/contact']")
    public WebElement contactButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactNameKutusu;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement contactEmailKutusu;
    @FindBy(xpath = "//*[@id='subject']")
    public WebElement contactSubjectKutusu;
    @FindBy(xpath = "//*[@id='message']")
    public WebElement contactMessageKutusu;
    @FindBy(xpath = "//button[@type='submit']")  //*[@id='register-submit']
    public WebElement sendButton;
    @FindBy(xpath = "//span[*='Your message has been received']")
    public WebElement dogrulamaYazisi;
    //div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']
    //div[@class='Toastify__toast-body']










}
