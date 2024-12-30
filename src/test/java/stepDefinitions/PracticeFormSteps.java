package stepDefinitions;


import Pages.PracticeFormPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PracticeFormSteps {

    WebDriver driver;
    PracticeFormPage practiceFormPage;

    @Given("l'utilisateur est sur la page du formulaire d'inscription")
    public void user_is_on_practice_form_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage = new PracticeFormPage(driver);
    }

    @When("il saisit les informations personnelles {string}, {string}, {string}, {string}")
    public void user_fills_personal_information(String firstName, String lastName, String email, String mobile) {
        practiceFormPage.enterFirstName(firstName);
        practiceFormPage.enterLastName(lastName);
        practiceFormPage.enterEmail(email);
        practiceFormPage.enterMobileNumber(mobile);
    }

    @And("sélectionne le genre {string} et la date de naissance {string}")
    public void user_selects_gender_and_dob(String gender, String dob) {
        practiceFormPage.selectGender(gender);
        practiceFormPage.selectDateOfBirth(dob);
    }

    @And("remplit les matières {string} et sélectionne les hobbies {string}")
    public void user_fills_subjects_and_hobbies(String subjects, String hobbies) {
        practiceFormPage.enterSubjects(subjects);
        practiceFormPage.selectHobbies(hobbies);
    }

    @And("télécharge une photo {string}")
    public void user_uploads_picture(String filePath) {
        practiceFormPage.uploadPicture(filePath);
    }

    @And("saisit l'adresse actuelle {string}")
    public void user_enters_current_address(String address) {
        practiceFormPage.enterCurrentAddress(address);
    }

    @And("soumet le formulaire")
    public void user_submits_the_form() {
        practiceFormPage.clickSubmit();
    }

    @Then("un message de confirmation s'affiche avec les informations saisies")
    public void confirmation_message_is_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        assert confirmationModal.isDisplayed();

        driver.quit();
    }
}
