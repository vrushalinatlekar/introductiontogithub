package factorial_site_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialDataProviderTest extends BaseClass {
	    @DataProvider(name = "numbers")
	    public Object[][] data() {
	        return new Object[][] { {"4", "24"}, 
	        						{"5", "120"}, 
	        						{"6", "720"}, 
	        						{"7", "5040"}, 
	        						{"8", "40320"}, 
	        						{"9", "362880"}, 
	        						{"10", "3628800"}
	        					};
	    }

	    @Test(dataProvider = "numbers")
	    public void verifyFactorial(String input, String expected) throws Exception {
	    	System.out.println("Validating verifyFactorial...");
	    	WebElement inputNum = driver.findElement(By.id("number"));
	    	WebElement resultDiv = driver.findElement(By.id("resultDiv"));
	    	inputNum.clear();
	    	inputNum.sendKeys(input);
	    	driver.findElement(By.id("getFactorial")).click();
	    	Thread.sleep(500);
	    	System.out.println(resultDiv.getText());
	    	Assert.assertTrue(resultDiv.getText().contains(expected));
	    	
	    }
}
