package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\biswajit\\Downloads\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		String title = driver.getTitle();
		System.out.println(title);
		
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("ANTARCTICA");
		
		if (drpcountry.isMultiple()) {
			System.out.println("Multiple selection");
		}
		else {
			System.out.println("single selection");
		}
		
		/*driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		//fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);*/
		
	}

}
