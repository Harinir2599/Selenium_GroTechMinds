package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automateme_81 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Harini");
		driver.findElement(By.id("lname")).sendKeys("Ravi");
		driver.findElement(By.id("email")).sendKeys("hariniravi25.hr@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Haridec@250799");
		driver.findElement(By.id("Present-Address")).sendKeys("No 2 ,9th street,New Colony,Adambakkam,Chennai 88.");
		driver.findElement(By.id("Permanent-Address")).sendKeys("No 2 ,9th street,New Colony,Adambakkam,Chennai 88.");
		driver.findElement(By.id("Pincode")).sendKeys("600088");
		
		
	}

}
