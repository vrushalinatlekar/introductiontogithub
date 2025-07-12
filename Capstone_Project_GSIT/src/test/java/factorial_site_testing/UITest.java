package factorial_site_testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest extends BaseClass{
    @Test
    public void validateUIElements() {
    	System.out.println("Validating UI Elements...");
        Assert.assertTrue(driver.findElement(By.id("number")).isDisplayed());   
        Assert.assertTrue(driver.findElement(By.linkText("Terms and Conditions")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Privacy")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("About")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("getFactorial")).isDisplayed());
        
        Assert.assertTrue(driver.findElement(By.id("getFactorial")).isEnabled());
    }
}