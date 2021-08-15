package selinum;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByName("firstname").sendKeys("sriram");
	driver.findElementByName("lastname").sendKeys("sree");
	driver.findElementByName("reg_email__").sendKeys("sriram254@gmail.com");
	driver.findElementByName("reg_passwd__").sendKeys("Sriram@251998");
	WebElement drop1=driver.findElement(By.id("day"));
	Select dropdwn1=new Select(drop1);
	dropdwn1.selectByValue("25");
	WebElement drop2=driver.findElement(By.id("month"));
	Select dropdwn2=new Select(drop2);
	dropdwn2.selectByValue("4");
	WebElement drop3=driver.findElement(By.id("year"));
	Select dropdwn3=new Select(drop3);
	dropdwn3.selectByVisibleText("1998");
}
}