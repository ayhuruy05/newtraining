package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_HooverMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("Webdriver.Chrome.Driver", "C:\\Program Files\\chromedriver.exe");
       // 2. Initialize Webdriver object through ChromeDriver class.
       ChromeDriver browserObject = new ChromeDriver();
    // 3. Open the http://www.ebay.com/ link using get method.
       browserObject.get("https://www.ebay.com/");
       browserObject.manage().window().maximize();
       WebElement element = browserObject.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
       //Thread.sleep(3000);
       Actions action = new Actions (browserObject);
       action.moveToElement(element).build().perform();
       browserObject.findElement(By.xpath("/html/body"));
       
     //   browserObject.findElement(By.xpath("///*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
       
    		   
       
       //Thread.sleep(6000);
       
    
      
       
       
       
       
	}

}
