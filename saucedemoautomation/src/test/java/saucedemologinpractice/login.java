package saucedemologinpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login
{
	public static void main (String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Rupali");
		
		driver.findElement(By.id("email")).sendKeys("rupalidemo@gmail.com");
		
		driver.findElement(By.id("phone")).sendKeys("8778564565");
		
		driver.findElement(By.id("textarea")).sendKeys("pune hadapsar");
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.id("thursday")).click();
		
		Select country = new Select(driver.findElement (By.id("country")));
		country.selectByValue("india");
		
		
		
		
		
		
		//driver.close();
	}
}

