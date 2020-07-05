package locators;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	
	WebDriver wd;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();		
	}
	
	@Test
	public void interactwithWebElement () {
		wd.get("https://objectspy.space/");
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	wd.findElement(By.linkText("OS-API Product FrontEnd")).click();	
	//	wd.findElement(By.partialLinkText("OS-API")).click();
	//	wd.findElement(By.cssSelector("input#exp-2")).click();
	//	wd.findElement(By.cssSelector("input#input-file")).click();
		
			
	//	wd.findElement(By.xpath("//a[@title=\"Automation Practice Form\"]")).click();
		
		wd.findElement(By.xpath("//a[@href=\"http://www.objectspy.space\"]")).click();
		
		
		
		
		
		
		
		
		
	}
	
		
		
		
	}
	


