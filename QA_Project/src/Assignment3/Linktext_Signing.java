package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Signing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("Webdriver.Chrome.drive","C:\\Program Files\\chromedriver.exe");
    // 2. Initialize Webdriver object through ChromeDriver class. 
        ChromeDriver browserObject = new ChromeDriver();
    // 3. Open the http://www.amazon.com/ link using get method.
        browserObject.get("https://app.eskill.com/v7/ui/testcenter/web/eskill/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Flogin&brandId=1");
        browserObject.findElement(By.className("close")).click();
        browserObject.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login"));
        browserObject.findElement(By.className("btn")).click();
        
        WebElement Email=browserObject.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login"));
        WebElement pass=browserObject.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_password"));
        Email.sendKeys("abcd@adv.com");
        pass.sendKeys("abc12@ddfghj");
        browserObject.findElement(By.className("btn")).click();
       // browserObject.close();//
        //WebElement button=browserObject.findElement(By.className("btn"));button.submit();//
		
        
        
        
        
        
        
       
       
       
       
	}

}
