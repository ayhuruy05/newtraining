package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocislMeddiaNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("WebDriver.Chrome.Driver","C:\\Program Files\\chromedriver.exe");
       ChromeDriver BrowserObject = new ChromeDriver ();
       BrowserObject.get("https://www.itlearn360.com");
       BrowserObject.findElement(By.className("fa")).click();
       BrowserObject.navigate().back();
       BrowserObject.findElement(By.xpath("//*[@id=\"blog\"]/div[1]/div[1]/div/div[1]/ul/a[2]/li/i")).click();
       BrowserObject.navigate().back();
       BrowserObject.findElement(By.className("fa-instagram")).click();
       BrowserObject.navigate().back();
       BrowserObject.close();
       
	}

}
