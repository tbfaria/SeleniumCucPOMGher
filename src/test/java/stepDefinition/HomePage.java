package stepDefinition;
import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class HomePage {
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_Login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @Given("User navigates to Online product page")
    public void userNavigatesToOnlineProductPage() throws InterruptedException {
        click_hamburger_menu();
        click_onlineProducts_link();
    }
}
