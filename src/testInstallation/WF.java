package testInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WF {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://wipro.sb01.workfront.com/");
		System.out.println(driver.getTitle());
		//Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("rupa.kadi@wipro.com");
		driver.findElement(By.id("password")).sendKeys("Hayaan123&");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'Dniwja')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href*='requests']")).click();
		driver.findElement(By.cssSelector("button.css-1grifdo")).click();
		/*String element= driver.findElement(By.id("combobox-combobox")).getTagName();
		System.out.println(element);*/
	}

}
