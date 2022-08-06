package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    //public static void main(String[] args) {
    //    System.out.println("Arkadaslar main kismi github'a gonderirken problem yasamamak icin eklenmistir, silebilirsiniz");
    //}

    public  LoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement singIn;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='rememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@href='/account/reset/request']")
    public WebElement resetPassword;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInButton;




}
