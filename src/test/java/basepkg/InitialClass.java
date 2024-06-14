package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InitialClass {

	public static WebDriver driver;


@BeforeTest
public void initialization()
{
	driver = new ChromeDriver();
	driver.get("https://in.pinterest.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
 }