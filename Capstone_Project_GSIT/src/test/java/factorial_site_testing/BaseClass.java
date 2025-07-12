package factorial_site_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass
	//@Parameters("browser")
    public void openApp() {
        //if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://qainterview.pythonanywhere.com/");
        
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
            driver.quit();
    }
}