package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("Webdriver.Chrome.Driver", "C:\\Program Files\\chromedriver.exe");
     // 2. Initialize Webdriver object through ChromeDriver class. 
        ChromeDriver browserObject = new ChromeDriver();
     // 3. Open the http://www.amazon.com/ link using get method.
        browserObject.get("https://www.google.com/");
     // 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.
        WebElement blogLink = browserObject.findElement(By.linkText("About"));
        blogLink.click();
        
       // 5. If the text is form of link then its displayed or else will not display//
        if (blogLink.isDisplayed()) {
            System.out.println("About link is diplayed usingLinkText");
        } else {
            System.out.println("Unable to find About");
        }
	// 6. Close the browser
       // browserObject.close();//
	}

	

}
