package Popus2Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;


public class Conexion2 {
	public WebDriver driver;
	
	@Before
	@Step
	public WebDriver abrirNavegador()  {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this.driver;
	}

}
