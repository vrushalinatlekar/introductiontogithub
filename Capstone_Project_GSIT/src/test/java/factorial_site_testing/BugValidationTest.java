package factorial_site_testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BugValidationTest extends BaseClass{
	@Test
    public void privacyLinkShouldNotRedirectToTermsURL() throws Exception {
		System.out.println("Validating BugValidationTest...");
        // Click on the "Privacy" link
		Thread.sleep(5000);
		
        driver.findElement(By.linkText("Privacy")).click();

        // Wait for redirection (optional)
        Thread.sleep(2000); // Replace with WebDriverWait if needed
            
        // Capture the current URL
        String currentUrl = driver.getCurrentUrl();

        // Log the current URL for debug
        System.out.println("Redirected URL after clicking Privacy: " + currentUrl);

        // Validate that it's NOT redirecting to Terms page & bug captured successfully
        Assert.assertTrue(!currentUrl.toLowerCase().contains("privacy"), "Bug Detected: Privacy link isn't correctly redirecting to Privacy page!");
    }
}
