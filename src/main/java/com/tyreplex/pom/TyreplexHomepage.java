package com.tyreplex.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreplexHomepage {
	
	WebDriver driver;

	
    @FindBy(xpath="//div[@class=\"col-12 text-left search-inner elasticSearchList\"]")
    private WebElement SearchField;
	
    @FindBy(xpath="//span[contains(text(),'JK Tyre')]")
    private WebElement JKtyerBrandlink;
    
    @FindBy(xpath="//span[contains(text(),'MRF')]")
	private WebElement MRFButtonlink;
	
	@FindBy(xpath="//input[@placeholder=\"Ask or search your question\"]")
	private WebElement QuestionField;
	
	@FindBy(xpath="//p[contains(text(),'Neena')]")
	private WebElement ClickUserbutton;
	
	@FindBy(xpath="//button[@title=\"Facebook\"]")
	private WebElement facebooklink;
	
	@FindBy(xpath="//button[@title=\"Instagram\"]")
	private WebElement  Instagramlink;
	
	@FindBy(xpath="//a[contains(text(),'More')]")
	private WebElement  MoreDropdown;
	
	@FindBy(xpath="//span[contains(text(),'Honda City 5th Gen Tyres')]")
	private WebElement  HondaCity5thGenTyres;

	@FindBy(xpath="//a[@title=\"Tyre Pressure for Honda City 5th Gen\"]")
	private WebElement TyrePressureforHondaCity5thGen  ;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	private WebElement privacypolicy;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	private WebElement contactus;
	
	@FindBy(xpath=" //a[contains(text(),'Are you a Tyre Dealer?')]")
	private WebElement AreYouTyre;
	
	@FindBy(xpath="//a[@data-url=\"//delta.tyreplex.com/terms-of-use\"]")
	private WebElement TermOfUse;
	
	@FindBy(xpath=" //a[@data-url=\"//delta.tyreplex.com/career\"]")
	private WebElement Career;
	
	@FindBy(xpath="//a[@data-url=\"//delta.tyreplex.com/shipping-return-policy\"]")
	private WebElement  ShippingReturnPolicy ;

	@FindBy(xpath="//label[@data-lbl=\"By Vehicle Tab\"]")
	private WebElement Byvehiclebutton;
	
	@FindBy(xpath="//label[@data-lbl=\"By Size Tab\"]")
	private WebElement Bysizebutton;
	
	@FindBy(xpath="//label[@data-lbl=\"By Vehicle Number Tab\"]")
	private WebElement Byvehiclenumberbutton;
	
	@FindBy(xpath="//a[@data-lbl=\"Car Tab\"]")
	private WebElement carbutton;
	
	@FindBy(xpath="//a[@data-lbl=\"Bike Tab\"]")
	private WebElement Bikebutton;
	
	@FindBy(xpath="//span[@id=\"select2-home-page-vehicle-make-container\"]")
	private WebElement choosebrand;
	
	@FindBy(xpath="//span[@id=\"select2-home-page-vehicle-model-container\"]")
	private WebElement choosemodel;
	
	@FindBy(xpath="//span[@id='select2-home-page-vehicle-variant-container']")
	private WebElement choosevariant;
	
	@FindBy(xpath="//input[@aria-controls=\"select2-home-page-vehicle-variant-results\"]")
	private WebElement searchchoosevariant;
	
	@FindBy(xpath="//a[@onsubmit=\"return false;\"]")
	private WebElement search;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	private WebElement choosebrandfield;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	private WebElement brandsearchfield;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	private WebElement choosemodelfield ;
	
	@FindBy(xpath="//span[@class=\"brand-logo brand-mrf\"]")
	private WebElement MRF ;
	
	@FindBy(xpath="//a[contains(text(),'Accessories')]")
	private WebElement AccessoriesMenu ;
	
	@FindBy(xpath="//i[@class=\"fa fa-logout profileIcon\"]")
	private WebElement Logout ;
	
	@FindBy(xpath="//a[@title=\"New Delhi\"]")
	private WebElement newdelhi ;
	
	@FindBy(xpath="//a[contains(text(),'Compare Tyres')]")
	private WebElement compareTyres ;
	
	@FindBy(xpath="//ul[@class=\"select2-results__options\"]//li")
	private List<WebElement> list;
	
	
	public TyreplexHomepage(WebDriver driver) {
		
	    this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void SearchTyreDealerinYourCity() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",newdelhi );
		
	}	
	
	public void TyrePressureforHondaCity5thGenMethod() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("arguments[0].click();",TyrePressureforHondaCity5thGen );
		
	}
	
	
	public void FacebookLinkMethod() {
		
		facebooklink.click();
		driver.navigate().back();
	}
	
	public void ShippingAndReturnPolicy() {
		

		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", ShippingReturnPolicy);
		driver.navigate().back();	

	}

	public void ClickJKTyre() {
		
		JKtyerBrandlink.click();
	}
	
	public void ClickMRF() {
		
		MRFButtonlink.click();
	}
	
	public void Qustion() {
		
		QuestionField.sendKeys("");
	}
	
	public void UserButton() {
		ClickUserbutton.click();
	}
	
	public void HondaCity5thGenTyresMethod() {
		

		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("arguments[0].click();", HondaCity5thGenTyres);	

		
	}
	
	public void choosebrandmethod() {
		
		choosebrand.click();
		brandsearchfield.sendKeys("maru");
		brandsearchfield.sendKeys(Keys.ARROW_DOWN);
		brandsearchfield.sendKeys(Keys.ENTER);

	}
	
	public void choosemodelmethod() {
		choosemodel.click();
		choosemodelfield.sendKeys("gypsy");
		choosemodelfield.sendKeys(Keys.ARROW_DOWN);
		choosemodelfield.sendKeys(Keys.ENTER);
	    search.click();
		driver.navigate().back();
		//MRF.click();
		
	}
	
	
	public void chooseVariantMethod() {
		
		
		Actions act = new Actions(driver);
		act.moveToElement(choosevariant).click().perform();
		choosevariant.sendKeys(Keys.ARROW_DOWN);
		choosevariant.sendKeys(Keys.ENTER);
		driver.navigate().back();
		search.click();		
			
	}
	
	
    public void Instagram() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", Instagramlink);
		driver.navigate().back();
	
	}
	
    public void facebook() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", facebooklink);
		driver.navigate().back();
	
	}
	
    public void career() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", Career);
		driver.navigate().back();
	
	}
    
   public void contact() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", Instagramlink);
		driver.navigate().back();	
	}
	
   public void privacypolicy() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", privacypolicy);
		driver.navigate().back();
	
	}
   
   public void TermOfUse() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", TermOfUse);
		driver.navigate().back();
	
	}
   
   public void AreYouTyre() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", AreYouTyre);
		driver.navigate().back();	
	}
	
	
   public void AccessoriesMenuMethod() throws InterruptedException {
	   
	   Actions actions = new Actions(driver);
	   actions.moveToElement(AccessoriesMenu).perform();
	   WebElement Accessoriesoption =  driver.findElement(By.xpath("//a[@title=\"Accessories\"]"));
       Accessoriesoption.click();
       
   }
	
	public void Logout() {
		

		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", Logout);
		Logout.click();		
	}
  
		
	public void BatteryMenuMethod() {
	
		   Actions actions = new Actions(driver);
		   actions.moveToElement(AccessoriesMenu).perform();
		   WebElement Batteriesoption =  driver.findElement(By.xpath("//a[contains(text(),'Batteries')]"));
		   Batteriesoption.click();
		
	}

	public void AlloysWheelsMethod() {
		
		   Actions actions = new Actions(driver);
		   actions.moveToElement(AccessoriesMenu).perform();
		   WebElement alloys =  driver.findElement(By.xpath("//a[contains(text(),'Alloys Wheels')]"));
		   alloys.click();
		
		
		
	}
	
	
	
	public void More() {
		
	   Actions actions = new Actions(driver);
	   actions.moveToElement(MoreDropdown).perform();
	   actions.moveToElement(compareTyres).click().perform();	
		
	}
	
	public void nameTyresForPopularVehicles() {
		
	List<WebElement> tyrelist = driver.findElements(By.xpath("//ul[@class=\"custom-carousel vehicleTyreCarousel dealer-list-carousel mb-2 tmlist-carousel\"]"))	;
	
	System.out.println("Popular Vehicle Tyres:");	

	for (WebElement tyre : tyrelist) {
		
		System.out.println(tyre.getText());	
	}
	
  }
	
	
	public void PopularTyreBrandsName(){
				
		List<WebElement> tyreBrandsList = driver.findElements(By.xpath("//div[@class='tab-content hm-carousel']//ul[@class='no-carousel custom-carousel flex-nowrap mb-0']/li//span[@class='card-title']"))	;
		System.out.println("Popular Tyre Brands:");	

		for (WebElement Brand : tyreBrandsList) {
			
			System.out.println(Brand.getText());		
			
		}
			
	}
	
	public void AllCity() {
		
		List<WebElement> CitiesList = driver.findElements(By.xpath("//div[@class='col-12 brand-list-wrapper shadow-box city-wrapper']//ul[@class='no-carousel cities_carousel']/li/a"))	;
		System.out.println("Availabe Cities:");	
		
		for (WebElement city : CitiesList) {
			
			System.out.println(city.getText());
			
		}
					
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
	
	   
	   public void search() throws InterruptedException {
		 Thread.sleep(5000);
	     WebElement	 search =  driver.findElement(By.xpath("//input[@class=\"form-control searchBar elasticSearch ui-autocomplete-input\"]"));
	     search.sendKeys("ceat");
	     search.sendKeys(Keys.ENTER);
         driver.navigate().back();
		   
		   
	   }
	      
	   
	
}