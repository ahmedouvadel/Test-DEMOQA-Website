package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {
    WebDriver driver;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "userNumber")
    WebElement mobileNumber;

    @FindBy(id = "gender-radio-1")
    WebElement genderMale;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirth;

    @FindBy(id = "subjectsInput")
    WebElement subjects;

    @FindBy(id = "hobbies-checkbox-1")
    WebElement hobbiesSports;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void enterEmail(String mail) {
        email.sendKeys(mail);
    }

    public void enterMobileNumber(String mobile) {
        mobileNumber.sendKeys(mobile);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            genderMale.click();
        }
    }

    public void selectDateOfBirth(String dob) {
        dateOfBirth.sendKeys(dob);
    }

    public void enterSubjects(String subject) {
        subjects.sendKeys(subject);
    }

    public void selectHobbies(String hobbies) {
        if (hobbies.equalsIgnoreCase("Sports")) {
            hobbiesSports.click();
        }
    }

    public void uploadPicture(String filePath) {
        uploadPicture.sendKeys(filePath);
    }

    public void enterCurrentAddress(String address) {
        currentAddress.sendKeys(address);
    }

    public void clickSubmit() {
        submitButton.click();
    }
}
