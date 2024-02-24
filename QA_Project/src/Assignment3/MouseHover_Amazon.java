package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("Webdriver.Chrome.driver", "C:\\Program Files\\chromedriver.exe"); 
        ChromeDriver browserObject = new ChromeDriver();
        browserObject.get("https://www.amazon.com/deals/?_encoding=UTF8&pd_rd_w=3ZWPh&content-id=amzn1.sym.d1a1d17d-ada4-40da-9687-e756ccf48331&pf_rd_p=d1a1d17d-ada4-40da-9687-e756ccf48331&pf_rd_r=6VBC30M1045XNDN1YGRQ&pd_rd_wg=3wtrM&pd_rd_r=eeb935bd-8234-47e1-b00a-595ce7c65888");
        browserObject.manage().window().maximize();
        WebElement e= browserObject.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        Actions action = new Actions(browserObject);
        action.moveToElement(e).build().perform();
        browserObject.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[2]/span")).click();
        
	}

}
