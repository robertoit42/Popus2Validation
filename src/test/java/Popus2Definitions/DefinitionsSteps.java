package Popus2Definitions;

import org.openqa.selenium.WebDriver;

import Popus2Pages.Alertbox2;
import Popus2Steps.Conexion2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {
	private WebDriver driver;
	private Conexion2 conexion = new Conexion2();
	private Alertbox2 alertbox2 = new Alertbox2(driver);
	
	
	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion=new Conexion2();
		this.driver=this.conexion.abrirNavegador();
	}
	
	@And("^clikear alerta$")
	public void clickearboton() {
		this.alertbox2 = new Alertbox2(driver);
		this.alertbox2.clickearbotton();
	}
	

}
