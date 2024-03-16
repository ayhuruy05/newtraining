package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("Webdriver.Chrome.Driver", "C:\\Program Files\\chromedriver.exe");
      ChromeDriver BrowserObject = new ChromeDriver();
      BrowserObject.get("https://www.google.com/");
      BrowserObject.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Selenium Python");
      BrowserObject.findElement(By.name("btnK")).click();
	}

}
