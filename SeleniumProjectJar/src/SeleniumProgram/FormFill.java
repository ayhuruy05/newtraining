package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("Webdriver.Chrome.Driver","C:\\Program Files\\chromedriver.exe");
      ChromeDriver BrowserObject = new ChromeDriver();
      BrowserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
      BrowserObject.findElement(By.name("name")).sendKeys("Huruy");
      BrowserObject.findElement(By.id("eml")).sendKeys("1234@abc.com");
      BrowserObject.findElement(By.name("website")).sendKeys("IT Learn360");
      BrowserObject.findElement(By.name("comment")).sendKeys("Good website for learning");
      BrowserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
      BrowserObject.findElement(By.name("boat")).click();
      BrowserObject.findElement(By.name("car")).click();
      BrowserObject.findElement(By.name("submit")).click();
      
	}

}
