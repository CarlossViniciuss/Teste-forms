package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.FormsPage;

public class StepsForms {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@After
	public void after() {
		driver.quit();

	}

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String url) {
		driver.get(url);
	}

	@When("preencho os campos obrigatórios do primeiro formulario")
	public void preencho_os_campos_obrigatórios() {
		FormsPage forms = new FormsPage(driver);
		forms.MakeInput(null);
		forms.ModelInput(null);
		forms.CylinderInput("123");
		forms.EngineInput("123");
		forms.DateInput(null);
		forms.SeatsInput(null);
		forms.HandDriveInput(null);
		forms.SeatsTwoInput(null);
		forms.FuelInput(null);
		forms.PayloadInput("12");
		forms.WeightInput("123");
		forms.PriceInput("1234");
		forms.PlateInput("123");
		forms.MilleageInput("123");
		
		forms.NextButton(null);

	}
	
	
	@And("preencho o formulario enter Insurant Data")
	public void preencho_o_formulario_enter_insurant_data() {
		FormsPage forms = new FormsPage(driver);
		forms.FirstName("Carlos");
		forms.LastName("Vinicius");
		forms.DateBirth("09/09/2001");
		forms.Gender(null);
		forms.Address("Teste");
		forms.Country(null);
		forms.Zip("11330123");
		forms.City("Teste");
		forms.Occupation(null);
		forms.Hobbies(null);
		forms.Site("http://www.abc.com.br");
		
		forms.NextButtonInsurant(null);
	}

	@And("preencho o formulario enter Product Data")
	public void preencho_o_formulario_enter_product_data() {
		FormsPage forms = new FormsPage(driver);
		forms.StartDate("09/09/2023");
		forms.ProductSum(null);
		forms.MeritRate(null);
		forms.Damage(null);
		forms.OptionalProduct(null);
		forms.CourtesyCar(null);
		
		forms.NextButtonProduct(null);
	}
	
	@Then("finalizo e envio o formulario")
	public void finalizo_e_envio_o_formulario() throws InterruptedException {
		FormsPage forms = new FormsPage(driver);
		
		forms.PrincingClick(null);
		
		forms.NextButtonPrincing(null);
		
		forms.EmailInput("teste@teste.com");
		forms.UserInput("teste");
		forms.PasswordInput("123Abc");
		forms.ConfirmPasswordInput("123Abc");
		
		forms.SendButton(null);
		
		forms.Confirmation(null);
	}

}
