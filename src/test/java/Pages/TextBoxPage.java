package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebDriver driver;

    @FindBy(id = "userName")
    WebElement fullName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String name) {
        fullName.sendKeys(name);
    }

    public void enterEmail(String emailAddress) {
        email.sendKeys(emailAddress);
    }

    public void enterCurrentAddress(String address) {
        currentAddress.sendKeys(address);
    }

    public void enterPermanentAddress(String address) {
        permanentAddress.sendKeys(address);
    }

    public void clickSubmit() {
        submitButton.click();
    }
}
