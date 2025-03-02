package com.tyreplex.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MRFtyrespage {

	WebDriver driver;

    @FindBy(xpath="//a[@title=\"MRF NYLOGRIP ZAPPER\"]")
    private WebElement NYLOGRIPZAPPER;
	
    @FindBy(xpath="//button[contains(text(),'View more')]")
    private WebElement viewmorebutton;
	
    @FindBy(xpath="//button[@data-link=\"//www.tyreplex.com/mrf-tyres/nylogrip-zapper/sw-90-rs-10\"]")
    private WebElement checkOfferButton;
	
    @FindBy(xpath="//p[contains(text(),'New Delhi')]")
    private WebElement newDelhibutton;
    
    @FindBy(xpath="//span[contains(text(),'Search City')]")
    private WebElement clicksearchcity;
    
    @FindBy(xpath="//input[@class=\"select2-search__field\"]")
    private WebElement typesearchfield;
    
    @FindBy(xpath="//button[@class=\"btn-close ms-auto mt-2\"]")
    private WebElement crossbutton;
    
    @FindBy(xpath="//a[@data-lbl=\"Tyre Model Counts Filter-car\"]")
    private WebElement cartyres;
    
    @FindBy(xpath="//a[@data-lbl=\"Tyre Model Counts Filter-bike\"]")
    private WebElement biketyres;
    
    @FindBy(xpath="//a[@data-lbl=\"Tyre Model Counts Filter-scooter\"]")
    private WebElement ScooterTyres ;
    
    @FindBy(xpath="//a[@data-lbl=\"Tyre Model Counts Filter-commercial\"]")
    private WebElement CommercialTyres ;
    
    @FindBy(xpath="//button[@class=\"btn-close ms-auto mt-2\"]")
    private WebElement Delhipopup ;
	
    @FindBy(xpath="//a[@data-lbl=\"Tyre Models For Vehicle Widget\"]")
    private WebElement MRFoffertyre ;
    
    @FindBy(xpath="//button[@class=\"btn-close ms-auto mt-2\"]")
    private WebElement crossbutton2 ;
    
    @FindBy(xpath="//span[@title=\"Most Popular\"]")
    private WebElement mostpopular ;
    
    @FindBy(xpath="//input[@aria-controls=\"select2-filterBy_option-results\"]")
    private WebElement searchmostpopular ;
    

    @FindBy(xpath="//span[contains(text(),'Honda City 5th Gen Tyres')]")
    private WebElement HondaCity5thGenTyres ;
    
    
     
	public MRFtyrespage(WebDriver driver) {

	    this.driver = driver;
		PageFactory.initElements(driver, this);	
		
	}
	
	public void LowToHigh() {
		
		mostpopular.click();	
		searchmostpopular.sendKeys("low");
		searchmostpopular.sendKeys(Keys.ARROW_DOWN);
		searchmostpopular.sendKeys(Keys.ENTER);

	}
	
	
	public void HightoLow() {
		
		mostpopular.click();	
		searchmostpopular.sendKeys("high");
		searchmostpopular.sendKeys(Keys.ARROW_DOWN);
		searchmostpopular.sendKeys(Keys.ENTER);

	}
	
	public void HondaCity5thGenTyresMethod() {
		
		HondaCity5thGenTyres.click();
		
	}
		
	
	public void TyresNameAndPrice() {
		
    List<WebElement> tyreNames =	driver.findElements(By.xpath("//div[@class=\"product-item\"]"));

	System.out.println("List of Tyres and Prices:");	
		
    for(int i=0;i<tyreNames.size();i++){
    	
     	System.out.println("Tyrenames:" + tyreNames.get(i).getText() );
    
    }			
		
	}
		
	public void clickNYLOGRIPZAPPER(){
		
		NYLOGRIPZAPPER.click();	
		driver.navigate().back();
		
	}
	
	public void MRFtyresFound() {
		
		biketyres.click();
		ScooterTyres.click();
		CommercialTyres.click();
		cartyres.click();

		
	}
	

	   public void VerifyPageTitle() {
		   
		   String expectedTitle = "Top-Quality Alloys at TyrePlex: Get Reliable Alloy for Your Vehicle";
		   String actualTitle = driver.getTitle();
		   if(actualTitle.contains(expectedTitle)) {
			   
			   System.out.println("Page title verified " );		   
		   }
		   else {
			   
			   System.out.println("Title mismatch " );	   
			   
		   }
		      
	   }
	
	
	
	
	
	
	
	
	
	
	
}
