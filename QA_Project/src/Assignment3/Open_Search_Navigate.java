package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Search_Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.drive", "C:\\Program Files\\Google\\Chrome.exe");
          // 2. Initialize Webdriver object through ChromeDriver class. 
          ChromeDriver browserObject = new ChromeDriver();
       // 3. Open the http://www.amazon.com/ link using get method.
          browserObject.get("https://www.google.com/");
          System.out.println ("url is: " + browserObject.getCurrentUrl());
          browserObject.findElement(By.name("q")).sendKeys("Lidle");
          browserObject.findElement(By.name("btnK")).click();
          browserObject.navigate().to("https://www.lidl.com/");
          System.out.println ("url is: " + browserObject.getCurrentUrl());
          System.out.println("this is " + browserObject.getTitle() + " website");
          browserObject.navigate().back();
          System.out.println ("url is: " + browserObject.getCurrentUrl());
          
          
          
          
          
          

	}

}
