package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordPage {
    public PasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/account/password']")
    public WebElement homePagePasswordButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordTextArea;

    @FindBy(name = "newPassword")
    public WebElement newPasswordTextArea;

    @FindBy(xpath = "//li[@class='point'][2]")
    public WebElement passwordStrengthLevel2;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordTextArea;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement passwordPageSaveButton;

    @FindBy(xpath = "//strong[text()='Password changed!']")
    public WebElement passwordChangedAlert;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement homePageDropdown;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);'][4]")
    public WebElement getPasswordStrengthLevel4;

}
