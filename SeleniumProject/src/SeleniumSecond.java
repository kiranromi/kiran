import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSecond {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chrome\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	String baseUrl = "https://www.amazon.com/";
	driver.get(baseUrl);
	// isDisplayed()      isEnabled()
	
	  WebElement searchStore = driver.findElement(By.id("twotabsearchtextbox"));
	System.out.println("Display Status: " + searchStore.isDisplayed() );//true
	System.out.println("Enable Status : " + searchStore.isEnabled()  );//true
	
	//isSelected()
	  WebElement searchNewRelease = driver.findElement(By.id("a-page"));
	System.out.println(" searchNewRelease Status: " +searchNewRelease.isDisplayed() );//true
	
	WebElement english = driver.findElement(By.id("a-page"));
	WebElement epasnol = driver.findElement(By.id("a-page"));

	
	english.click();
	System.out.println("English is Selected:  " +  english.isSelected());//true
	System.out.println("Epasnol is Selected:  " +  epasnol.isSelected());//false
	
	epasnol.click();
	System.out.println("English is Selected:  " +  english.isSelected());//false
	System.out.println("Epasnol is Selected:  " +  epasnol.isSelected());//true
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	