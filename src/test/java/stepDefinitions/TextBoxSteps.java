package stepDefinitions;
import Pages.TextBoxPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TextBoxSteps {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @Given("l'utilisateur est sur la page Text Box")
    public void user_is_on_text_box_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        textBoxPage = new TextBoxPage(driver);
    }

    @When("il saisit le nom {string}, l'email {string}, l'adresse actuelle {string} et l'adresse permanente {string}")
    public void user_fills_the_form(String name, String email, String currentAddress, String permanentAddress) {
        textBoxPage.enterFullName(name);
        textBoxPage.enterEmail(email);
        textBoxPage.enterCurrentAddress(currentAddress);
        textBoxPage.enterPermanentAddress(permanentAddress);
    }

    @And("clique sur le bouton Submit")
    public void user_clicks_submit() {
        textBoxPage.clickSubmit();
    }

    @Then("les informations saisies sont affichées correctement")
    public void verify_displayed_information() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement output = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output")));

        WebElement nameOutput = output.findElement(By.id("name"));
        WebElement emailOutput = output.findElement(By.id("email"));

        assert nameOutput.getText().contains("Name:");
        assert emailOutput.getText().contains("Email:");

        driver.quit();
    }
}
