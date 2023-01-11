package Popus2Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButonPages2 {
	
	@FindBy (how = How.XPATH, using = "//button[@id='alertBox']")
	private WebElement botonlogin;
	
	public ButonPages2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void botonlogin()  {
		botonlogin.click();
	}
}
