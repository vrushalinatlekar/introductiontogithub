package factorial_site_testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutPageLinksCountTest extends BaseClass{
	@Test
	public void checkAboutPageLinks() {
		System.out.println("Validating checkAboutPageLinks...");
	    driver.findElement(By.linkText("About")).click();
	    new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
	
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    Assert.assertTrue(links.size() > 5);
	
	    for (WebElement link : links) {
	        System.out.println(link.getText());
	    }
	}
}