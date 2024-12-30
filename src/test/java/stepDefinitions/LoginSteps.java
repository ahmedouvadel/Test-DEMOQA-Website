package stepDefinitions;


import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("l'utilisateur est sur la page de connexion")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("il saisit l'identifiant {string} et le mot de passe {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("clique sur le bouton de connexion")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("il est redirigé vers la page d'accueil")
    public void user_is_redirected_to_home_page() {
        // Vérifie la redirection (Exemple)
        assert driver.getTitle().equals("Home Page");
        driver.quit();
    }

    @Then("un message d'erreur s'affiche")
    public void error_message_is_displayed() {
        // Exemple simple de validation
        assert driver.getPageSource().contains("Identifiants incorrects");
        driver.quit();
    }
}