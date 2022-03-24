import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Worldpress_account {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sawal\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in");
		driver.findElement(By.xpath("//*[@id=\"usernameOrEmail\"]")).sendKeys(Sawalepranali@gmail.com);
		driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button")).click();
		driver.findElement(By.id("password")).sendKeys("Pranali@1234");
		driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
