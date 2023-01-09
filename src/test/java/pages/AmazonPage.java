package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // amazondaki arama kutusunu locate edelim
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//select[@title='Search in']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement dropDownMenu;


    @FindBy(xpath = "//span[@class='icp-nav-link-inner']")
    public WebElement languageSection;

    @FindBy(xpath = "(//a[@href='/customer-preferences/edit?ref=icp_cop_flyout_change?preferencesReturnUrl=%2F'])[1]")
    public WebElement changeButtonChangeLanguage;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement selectCurrencyDrop;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement saveChangesButton;

    @FindBy (xpath = "(//a[@class='icp-button'])[2]")
    public WebElement usdButton;
}