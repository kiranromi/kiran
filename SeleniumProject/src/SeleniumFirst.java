import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) {
		// location of the chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chrome\\chromedriver.exe");
      //open the Chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		//open the Webpage
		
		driver.get("https://www.facebook.com/");
	
		
		driver.findElement(By.id("email")).sendKeys("niharikadsm@gmail.com");
		
	}

}
