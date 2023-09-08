import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	      //open the Chrome browser
			
			WebDriver driver = new ChromeDriver();
			
			//open the Webpage
			
			driver.get("http://training.qaonlinetraining.com/testPage.php");
			driver.findElement(By.name("name")).sendKeys("kiran");
			driver.findElement(By.id("eml")).sendKeys("Job123");
			driver.findElement(By.name("website")).sendKeys("https://www.google.com");
			driver.findElement(By.name("comment")).sendKeys("This is a very informative website");
			
			WebElement radiof= driver.findElement(By.cssSelector("input[value='female']"));
			radiof.click();
			System.out.println(radiof.isSelected());
			
			Thread.sleep(4000);
			WebElement radiom = driver.findElement(By.cssSelector("input[value='male']"));
			radiom.click();
			System.out.println(radiom.isSelected());
			
			Thread.sleep(3000);
			WebElement radioot = driver.findElement(By.xpath("//input[@value='Other']"));
			radioot.click();
			System.out.println( radioot.isSelected());
			
			Thread.sleep(3000);
			WebElement checkB = driver.findElement(By.xpath("//input[@value='Bike']"));
			checkB.click();
			System.out.println(checkB.isSelected());
			
			Thread.sleep(2000);
			WebElement checkC = driver.findElement(By.xpath("//input[@value='car']"));
			checkC.click();
			System.out.println(checkC.isSelected());
			
			
			
			Thread.sleep(3000);
			WebElement checkBo = driver.findElement(By.xpath("//input[@value='boat']"));
			checkBo.click();
			System.out.println(checkBo.isSelected());
			
			Thread.sleep(3000);
			WebElement checkh = driver.findElement(By.cssSelector("input[value='horse']"));
			checkh.click();
			System.out.println(checkh.isSelected());
			
			WebElement dropdowns = driver.findElement(By.name("country"));
			Select select = new Select(dropdowns);
//			droupcous.size();
			Thread.sleep(3000);
			//select.selectByVisibleText("India");
			//select.selectByValue("FRANCE");
			select.selectByIndex(2);
			
			
			WebElement course= driver.findElement(By. name("skill"));
			Select select1 = new Select(course);
			Thread.sleep(2000);
			select1.selectByIndex(0);
			
			WebElement element= driver.findElement(By.name("submit"));
			element.click();
			
			
		
			
	}
	

}
