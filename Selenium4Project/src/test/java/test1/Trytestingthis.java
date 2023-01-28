package test1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trytestingthis {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		int jeda = 500;
		
		driver.get("https://trytestingthis.netlify.app/index.html");
		driver.manage().window().maximize();
		
//		input text
		driver.findElement(By.id("fname")).sendKeys("Saya");
		driver.findElement(By.id("lname")).sendKeys("Rafi");
		driver.findElement(By.id("male")).click();
		
//		input only one option
		WebElement option = driver.findElement(By.xpath("//select[@id='option']"));
		Select selectOption = new Select(option);
		selectOption.selectByIndex(2);
		Thread.sleep(jeda);
		selectOption.selectByValue("option 3");
		Thread.sleep(jeda);
		selectOption.selectByVisibleText("Option 1");
		
//		input multiple option
		WebElement multiOption = driver.findElement(By.xpath("//select[@name='Optionwithcheck[]']"));
		Select multiSelect = new Select(multiOption);
		multiSelect.selectByIndex(0);
		Thread.sleep(jeda);
		multiSelect.selectByValue("option 1");
		Thread.sleep(jeda);
		multiSelect.selectByVisibleText("Option 2");
		Thread.sleep(jeda);
		multiSelect.deselectByVisibleText("Option 1");
		Thread.sleep(jeda);
		multiSelect.selectByVisibleText("Option 3");
		
//		input checkbox
		driver.findElement(By.xpath("//input[@name='option1' and @id='moption']")).click();
		Thread.sleep(jeda);
		driver.findElement(By.xpath("//input[@name='option2' and @id='moption']")).click();
		Thread.sleep(jeda);
		driver.findElement(By.xpath("//input[@name='option1' and @id='moption']")).click();
		Thread.sleep(jeda);
		driver.findElement(By.xpath("//input[@name='option3' and @id='moption']")).click();
		
//		datalist
		WebElement box = driver.findElement(By.xpath("//input[@list='datalists' and @name='Options']"));
		box.sendKeys("Chocolate");
		
//		date picker
		WebElement calendar = driver.findElement(By.xpath("//input[@type='date' and @id='day']"));
//		calendar.click();
//		calendar.sendKeys("30/01/2023");
//		calender symbol date not detacted
		
//		scroll range
//		driver.findElement(By.xpath("//output[@for='a' and @name='x']")).sendKeys("80");
		
//		drag and drop
		WebElement drag = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='div1']"));
				
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		

	}

}












