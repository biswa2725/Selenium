package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswajit\\Downloads\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Tom");
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Cooper");
		
		//driver.findElement(By.id("firstname")).sendKeys("Tom");
		//driver.findElement(By.id("lastname")).sendKeys("Cooper");
		
		//driver.findElement(By.name("firsname")).sendKeys("Tom");
		//driver.findElement(By.name("lastname")).sendKeys("Cooper");
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
	}

}
