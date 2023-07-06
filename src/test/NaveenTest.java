package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NaveenPage;
import pages.RegNaveen;

public class NaveenTest 
{
	WebDriver nav_cd;
	
	@BeforeTest
	public void start()
	{
		nav_cd = new ChromeDriver();
		nav_cd.get("https://naveenautomationlabs.com/opencart");
		nav_cd.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		NaveenPage n = new NaveenPage(nav_cd);
		n.myAcc();
		RegNaveen rn = new RegNaveen(nav_cd);
		rn.regInput("Pmlki", "Qwer", "polkj123@gmail.com", "7777777777", "Pmlkifgh123*");
		rn.regPage();
	}
}