import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEcoomerce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement elemente= driver.findElement(By.id("Email"));
		elemente.clear();
		elemente.sendKeys("admin@yourstore.com");
		WebElement elementp= driver.findElement(By.id("Password"));
		elementp.clear();
		elementp.sendKeys("admin");
		WebElement  elementl = driver.findElement(By.className("button-1"));
		 elementl.click();

	}

}
