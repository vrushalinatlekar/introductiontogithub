package factorial_site_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderTextTest extends BaseClass{
	@SuppressWarnings("deprecation")
	@Test
    public void checkPlaceholderTitleURL() {
		System.out.println("Validating checkPlaceholderTitleURL...");
        WebElement input = driver.findElement(By.id("number"));
        Assert.assertEquals(input.getAttribute("placeholder"), "Enter an integer");
        Assert.assertEquals(driver.getTitle(), "Factoriall");
        Assert.assertTrue(driver.getCurrentUrl().contains("https"));
    }
}