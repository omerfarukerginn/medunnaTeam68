package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // US_28 location

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement humanButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement itemsTitlesButonu;

    @FindBy(xpath = "//a[@href='/country']")
    public WebElement countryButonu;

    @FindBy(xpath = "//*[text()='Create a new Country']")
    public WebElement createCountryButonu;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement createCountryNameButonu;

    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement tarihSaatButonu;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[text()='State/City']")
    public WebElement stateCityButonu;

    @FindBy(xpath = "//*[text()='Create a new State/City']")
    public WebElement createStateCityButonu;

    @FindBy(xpath = "//*[@id='c-state-name']")
    public WebElement createStateCityNameButonu;

    @FindBy(xpath = "//*[@id='c-state-state']")
    public WebElement stateCitySecmeButonu;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> tumUlkeIsimleri;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;

    //@FindBy(xpath = "//*[text()='Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!'")
    //public WebElement kirmiziUyariYazisi;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-country']")
    public WebElement ikiciDeleteButonu;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement kirmiziUyariYazisi;

    @FindBy(xpath = "//*[@class='modal-content']")
    public WebElement deleteOperationYazisi;


    //Dilek
    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement roomButton;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement CreateANewRoomButton;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumberKutusu;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomTypeKututsu;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement priceKutusu;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement basariliIslemYesilMesajKutusu;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement isRequiredUyariYazisi;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement statusKutusu;

    @FindBy(xpath = "(//li[@class='page-item'])[last()]")
    public WebElement sonSayfaninOku;

    @FindBy(xpath = "//*[text()='Full']")
    public WebElement fullYazisi;

    @FindBy(xpath = "//*[text()='Available']")
    public WebElement availableYazisi;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionKutusu;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateKutusu;

    @FindBy(xpath = "(//th[@class='hand'])[3]")
    public WebElement kacTurRoomTypeButonu;

    @FindBy(xpath = "//*[text()='TWIN']")
    public WebElement twinnType;

    @FindBy(xpath = "//*[text()='DAYCARE']")
    public WebElement daycareType;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement idRoom;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButonuOnAlti;


    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']")
    public WebElement deleteOnAltiUSIkinci;

    @FindBy(xpath = "(//*[text()='Delete'])[6]")
    public WebElement deleteDilek;


    //US_017 baslama
    @FindBy(xpath = "//span[text()='Test Item']")  //a[@class='dropdown-item active']
    public WebElement testItemButton;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewTestItemButton;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement testItemNameBox;
    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement testItemDescriptionBox;
    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement testItemPriceBox;
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']']")
    public WebElement testItemDefaultValMinBox;
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement testItemDefaultValMaxBox;
    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement testItemCreatedDateBox;
    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement testItemSaveButton;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement onayYazisiCreate;
    @FindBy(xpath = "(//*[text()='Edit'])[13]")
    public List<WebElement> testItemEditButton; //(//*[@class='btn btn-primary btn-sm'])[16]
    @FindBy(xpath = "(//li[@class='page-item'])[5]")
    public WebElement sayfaGecme49; //(//*[@class='page-link'])[6]  //a[text()='49'] (//li[@class='page-item'])[last()]
    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[13]")
    public WebElement testItemId;
    @FindBy(xpath = "//thead//tr[1]//th[1]")
    public List<WebElement> tumTestItemId;
    @FindBy(xpath = "//*[text()='Save']")  //thead//tr[1]//th[1]  //tr//th[1]
    public WebElement testItemSaveButton2;
    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[12]")
    public List<WebElement> testItemViewButton;
    @FindBy(xpath = "//dl//dt[1]")
    public WebElement testItemsName;
    @FindBy(xpath = "//dl//dt[2]")
    public WebElement testItemsDescription;
    @FindBy(xpath = "//dl//dt[3]")
    public WebElement testItemsPrice;
    @FindBy(xpath = "//dl//dt[4]")
    public WebElement testItemsDefaultMnValue;
    @FindBy(xpath = "//dl//dt[5]")
    public WebElement testItemsDefaultMxValue;
    @FindBy(xpath = "//dl//dt[6]")
    public WebElement testItemsCreatedDate;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[12]")
    public WebElement testItemsDeleteButton;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement testItemsDeleteButton2;