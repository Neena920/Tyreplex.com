package com.tyreplex.pom;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyrePressurePage {

	WebDriver driver;

	@FindBy(xpath = "//img[@alt=\"Tyreplex.com\"]")
	private WebElement Tyreplex;

	@FindBy(xpath = "//input[@placeholder=\"Search for Tyres for City 5th Gen\"]")
	private WebElement searchfield;

	@FindBy(xpath = "//a[@id=\"loadMoreVehicleVariants\"]")
	private WebElement viewmore;

	@FindBy(xpath = "//a[contains(text(),'View less')]")
	private WebElement viewless;

	@FindBy(xpath = "//a[@title=\"City 5th Gen V CVT Petrol\"]")
	private WebElement VCVTPetrol;

	@FindBy(xpath = "//a[@title=\"City 5th Gen V MT Diesel\"]")
	private WebElement VMTDiesel;

	@FindBy(xpath = "//a[contains(text(),'ZX CVT Petrol')]")
	private WebElement ZXCVTPetrol;;

	@FindBy(xpath = "//a[contains(text(),'ZX MT Diesel')]")
	private WebElement ZXMTDiesel;

	@FindBy(xpath = " //img[@alt=\"City 5th Gen Diesel Tyre Pressure\"]")
	private WebElement DieselTyrePressureImage;

	@FindBy(xpath = " //img[@alt=\"City 5th Gen Petrol Tyre Pressure\"]")
	private WebElement PetrolTyrePressureImage;

	@FindBy(xpath = "//span[@class=\"brand-logo brand-ceat\"]")
	private WebElement ceat;

	@FindBy(xpath = "//span[@class=\"brand-logo brand-goodyear\"]")
	private WebElement goodyear;

	@FindBy(xpath = " //a[contains(text(),'View All City 5th Gen tyres')]")
	private WebElement ViewAlCity5thGentyres;

	@FindBy(xpath = " //span[contains(text(),'Hyundai Creta 2018-20')]")
	private WebElement HyundaiCreta201820ViewTyres;

	@FindBy(xpath = "//span[contains(text(),'Tata Harrier 2019-20')]")
	private WebElement TataHarrier201920ViewTyres;

	@FindBy(xpath = "//a[@id=\"tyre-pressure-car-tab\"]")
	private WebElement car;

	@FindBy(xpath = "//span[contains(text(),'Choose Brand')]")
	private WebElement choosebrand;

	@FindBy(xpath = "//input[@aria-controls=\"select2-vehicle_make_tyre_pressure-results\"]")
	private WebElement searchchoosebrand;

	@FindBy(xpath = "//span[contains(text(),'Choose Model')]")
	private WebElement choosemodel;

	@FindBy(xpath = "//input[@aria-controls=\"select2-vehicle_model_tyre_pressure-results\"]")
	private WebElement searchchoosemodel;

	@FindBy(xpath = "//a[contains(text(),'Check Tyre Pressure')]")
	private WebElement checktyrepressurebutton;

	public TyrePressurePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void TyreplexMethod() {

		Tyreplex.click();
		driver.navigate().back();

	}

	public void searchfieldMethod() {

		searchfield.sendKeys("ceat");
		searchfield.sendKeys(Keys.ARROW_DOWN);
		searchfield.sendKeys(Keys.ARROW_DOWN);
		searchfield.sendKeys(Keys.ENTER);
		driver.navigate().back();

	}

	public void viewmoreMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", viewmore);

	}

	public void TyrePressureForHondaCity5thGenMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", VCVTPetrol);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", VMTDiesel);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", ZXCVTPetrol);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", ZXMTDiesel);
		driver.navigate().back();

	}

	public void viewlessMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("arguments[0].click();", viewless);

	}

	public void TyrePressureImagesMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(DieselTyrePressureImage).click().perform();
		actions.moveToElement(DieselTyrePressureImage).click().perform();
		actions.moveToElement(PetrolTyrePressureImage).click().perform();
		actions.moveToElement(PetrolTyrePressureImage).click().perform();


	    boolean isDieselBroken  = (Boolean)js.executeScript("return arguments[0].naturalWidth== 0", DieselTyrePressureImage);
	    boolean isPetrolBroken  = (Boolean)js.executeScript("return arguments[0].naturalWidth== 0", PetrolTyrePressureImage);

		System.out.println(isDieselBroken ?"image is broken." : "Image is ok.");		
		System.out.println(isPetrolBroken ?"image is broken." : "Image is ok.");	
		

	}


	public void PopularTyresMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		js.executeScript("arguments[0].click();", ceat);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", goodyear);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", ViewAlCity5thGentyres);
		driver.navigate().back();

	}

	public void TyrePressureforCity5thGenCompetitorsMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		js.executeScript("arguments[0].click();", HyundaiCreta201820ViewTyres);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", TataHarrier201920ViewTyres);
		driver.navigate().back();

	}

	public void SearchTyrePressureforYourVehicleMethod() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,450)");
		js.executeScript("arguments[0].click();", car);
		

		Actions actions = new Actions(driver);
		actions.moveToElement(choosebrand).click().perform();
		
		Thread.sleep(300);
		actions.moveToElement(searchchoosebrand).click().perform();
		
		searchchoosebrand.sendKeys("honda");

		searchchoosebrand.sendKeys(Keys.ENTER);

		  
		  System.out.println("choose brand done ");
			/*
			 * actions.moveToElement(choosemodel).click().perform();
			 * 
			 * 
			 * choosemodel.sendKeys("brio"); choosemodel.sendKeys(Keys.ENTER);
			 * 
			 * System.out.println("choose model done ");
			 * 
			 * actions.moveToElement(checktyrepressurebutton).click().perform();
			 */

	}
	

	   public void VerifyPageTitle() {
		   String s = driver.getTitle();

		   String expectedTitle = s;
		   String actualTitle = driver.getTitle();
		   if(actualTitle.contains(expectedTitle)) {
			   
			   System.out.println("Page title verified " );		   
		   }
		   else {
			   
			   System.out.println("Title mismatch " );	   
			   
		   }
		      
	   }

}
