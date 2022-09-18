package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {
	WebDriver driver;

	public FormsPage(WebDriver driver) {
		this.driver = driver;
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
//	Enter vehicle data /////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

	final String MAKE_INPUT = "//*[@id=\"make\"]";
	final String MODEL_PERFORMACE = "//*[@id=\"model\"]";
	final String CYLINDER_PERFORMACE = "//*[@id=\"cylindercapacity\"]";
	final String ENGINE_PERFORMACE = "//*[@id=\"engineperformance\"]";
	final String DATE = "//*[@id=\"opendateofmanufacturecalender\"]";
	final String DATE_PICK = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a";
	final String NUMBER_SEATS = "//*[@id=\"numberofseatsmotorcycle\"]";
	final String HAND_DRIVE = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span";
	final String NUMBER_SEATS_TWO = "//*[@id=\"numberofseats\"]";
	final String FUEL = "//*[@id=\"fuel\"]";
	final String PAYLOAD = "//*[@id=\"payload\"]";
	final String WEIGHT = "//*[@id=\"totalweight\"]";
	final String PRICE = "//*[@id=\"listprice\"]";
	final String PLATE = "//*[@id=\"licenseplatenumber\"]";
	final String MILLEAGE = "//*[@id=\"annualmileage\"]";

	final String NEXT = "//*[@id=\"nextenterinsurantdata\"]";

	public void MakeInput(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(MAKE_INPUT)));
		dropdown.selectByIndex(1);
	}

	public void ModelInput(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(MODEL_PERFORMACE)));
		dropdown.selectByIndex(1);
	}

	public void CylinderInput(String produto) {
		driver.findElement(By.xpath(CYLINDER_PERFORMACE)).sendKeys(produto);
	}

	public void EngineInput(String produto) {
		driver.findElement(By.xpath(ENGINE_PERFORMACE)).sendKeys(produto);
	}

	public void DateInput(String produto) {
		driver.findElement(By.xpath(DATE)).click();
		driver.findElement(By.xpath(DATE_PICK)).click();
	}

	public void SeatsInput(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(NUMBER_SEATS)));
		dropdown.selectByIndex(1);
	}

	public void HandDriveInput(String produto) {
		driver.findElement(By.xpath(HAND_DRIVE)).click();
	}

	public void SeatsTwoInput(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(NUMBER_SEATS_TWO)));
		dropdown.selectByIndex(1);
	}

	public void FuelInput(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(FUEL)));
		dropdown.selectByIndex(1);
	}
	
	public void PayloadInput(String produto) {
		driver.findElement(By.xpath(PAYLOAD)).sendKeys(produto);
	}
	
	public void WeightInput(String produto) {
		driver.findElement(By.xpath(WEIGHT)).sendKeys(produto);
	}

	public void PriceInput(String produto) {
		driver.findElement(By.xpath(PRICE)).sendKeys(produto);
	}

	public void PlateInput(String produto) {
		driver.findElement(By.xpath(PLATE)).sendKeys(produto);
	}

	public void MilleageInput(String produto) {
		driver.findElement(By.xpath(MILLEAGE)).sendKeys(produto);
	}

	public void NextButton(String produto) {
		driver.findElement(By.xpath(NEXT)).click();
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
//Enter Insurant data ///////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////

	final String FIRST_NAME = "//*[@id=\"firstname\"]";
	final String LAST_NAME = "//*[@id=\"lastname\"]";
	final String DATE_BIRTH = "//*[@id=\"birthdate\"]";
	final String GENDER = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span";
	final String ADDRESS = "//*[@id=\"streetaddress\"]";
	final String CONTRY = "//*[@id=\"country\"]";
	final String ZIP = "//*[@id=\"zipcode\"]";
	final String CITY = "//*[@id=\"city\"]";
	final String OCCUPATION = "//*[@id=\"occupation\"]";
	final String HOBBIES = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span";
	final String SITE = "//*[@id=\"website\"]";

	final String NEXT_INSURANT = "//*[@id=\"nextenterproductdata\"]";

	public void FirstName(String produto) {
		driver.findElement(By.xpath(FIRST_NAME)).sendKeys(produto);
	}

	public void LastName(String produto) {
		driver.findElement(By.xpath(LAST_NAME)).sendKeys(produto);
	}

	public void DateBirth(String produto) {
		driver.findElement(By.xpath(DATE_BIRTH)).sendKeys(produto);

	}

	public void Gender(String produto) {
		driver.findElement(By.xpath(GENDER)).click();
	}

	public void Address(String produto) {
		driver.findElement(By.xpath(ADDRESS)).sendKeys(produto);
	}

	public void Country(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(CONTRY)));
		dropdown.selectByIndex(1);
	}

	public void Zip(String produto) {
		driver.findElement(By.xpath(ZIP)).sendKeys(produto);
	}

	public void City(String produto) {
		driver.findElement(By.xpath(CITY)).sendKeys(produto);
	}

	public void Occupation(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(OCCUPATION)));
		dropdown.selectByIndex(1);
	}

	public void Hobbies(String produto) {
		driver.findElement(By.xpath(HOBBIES)).click();
	}

	public void Site(String produto) {
		driver.findElement(By.xpath(SITE)).sendKeys(produto);
	}
	
	public void NextButtonInsurant(String produto) {
		driver.findElement(By.xpath(NEXT_INSURANT)).click();
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
//Enter Product data ///////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////

	final String START_DATE = "//*[@id=\"startdate\"]";
	final String PRODUCT_SUM = "//*[@id=\"insurancesum\"]";
	final String MERIT_RATE = "//*[@id=\"meritrating\"]";
	final String DAMAGE = "//*[@id=\"damageinsurance\"]";
	final String OPTIONAL_PRODUCT = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span";
	final String COURTESY_CAR = "//*[@id=\"courtesycar\"]";

	final String NEXT_PRODUCT = "//*[@id=\"nextselectpriceoption\"]";

	public void StartDate(String produto) {
		driver.findElement(By.xpath(START_DATE)).sendKeys(produto);
	}

	public void ProductSum(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(PRODUCT_SUM)));
		dropdown.selectByIndex(1);
	}

	public void MeritRate(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(MERIT_RATE)));
		dropdown.selectByIndex(1);
	}

	public void Damage(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(DAMAGE)));
		dropdown.selectByIndex(1);
	}

	public void OptionalProduct(String produto) {
		driver.findElement(By.xpath(OPTIONAL_PRODUCT)).click();
	}

	public void CourtesyCar(String produto) {
		Select dropdown = new Select(driver.findElement(By.xpath(COURTESY_CAR)));
		dropdown.selectByIndex(1);
	}

	public void NextButtonProduct(String produto) {
		driver.findElement(By.xpath(NEXT_PRODUCT)).click();
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////	
//Princing //////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
	
	final String PRICING = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span";
	final String NEXT_BUTTON_PRICING = "//*[@id=\"nextsendquote\"]";
	
	public void PrincingClick(String produto) {
		driver.findElement(By.xpath(PRICING)).click();
	}
	
	public void NextButtonPrincing(String produto) {
		driver.findElement(By.xpath(NEXT_BUTTON_PRICING)).click();
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////	
//Send //////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
	
	final String EMAIL = "//*[@id=\"email\"]";
	final String USERNAME = "//*[@id=\"username\"]";
	final String PASSWORD = "//*[@id=\"password\"]";
	final String CONFIRM_PASSWORD = "//*[@id=\"confirmpassword\"]";
	final String SEND = "//*[@id=\"sendemail\"]";
	
	final String CONFIRM = "/html/body/div[4]/div[7]/div/button";
	
	public void EmailInput(String produto) {
		driver.findElement(By.xpath(EMAIL)).sendKeys(produto);
	}
	
	public void UserInput(String produto) {
		driver.findElement(By.xpath(USERNAME)).sendKeys(produto);
	}
	
	public void PasswordInput(String produto) {
		driver.findElement(By.xpath(PASSWORD)).sendKeys(produto);
	}
	
	public void ConfirmPasswordInput(String produto) {
		driver.findElement(By.xpath(CONFIRM_PASSWORD)).sendKeys(produto);
	}
	
	public void SendButton(String produto) {
		driver.findElement(By.xpath(SEND)).click();
	}
	
	public void Confirmation(String produto) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(CONFIRM)).click();
	}
	
}
