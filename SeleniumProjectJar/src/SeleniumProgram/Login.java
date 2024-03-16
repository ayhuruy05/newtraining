package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("Webdriver.chrome.Driver", "C:\\Program Files\\chromedriver.exe");
          ChromeDriver BrowserObject = new ChromeDriver();
          BrowserObject.get("https://admin-demo.nopcommerce.com/login");
          WebElement Email = BrowserObject.findElement(By.className("email"));
          Email.clear();
          Email.sendKeys("admin@yourstore.com");
          WebElement Pass = BrowserObject.findElement(By.id("Password"));
          Pass.clear();
          Pass.sendKeys("admin");
          BrowserObject.findElement(By.className("button-1")).submit();
          
          
          
          
	}

}
