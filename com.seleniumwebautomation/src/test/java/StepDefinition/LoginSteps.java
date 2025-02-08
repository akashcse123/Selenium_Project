package StepDefinition;



import base.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import com.seleniumwebautomation.LoginPage;

public class LoginSteps extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        setup();
        driver = super.driver;
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) throws InterruptedException {
    	Thread.sleep(4000);
    	 loginPage.clickOnLoginButton();
    	 
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }

    @And("clicks the login button")
    public void user_clicks_login() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the home page")
    public void user_redirected_to_home_page() {
        // Add assertion to verify successful login
        teardown();
    }
}
