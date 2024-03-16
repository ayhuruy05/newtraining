package SeleniumProgram;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebsites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        ChromeDriver BrowserObject = new ChromeDriver();
        BrowserObject.get("https://www.walmart.com/");
        System.out.println("This is " + BrowserObject.getTitle()+" Website");
        System.out.println("Url is "+ BrowserObject.getCurrentUrl());
        BrowserObject.navigate().to("https://www.aldi.com/");
        System.out.println("This is "+ BrowserObject.getTitle()+ " Website");
        System.out.println("Url is "+ BrowserObject.getCurrentUrl());
        BrowserObject.navigate().to("https://www.facebook.com/");
        System.out.println("This is "+ BrowserObject.getTitle()+" Website");
        System.out.println("Url is "+ BrowserObject.getCurrentUrl());
        BrowserObject.navigate().to("https://www.instagram.com/");
        System.out.println("This is "+BrowserObject.getTitle()+ " Website");
        System.out.println("Url is "+BrowserObject.getCurrentUrl());
        BrowserObject.navigate().back();
        System.out.println("this is "+BrowserObject.getTitle()+" Website");
        System.out.println("Url is "+ BrowserObject.getCurrentUrl());
        BrowserObject.navigate().forward();
        System.out.println("This is "+BrowserObject.getTitle()+" Website");
        System.out.println("Url is "+BrowserObject.getCurrentUrl());
        BrowserObject.close();
        
        
        
	}

}
