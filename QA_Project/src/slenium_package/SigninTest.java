package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				// 2. Initialize Webdriver object through ChromeDriver class. 
			        ChromeDriver browserObject = new ChromeDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			        browserObject.get("https://admin-demo.nopcommerce.com/login");
			        
			       WebElement email=browserObject.findElement(By.name("Email"));
			        email.clear();
			        WebElement pas=browserObject.findElement(By.name("Password"));
			        pas.clear();
			        email.sendKeys("admin@yourstore.com");
			        pas.sendKeys("admin");
			        browserObject.findElement(By.className("button-1")).click();
			        
			        
			        
			        
			        
	}

}
