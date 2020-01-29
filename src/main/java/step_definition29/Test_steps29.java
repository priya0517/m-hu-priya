package step_definition29;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_steps29 {
	
	static public WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\cucumber_27jan\\com.maven_29_jan_demo23\\src\\main\\java\\resourse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp/");
		
	 
	}

	@When("User Navigate to LogIn page")
	public void user_Navigate_to_LogIn_page() {
		driver.findElement(By.linkText("SignIn")).click();
	   
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("Login")).click();
	  //  throw new cucumber.api.PendingException();
	}
	

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		
	
	WebElement a=driver.findElement(By.linkText("SignOut"));
	Assert.assertTrue(a.isDisplayed());
	a.click();

}
}