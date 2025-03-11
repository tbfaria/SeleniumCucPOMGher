package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath = "//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath = "//*[@id=\"NewRegistration\"]";

    public static void sendKeys_username() throws InterruptedException{
        driver.findElement(By.id(username_text_id)).sendKeys("doe@gmail.com");
    }

    public static void sendKeys_password() throws InterruptedException{
        driver.findElement(By.id(password_text_id)).sendKeys("hello");
    }

    public static void click_login_btn() throws InterruptedException{
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_registration_btn() throws InterruptedException {
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }
}
