package com.tyreplex.pom;

import java.nio.file.attribute.AclEntry;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TyreplexLoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your mobile number\"]")
	private WebElement Mobilenumberfield;
	
	@FindBy(xpath="//button[contains(text(),'Get OTP')]")
	private WebElement OTPbutton;
	
	@FindBy(xpath="//input[@name=\"elasticSearch\"]")
	private WebElement Searchfield;
	
	@FindBy(xpath="//button[@title=\"Login\"]")
	private WebElement Loginbutton;

	@FindBy(xpath="//a[@title=\"Tyreplex.com\"]")
	private WebElement TyrePlexIconlink;
	
	@FindBy(xpath="//a[contains(text(),'Car Tyres')]")
	private WebElement CarTyreslink;
	
	@FindBy(xpath="//a[contains(text(),'Bike Tyres')]")
	private WebElement BikeTyreslink;
	
	@FindBy(xpath="//a[contains(text(),'Tyre Pressure')]")
	private WebElement TyresPressurelink;
	
	@FindBy(xpath="//a[contains(text(),'Commercial Tyres')]")
	private WebElement CommercialTyreslink;
	
	@FindBy(xpath="//a[contains(text(),'Accessories')]")
	private WebElement  Accessorieslink;
	
	@FindBy(xpath="//a[contains(text(),'More')]")
	private WebElement  Morelink;

	@FindBy(xpath="//a[contains(text(),'Terms of Cookie use')]")
	private WebElement  TermsofCookieuse;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy.')]")
	private WebElement  PrivacyPolicy;

	@FindBy(xpath="//button[@class=\"btn-close ms-auto mt-2 px-3\"]")
	private WebElement  crossbutton;		
	
//	public void Search() {
		
//		search.click();					
//	}
	
	   public  TyreplexLoginPage(WebDriver driver) {
		
	    this.driver = driver;
        PageFactory.initElements(driver,this);
	}
	
	public void LoginMethod() throws InterruptedException {
		
		
		try {
			

			Loginbutton.click();
			Mobilenumberfield.sendKeys("8287986947");
			Thread.sleep(15000);
			OTPbutton.click();	
			
			
		} catch (Exception e) {

			System.out.println("not Login");
			
		}
		
	}
	
	public void SearchMethod()throws InterruptedException {
		
		Searchfield.sendKeys("MRF");	
		Searchfield.sendKeys(Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void CartyresMethod() {
		
		CarTyreslink.click();
	//	driver.navigate().back();
	}
	
	public void BikeTyresmethod() {
		
		BikeTyreslink.click();
	//	driver.navigate().back();
	}
	
	public void TyrePressureLinkMethod() {
       
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", TyresPressurelink);		

		TyresPressurelink.click();
    	driver.navigate().back();

	}
		
	public void MoreLinkMethod() {
		
		Morelink.click();
		//driver.navigate().back();
	}
	
	public void ClickLoginMethod() {
		
		Loginbutton.click();
		
	}
	
	
	public void TermsofCookieuseMethod() {
		

		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", TermsofCookieuse);	
		js.executeScript("arguments[0].click();", crossbutton);	

		
		
	}
	
	
	public void PrivacyPolicyMethod() {
		

		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", PrivacyPolicy);	
		js.executeScript("arguments[0].click();", crossbutton);	
			
	}
	
	public void CommercialTyreslinkMethod() {
		
		CommercialTyreslink.click();
		crossbutton.click();

	}
	
	
	public void AccessorieslinkMethod() {
		
		Accessorieslink.click();
		crossbutton.click();

	}
	

	   public void VerifyPageTitle() {
		   
		   String expectedTitle = "Login to TyrePlex";
		   String actualTitle = driver.getTitle();
		   if(actualTitle.contains(expectedTitle)) {
			   
			   System.out.println("Page title verified " );		   
		   }
		   else {
			   
			   System.out.println("Title mismatch " );	   
			   
		   }
		      
	   }
	
	
}
