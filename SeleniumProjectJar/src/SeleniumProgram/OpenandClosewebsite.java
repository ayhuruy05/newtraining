package SeleniumProgram;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenandClosewebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("Webdriver.Chrome.Driver","C:\\Program Files\\chromedriver.exe");
        	ChromeDriver BrowserObject = new ChromeDriver();
        BrowserObject.get ("https://www.amazon.com/");
        BrowserObject.close();
        	
	}

}
