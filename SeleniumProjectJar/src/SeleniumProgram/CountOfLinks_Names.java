package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks_Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("Web Driver.Chrome.Driver", "C:\\Program Files\\chromedriver.exe");
       ChromeDriver BrowserObject = new ChromeDriver();
       BrowserObject.get("https://www.itlearn360.com");
       int count = 0;
       List<WebElement> allLinks = BrowserObject.findElements(By.tagName("a"));
       for (WebElement link : allLinks)
       {
    	   System.out.println(link.getAttribute("href"));
    	   count++;}
    	   
    	    
	System.out.println("total number of links present: "+count);	
}
}

