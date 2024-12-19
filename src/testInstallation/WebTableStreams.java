package testInstallation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
    
    /*from practice page select Top Deals and when we click on column name, all products will be sorted. Here our goal is to grab them and sort them and compare output with the sorted order in webpage*/ 
    //click on column
    driver.findElement(By.xpath("//tr/th[1]")).click();
    
    //Capture all webElements into list
    List<WebElement> names= driver.findElements(By.xpath("//tr/td[1]"));
    List<String> originallist=names.stream().map(s->s.getText()).collect(Collectors.toList());

    //sort on original list of step3 -->sort list
    List<String> newlist=originallist.stream().sorted().collect(Collectors.toList());
    
    //Compare orginal list vs newlist that means sorted list
    Assert.assertTrue(originallist.equals((newlist)));
	}

}
