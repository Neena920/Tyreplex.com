package com.tyreplex.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareTyrespage {

	
	WebDriver driver;

	@FindBy(xpath = "//a[@data-make_model_variant_1=\"19904__pirelli__xl-s-verde__255-55-r20-110w-tl-p\"]")
	private WebElement compareButton;
	
	@FindBy(xpath = "//a[contains(text(),'Pirelli Scorpion VERDE 255/55 R20 110W TL')]")
	private WebElement PirelliScorpion;
	
	@FindBy(xpath = "//a[contains(text(),'Michelin PILOT SPORT 4 SUV 255/55 R20 110Y XL TL')]")
	private WebElement MichelinPILOT ;
	
	@FindBy(xpath = "//a[contains(text(),'Michelin PILOT SPORT 4 SUV 255/55 R20 110Y XL TL')]")
	private WebElement contactMichelin;
	
	@FindBy(xpath = "//div[contains(text(),'Add tyre')]")
	private WebElement AddTyre;
	
	@FindBy(xpath = "//span[@title=\"Tyre Brand\"]")
	private WebElement Tyrebrand;

	@FindBy(xpath = "//span[@title=\"Tyre Model\"]")
	private WebElement TyreModel;
	
	@FindBy(xpath = "//span[@title=\"Model Variant\"]")
	private WebElement ModelVariant;
	
	
    public CompareTyrespage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
    public void CompareButtonMethod() {
    	
    	compareButton.click();
    }
    
    
	public void DisplayedTyreName() {
		
		if(PirelliScorpion.isDisplayed() && MichelinPILOT.isDisplayed()) {
			
			System.out.println("both tyres are displayed");	
			
		}	
	}
	
	public void ContactDealer() {
		
		contactMichelin.click();
			
	}
	
	
	public void AddTyre() {
		
		Actions act = new Actions(driver);
		act.moveToElement(AddTyre).click().perform();
		act.moveToElement(Tyrebrand).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		act.moveToElement(TyreModel).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		act.moveToElement(ModelVariant).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();		
		
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
