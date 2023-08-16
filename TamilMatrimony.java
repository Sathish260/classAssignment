package automateScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.tamilmatrimony.in/");
		WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select set=new Select(profile);
		set.selectByVisibleText("Myself");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select days= new Select(day);
		days.selectByValue("10");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select months= new Select(month);
		months.selectByVisibleText("June");
		WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select years= new Select(year);
		years.selectByValue("2000");
		
		WebElement reli = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select rel = new Select(reli);
		rel.selectByVisibleText("Hindu");
		
		WebElement mothertq = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select mother=new Select(mothertq);
		mother.selectByVisibleText("Arunachali");
		
		
		WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select coun=new Select(country);
		coun.selectByVisibleText("India");
		
		WebElement code = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select coutrycode=new Select(code);
		coutrycode.selectByValue("+91");
		
		
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("8765445766");
		
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("ram26@gmail.com");
		
		driver.close();
		
		
	    	
	}

}
