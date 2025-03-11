package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburguer_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_linktext = "Sign In Portal";
    public static String onlineProducts_link_linktext = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburguer_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_linktext)).click();
    }

    public static void click_onlineProducts_link() throws InterruptedException {
        Thread.sleep((2000));
        driver.findElement(By.linkText(onlineProducts_link_linktext)).click();
    }
}
