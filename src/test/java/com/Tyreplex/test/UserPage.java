package com.Tyreplex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver driver;	
	
	@FindBy(xpath="//a[@id=\"orderHistory_tab\"]")
	private WebElement orderHistory;

	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	private WebElement privacypolicy;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	private WebElement contactus;
	
	@FindBy(xpath=" //a[contains(text(),'Are you a Tyre Dealer?')]")
	private WebElement AreYouTyre;
	
	@FindBy(xpath=" //a[contains(text(),' Terms of use ')]")
	private WebElement TermOfUse;
	
	@FindBy(xpath=" //a[contains(text(),' Career')]")
	private WebElement Career;
	
	@FindBy(xpath=" //a[contains(text(),' Shipping & Return Policy ')]")
	private WebElement  ShippingReturnPolicy ;
	
	@FindBy(xpath="//button[@title=\"Facebook\"]")
	private WebElement facebooklink;
	
	@FindBy(xpath="//button[@title=\"Instagram\"]")
	private WebElement Instagramlink;
	

	@FindBy(xpath="//input[@placeholder=\"Search tyres for your Vehicle\"]")
	private WebElement search;
	
	public UserPage(WebDriver driver) {
		
	    this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
     public void SearchMethod() {
		
		search.sendKeys("****");
		//driver.navigate().back();
	}
	
		
	public void orderHistoryMethod() {
		
		orderHistory.click();
		driver.navigate().back();
	}
	
	
   public void privacypolicyMethod() {
		
	   privacypolicy.click();
		driver.navigate().back();
	}
	
   public void AreYouTyreMethod() {
		
	   AreYouTyre.click();
		driver.navigate().back();
	}
	
   public void contactusMethod() {
		
	   contactus.click();
		driver.navigate().back();
	}
	
	
   public void TermOfUseMethod() {
		
	   TermOfUse.click();
		driver.navigate().back();
	}
   
   public void CareerMethod() {
		
	   Career.click();
		driver.navigate().back();
	}
	
   public void ShippingReturnPolicyMethod() {
		
	   ShippingReturnPolicy.click();
		driver.navigate().back();
	}
	

   public void facebooklinkMethod() {
		
	   facebooklink.click();
		driver.navigate().back();
	}
   

   public void InstagramlinkMethod() {
		
	   Instagramlink.click();
		driver.navigate().back();
	}
	
	
	
	
	
}
