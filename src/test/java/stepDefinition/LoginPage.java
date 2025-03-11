package stepDefinition;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the log in details")
    public void user_enters_logIn_details() throws InterruptedException {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();
    }

    @When("User clicks the registration button")
    public void user_clicks_the_registration_button() throws InterruptedException {
        click_registration_btn();
    }
}
