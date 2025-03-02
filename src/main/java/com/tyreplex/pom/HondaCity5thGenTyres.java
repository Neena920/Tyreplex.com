package com.tyreplex.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HondaCity5thGenTyres {

	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Change Car')]")
	private WebElement changecar;
	
	@FindBy(xpath = "//button[@class=\"btn-close ms-auto mt-2\"]")
	private WebElement crossbutton;

	@FindBy(xpath = "//select[@placeholder=\"Choose Variant for Tyre Size\"]")
	private WebElement ChooseVariantforTyreSize;

	@FindBy(xpath = "//span[contains(text(),'Choose Variant for Tyre Size')]")
	private WebElement SearchChooseVariantforTyreSize;

	@FindBy(xpath = "//a[@title=\"MRF\"]")
	private WebElement MRFlink;

	@FindBy(xpath = "//a[@title=\"CEAT\"]")
	private WebElement CEATlink;

	@FindBy(xpath = "//a[@title=\"Goodyear\"]")
	private WebElement Goodyearlink;

	@FindBy(xpath = "//span[contains(text(),'Filter By')]")
	private WebElement FilterBy;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	private WebElement FilterSearchField;

	@FindBy(xpath = "//span[contains(text(),'Most Popular')]")
	private WebElement MostPopular;

	@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
	private WebElement MostPopularSearchField;

	@FindBy(xpath = "//div[contains(text(),'185/55 R16')]")
	private WebElement UXROYALE;

	@FindBy(xpath = "//button[contains(text(),'View more')]")
	private WebElement viewmore;

	@FindBy(xpath = "//span[contains(text(),'Goodyear')]")
	private WebElement goodyear;

	@FindBy(xpath = "//span[contains(text(),'MRF')]")
	private WebElement mrf;

	@FindBy(xpath = "//span[contains(text(),'CEAT')]")
	private WebElement ceat;

	@FindBy(xpath = "//span[contains(text(),'Apollo')]")
	private WebElement apollo;

	@FindBy(xpath = "//a[@title=\"Bridgestone Tyres for Honda City 5th Gen\"]")
	private WebElement bridgestone;

	@FindBy(xpath = "//div[contains(text(),'Honda Jazz')]")
	private WebElement HondaJazz;

	@FindBy(xpath = "//div[contains(text(),'Honda Brio')]")
	private WebElement HondaBrio;

	@FindBy(xpath = "//div[contains(text(),'Honda Civic')]")
	private WebElement HondaCivic;

	@FindBy(xpath = "//div[contains(text(),'Honda WR-V')]")
	private WebElement HondaWR;

	@FindBy(xpath = "//a[contains(text(),'Tyre pressure for City 5th Gen Variants')]")
	private WebElement tyrepressurelink;

	@FindBy(xpath = "//p[contains(text(),'New Delhi')]")
	private WebElement newdelhi;

	@FindBy(xpath = "//p[contains(text(),'Gurgaon')]")
	private WebElement gurgoan;

	@FindBy(xpath = "//p[contains(text(),'Ahmedabad')]")
	private WebElement ahmedabad;

	@FindBy(xpath = "//span[contains(text(),'Search City')]")
	private WebElement searchcity;

	@FindBy(xpath = "//input[@aria-controls=\"select2-search-city-results\"]")
	private WebElement searchfield;

	@FindBy(xpath = "//a[@data-vars-event-label=\"Tyre Dealers By City Name Widget - All\"]")
	private WebElement viewAllnews;

	@FindBy(xpath = "//a[@id=\"carTyres-tab\"]")
	private WebElement car;

	@FindBy(xpath = "//a[contains(text(),' Bike ')]")
	private WebElement bike;

	@FindBy(xpath = "//span[@data-select2-id=\"select2-data-266-k0wv\"]")
	private WebElement choosebrandbike;

	@FindBy(xpath = "//input[@aria-controls=\"select2-nudge_vehicle_make_select-results\"]")
	private WebElement searchbrandlbike;

	@FindBy(xpath = "//a[@id=\"vehicle_make_model_nudge_submit\"]")
	private WebElement findtyresearch;

	@FindBy(xpath = "//span[contains(text(),'Choose Brand')]")
	private WebElement choosebrand;

	@FindBy(xpath = "//input[@aria-controls=\"select2-nudge_vehicle_make_select-results\"]")
	private WebElement searchchoosebrand;

	@FindBy(xpath = "//span[contains(text(),'Choose Model')]")
	private WebElement chooseModel;

	@FindBy(xpath = "//input[@aria-controls=\"select2-nudge_vehicle_model_select-results\"]")
	private WebElement searchchoosemodel;

	@FindBy(xpath = "//span[contains(text(),'Choose Variant')]")
	private WebElement choosevariant;

	@FindBy(xpath = "//input[@aria-controls=\"select2-nudge_vehicle_variant_select-results\"]")
	private WebElement searchchoosevariant;	

	@FindBy(xpath = "//a[contains(text(),'Scooter')] ")
	private WebElement scooter;
	
	@FindBy(xpath = "//div[@class=\"product-item\"] ")
	private List<WebElement> tyresList;
	

	public HondaCity5thGenTyres(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		
      	}
	
	public void CrossButtonMethod() {
		
		crossbutton.click();
			
	}
	
	public void TyresForCity5Gen() {
		
		
		System.out.println("Tyre(s) found for City 5th Gen:");	
		
	    for(int i=0;i<tyresList.size();i++){
	    	
	     	System.out.println("Tyrenames:" + tyresList.get(i).getText() );
	    
	    }			
					
	}
	
	
	public void searchcityMethod() throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");

		Thread.sleep(5000);
	    WebElement search =	driver.findElement(By.xpath("//span[@title=\"Search City\"]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(search).click().perform();

		Thread.sleep(3000);
     
     	WebElement searchfield = driver.findElement(By.xpath("//input[@aria-controls=\"select2-search-city-results\"]"));
		js.executeScript("arguments[0].click();",searchfield );

		searchfield.sendKeys(Keys.ARROW_DOWN);
		searchfield.sendKeys(Keys.ARROW_DOWN); 
		searchfield.sendKeys(Keys.ENTER);
        driver.navigate().back();

	}

   public void SearchChooseVariantforTyreSizeMethod() throws InterruptedException {
	    
	  JavascriptExecutor js = (JavascriptExecutor)driver; 
	  Thread.sleep(5000); 
	 // changecar.click();
	  Actions act = new Actions(driver);
	  act.moveToElement(ChooseVariantforTyreSize).click().perform();
      act.sendKeys(Keys.ARROW_DOWN).perform();
      act.sendKeys(Keys.ARROW_DOWN).perform();
      act.sendKeys(Keys.ENTER).perform();
      driver.navigate().back();
  
	  }
   
	  
	  public void MostPopularMethod() {
	  
	  MostPopular.click(); MostPopularSearchField.sendKeys(Keys.ARROW_DOWN);
	  MostPopularSearchField.sendKeys(Keys.ARROW_DOWN);
	  MostPopularSearchField.sendKeys(Keys.ENTER);
	  
	  }
	 

	public void UXROYALEMethod() {

		UXROYALE.click();
		driver.navigate().back();

	}

	public void popularTyreBrandsMethod() {
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("arguments[0].click();", goodyear);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", mrf);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", ceat);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", apollo);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", bridgestone);
		driver.navigate().back();

	}

	public void OtherCarTyres() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		js.executeScript("arguments[0].click();", HondaJazz);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", HondaBrio);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", HondaCivic);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", HondaWR);
		driver.navigate().back();

		// viewmore.click();

	}

	public void tyrepressurelinkMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].click();", tyrepressurelink);
		driver.navigate().back();

	}

	public void PopularCities() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		js.executeScript("arguments[0].click();", newdelhi);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", gurgoan);
		driver.navigate().back();

		js.executeScript("arguments[0].click();", ahmedabad);
		driver.navigate().back();

	}

	public void viewNewsMethod() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", viewAllnews);
		driver.navigate().back();

	}

	public void FindTyresForCar() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		System.out.println(driver.getTitle());
		js.executeScript("arguments[0].click();", bike);
		Actions act = new Actions(driver);
		
		
	    WebElement choosebikebrand = driver.findElement(By.xpath("(//span[contains(text(),'Choose Brand')])[1]"));
		act.moveToElement(choosebikebrand).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
		 


	

		// WebElement choosebrand =
		// driver.findElement(By.id("select2-nudge_vehicle_make_select-container"));
		// js.executeScript("arguments[0].click();", choosebrand);
		System.out.println("done");


		/*
		 * js.executeScript("arguments[0].click();", choosebrandbike);
		 * searchbrandlbike.sendKeys(Keys.ARROW_DOWN);
		 * searchbrandlbike.sendKeys(Keys.ENTER);
		 */
		//chooseModel.click();
		//searchchoosemodel.sendKeys("800");

		/*
		 * WebElement searchchoosebrand =
		 * driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
		 * js.executeScript("arguments[0].click();", searchchoosebrand);
		 */

	//	js.executeScript("arguments[0].click();", findtyresearch);

		// searchchoosebrand.sendKeys("Tata");
		// searchchoosebrand.sendKeys(Keys.ENTER);
		/*
		 * chooseModel.click(); searchchoosemodel.sendKeys(Keys.ARROW_DOWN);
		 * searchchoosemodel.sendKeys("nexon");
		 * searchchoosemodel.sendKeys(Keys.ARROW_DOWN);
		 * searchchoosemodel.sendKeys(Keys.ENTER);
		 * 
		 * choosevariant.click(); searchchoosevariant.sendKeys(Keys.ARROW_DOWN);
		 * searchchoosevariant.sendKeys(Keys.ENTER);
		 * 
		 * findtyresearch.click(); driver.navigate().back();
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
