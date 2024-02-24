package slenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php/");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Ayhur");
	        browserObject.findElement(By.name("email")).sendKeys("Ayhuruy@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.ITlearn360.com");
	        browserObject.findElement(By.name("comment")).sendKeys("lt is a good website");
	        
	        browserObject.findElement(By.xpath("//input[@value='female']")).click();
	        Thread.sleep(4000);
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
	        
	        
	       Select sc = new Select(browserObject.findElement(By.name("country")));
	       sc.selectByVisibleText("Ethiopia");
	       
	       
	       
	       browserObject.findElement(By.id("alert")).click();
			// 5. Intialize Alert object using sitchTo and alert method
		        Alert alert = browserObject.switchTo().alert();
			
			// 6. getText method is used to get the text from alert box 
		        System.out.println(alert.getText());
			// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method	
		        Thread.sleep(6000);
			
			// 8. Switch the browserObject control to alert box and accept the alert using accept method 
		        alert.accept();
		        
		        // example 2 - dismiss(You pressed Cancel!). The steps are same only name a new object
			browserObject.findElement(By.id("confirm")).click();
		        Alert alert1 = browserObject.switchTo().alert();
		        System.out.println(alert1.getText());
		        Thread.sleep(6000);
			// 9. Switch the browserObject control to alert box and cancel the alert using dismiss method 
		        alert1.dismiss();
		        
		        // example 3 - accept and Type(Hello Mr. Bond! How are you today? ) .The steps are same only name a new object
		        browserObject.findElement(By.id("prompt")).click();
		        Alert alert2 = browserObject.switchTo().alert();
		        System.out.println(alert2.getText());
		        Thread.sleep(6000);
			// 10. Switch the browserObject control to alert box and send value to the alert box using sendkeys method
		        alert2.sendKeys("Mr. Bond");
			// 11. After the value is send accept the alert using accept method.
		        alert2.accept();
	        
	        browserObject.findElement(By.name("submit")).click();
	        
	        
		
	}

}
