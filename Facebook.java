package automateScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class= '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("senthil");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ram26@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ram");
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select dayInput = new Select(day);
		dayInput.selectByValue("24");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthInput = new Select(month);
		monthInput.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearInput = new Select(year);
		yearInput.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[text()= 'Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        driver.close();
		
		
	}
	
}



