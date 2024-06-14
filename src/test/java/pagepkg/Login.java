package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[2]/button/div/div")
	WebElement FirstLogIn;
	
	@FindBy(id="email")
	WebElement EmailId;
	
	@FindBy(id= "password")
	WebElement Password;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div/div/div")
	WebElement SecondLogin;
	
	public Login (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void initiallogin() {
		FirstLogIn.click();
	}
	
	public void setvalues(String email, String password) {
		
		EmailId.clear();
		EmailId.sendKeys(email);
		Password.clear();
		Password.sendKeys(password);
		
	}
	
	public void finallogin() {
		SecondLogin.click();
	}
	

}
