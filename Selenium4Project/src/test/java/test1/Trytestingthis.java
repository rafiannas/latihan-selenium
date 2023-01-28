package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trytestingthis {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/index.html");
		
//		input text
		driver.findElement(By.id("fname")).sendKeys("Saya");
		driver.findElement(By.id("lname")).sendKeys("Rafi");
		driver.findElement(By.id("male")).click();
		
//		input only one option
		WebElement option = driver.findElement(By.xpath("//select[@id='option']"));
		Select selectOption = new Select(option);
		selectOption.selectByIndex(2);
		Thread.sleep(1200);
		selectOption.selectByValue("option 3");
		Thread.sleep(1200);
		selectOption.selectByVisibleText("Option 1");
		
//		input multiple option
		WebElement multiOption = driver.findElement(By.xpath("//select[@name='Optionwithcheck[]']"));
		Select multiSelect = new Select(multiOption);
		multiSelect.selectByIndex(0);
		Thread.sleep(1200);
		multiSelect.selectByValue("option 1");
		Thread.sleep(1200);
		multiSelect.selectByVisibleText("Option 2");
		Thread.sleep(1200);
		multiSelect.deselectByVisibleText("Option 1");
		Thread.sleep(1200);
		multiSelect.selectByVisibleText("Option 3");
		
//		input checkbox
		driver.findElement(By.xpath("//input[@name='option1' and @id='moption']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@name='option2' and @id='moption']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@name='option1' and @id='moption']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@name='option3' and @id='moption']")).click();
		
//		datalist
		WebElement box = driver.findElement(By.xpath("//input[@list='datalists' and @name='Options']"));
		box.sendKeys("Chocolate");
		
	
		

	}

}












