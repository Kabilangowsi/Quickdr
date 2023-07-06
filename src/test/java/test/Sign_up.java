package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sign_up {

	// --driver lauch

	static WebDriver driver;

	public static void One() {
		driver = new ChromeDriver();
		// ---> implicity wait --->to the driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// --->URL Launch.
		// driver.get("https://quikdr.com");
		// driver.get("https://quikdr.com/addprofile");
		driver.get("https://quikdr.com/login");

	}

	public static void register() throws InterruptedException {
		// ---> Click the Login button
		WebElement click_login = driver.findElement(By.xpath("//li[@class='ant-menu-item']"));
		click_login.click();
		WebElement findElement = driver.findElement(By.xpath(
				"//div[@class='ant-col ant-col-sm-24']//following::button[@class='ant-btn ant-btn-primary ant-btn-lg'][2]"));
		findElement.click();
		// -->enter the mail id
		WebElement email = driver.findElement(By.xpath("//div[@id='email']//child::input"));
		email.sendKeys("kabilan.kolathur@gmail.com");
		// --->Enter the password
		WebElement pass = driver.findElement(By.xpath("//div[@id='password']//child::input"));
		pass.sendKeys("Kabilan@123");
		// --->Enter the Re-password
		WebElement re_enter = driver.findElement(By.xpath("//div[@id='confirm']//child::input"));
		re_enter.sendKeys("Kabilan@123");

		// -->Enter the phone number
		WebElement phone_number = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']"));
		phone_number.sendKeys("8695959594");

		// ---> Click the Check box
		Thread.sleep(10000);
		// ---> Here the in Automation cannot be able to click the check box so i have
		// used thread are sleep to select manually.

//		WebElement Checkbox = driver.findElement(By.xpath("//label[@class='ant-checkbox-wrapper']"));
//		Actions a = new Actions(driver);
//		a.click(Checkbox).build().perform();
//		JavascriptExecutor a = (JavascriptExecutor) driver;
//		a.executeScript("arguments[0].click()", Checkbox);
		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg']"));
		findElement2.click();
	}

	public static void Addprofile() throws AWTException {

		// --->User shoulden enter the first name
		driver.findElement(By.id("firstName")).sendKeys("Kabilan");
		// -->User should enter the last name
		driver.findElement(By.id("lastName")).sendKeys("R");
		// --->User enter address
		driver.findElement(By.id("address")).sendKeys("Coimbatore,Tamil Nadu");

		// --->Select the country from the drop down
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Please select a country']"));

		findElement.click();
		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyPress(KeyEvent.VK_ENTER);
		// ---> select the state
		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Please select a state']"));
		findElement2.click();
		Robot c1 = new Robot();
		c1.keyPress(KeyEvent.VK_DOWN);
		c1.keyPress(KeyEvent.VK_DOWN);
		c1.keyPress(KeyEvent.VK_DOWN);
		c1.keyPress(KeyEvent.VK_ENTER);
		/// --->Selct the nationality
		WebElement findElement3 = driver.findElement(By.xpath("//div[text()='Please select a Nationality']"));
		findElement3.click();
		Robot c2 = new Robot();
		c2.keyPress(KeyEvent.VK_DOWN);
		c2.keyPress(KeyEvent.VK_DOWN);
		c2.keyPress(KeyEvent.VK_DOWN);
		c2.keyPress(KeyEvent.VK_ENTER);
		// --> selct the gender
		WebElement findElement4 = driver.findElement(
				By.xpath("//div[@class='ant-select-selection__rendered']//child::div[text()='Please select gender']"));
		findElement4.click();
		Robot c3 = new Robot();
		c3.keyPress(KeyEvent.VK_DOWN);
		c3.keyPress(KeyEvent.VK_DOWN);
		c3.keyPress(KeyEvent.VK_ENTER);
//---> Select the blood group
		WebElement findElement5 = driver.findElement(By.xpath("//div[text()='Please select Blood Group']"));
		findElement5.click();
		c3.keyPress(KeyEvent.VK_DOWN);
		c3.keyPress(KeyEvent.VK_DOWN);
		c3.keyPress(KeyEvent.VK_ENTER);

		// -->select the date of birth
		WebElement findElement6 = driver.findElement(By.xpath("//input[@class='ant-calendar-picker-input ant-input']"));
		findElement6.click();

		// ---->click the register button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public static void Login() {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div/div/main/div/div[4]/div/div/div[1]/div/div/div/form/div/div[1]/label[2]/span[1]/input"))
				.click();
		//--->phonenumber
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		findElement.sendKeys("8695959594");
		//---->password
		driver.findElement(By.id("password")).sendKeys("Kabilan@123");

		// -->check box
		driver.findElement(By.id("agreement")).click();
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		One();
		Login();

	}
}
