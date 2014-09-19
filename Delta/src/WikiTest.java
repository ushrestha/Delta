


import static org.junit.Assert.assertTrue;
import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import net.thucydides.*;

public class WikiTest {

	public static void main(String args[]) {
         WebDriver driver;
         driver = new FirefoxDriver();
         
         
		

		driver.get("https://atlasetmds-upg-ref.usae.bah.com/Atlas2/faces/page/login/Login.seam");
		driver.findElement(By.name("login:username")).sendKeys("ushrestha");
		driver.findElement(By.name("login:password")).sendKeys("Password123456_");
	    driver.findElement(By.name("login:password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//a[@id='fMenu:j_idt75']/h1")).click();
	    driver.findElement(By.id("catalogEnclosingForm:catalogTable:colgTitleId")).sendKeys("test");
	    driver.findElement(By.id("catalogEnclosingForm:ccafDecId:afBId")).click();
	    //driver.findElement(By.id("catalogEnclosingForm:ccafDecId:afBId")).click();
	   // driver.findElement(By.id("catalogEnclosingForm:catalogTable:0:colSDecId:colSBId")).click();
	    //driver.findElement(By.id("catalogEnclosingForm:j_idt10685:enrollincoursecc")).click();
	    //driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	    //driver.findElement(By.cssSelector("h1.gadget_title")).click();
	    		
	   

	}
}
