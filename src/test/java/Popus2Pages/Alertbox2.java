package Popus2Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Popus.Steps.ButtonPages;



public class Alertbox2 {
	private ButtonPages buttonPages;
	
	public Alertbox2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages=new ButtonPages(driver);
		
	}
	
	
	
	public void clickearbotton( ) {
		buttonPages.botonlogin();
	}

}

