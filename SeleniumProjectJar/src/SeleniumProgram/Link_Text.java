package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("Wedriver.Chrome.Driver","C:\\Program Files\\chromedriver.exe");
        ChromeDriver BrowserObject = new ChromeDriver();
        BrowserObject.get("https://www.google.com");
       WebElement BlogLink =   BrowserObject.findElement(By.className("gb_H"));
       if (BlogLink.isDisplayed()) {
    	   System.out.println("it is link Text");
       }else {
    	   System.out.println("it is not a link Text");
       }
        
	}

}
