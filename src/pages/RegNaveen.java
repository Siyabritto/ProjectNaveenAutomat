package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegNaveen 
{
WebDriver nav_cd;
	
	//Object Repository
			
		By fnam = By.xpath("//*[@id=\"input-firstname\"]");
		By lnam = By.xpath("//*[@id=\"input-lastname\"]");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By tele = By.xpath("//*[@id=\"input-telephone\"]");
		
		By pswd = By.xpath("//*[@id=\"input-password\"]");
		By c_pswd = By.xpath("//*[@id=\"input-confirm\"]");
		

		By agree = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By cont1 = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		By cont2 = By.xpath("//*[@id=\"content\"]/div/div/a");
		
		
		public RegNaveen(WebDriver nav_cd) 
		{
			this.nav_cd = nav_cd;
		}
		
	// Action Method 1
		
		public void regInput(String fn, String ln, String em, String tel, String psw)
		{
			nav_cd.findElement(fnam).sendKeys(fn);
			nav_cd.findElement(lnam).sendKeys(ln);
			nav_cd.findElement(email).sendKeys(em);
			nav_cd.findElement(tele).sendKeys(tel);
			nav_cd.findElement(pswd).sendKeys(psw);
			nav_cd.findElement(c_pswd).sendKeys(psw);
		}
		
	// Action Method 2
		
		public void regPage()
		{
			nav_cd.findElement(agree).click();
			nav_cd.findElement(cont1).click();
			nav_cd.findElement(cont2).click();
		}
}
