package testInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://wipro.sb01.workfront.com/");
		
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".M6CB1c")).click();
		//String name=driver.findElement(By.className("lnXdpd")).getText();
		//System.out.println(name);
		
		System.out.println(driver.findElement(By.cssSelector("img.lnXdpd")).getText());
	}

}
