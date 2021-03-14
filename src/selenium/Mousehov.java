package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswajit\\Downloads\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go to URL
		String URL = "https://www.tutorialspoint.com/about/about_careers.htm";
		driver.get(URL);
		
		//Maximise browser window
		driver.manage().window().maximize();
		
		//Sleep
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	    // identify element
	    WebElement m=driver.findElement(By.xpath("//*[text()='Careers']"));
	    
	    // moveToElement and contextClick or rightclick
	    Actions act = new Actions(driver);
	    act.moveToElement(m).contextClick().build().perform();

	}

}
