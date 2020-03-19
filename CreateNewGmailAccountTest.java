package AutoTest;
//* @author jelectronic
//**JUNIT5 - Selenium - Firefox - Chromium Automation Framework
import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(SeleniumExtension.class)

public class CreateNewGmailAccountTest {

    @Test
    @DisplayName("Starting FF browser maximize, clear cache, goto gmail...")        
    void testLocalFirefox(FirefoxDriver driver) {
        driver.get("https://www.gmail.com");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }

    @Test
    @DisplayName("Starting CR browser maximize, clear cache, goto gmail...")
    void testLocalChrome(ChromeDriver driver) {
        driver.get("https://www.gmail.com");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }
}
