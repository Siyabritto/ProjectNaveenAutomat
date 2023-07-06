package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaveenPage 
{
	WebDriver nav_cd;
	
	//Object Repository
	
		By my_ac = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
		By reg = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");  
		
		public NaveenPage(WebDriver nav_cd) 
		{
			this.nav_cd = nav_cd;
		}

	// Action Method
		
		public void myAcc()
		{
			nav_cd.findElement(my_ac).click();
			nav_cd.findElement(reg).click();
		}
}
