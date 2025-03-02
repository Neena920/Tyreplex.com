package com.tyreplex.pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadformPage {

	WebDriver driver;
	@FindBy(xpath="//input[@placeholder=\"Enter Pincode\"]")
    private WebElement enterpincode;
	
	@FindBy(xpath="//button[@class=\"btn btn-outline-theme ml-3 lead_form_popup_trg\"]")
    private WebElement viewcontact;
	
	@FindBy(xpath="//input[@title=\"Name should only contain lowercase or uppercase letters. e.g. Tyre Plex\"]")
    private WebElement entername;
	
	@FindBy(xpath="//input[@name=\"mobile\"]")
    private WebElement entermobile;
	
	@FindBy(xpath="//div[@class=\"text-start d-flex align-items-center\"]")
    private WebElement submit ;

	@FindBy(xpath="//input[@maxlength=\"4\"]")
    private WebElement enterotp ;
	
	@FindBy(xpath="//label[contains(text(),'I accept the ')]")
    private WebElement checkbox ;
	
	@FindBy(xpath="//label[@for=\"feedback-rating-5\"]")
    private WebElement fivefeedbackrating ;
	
	@FindBy(xpath="//button[contains(text(),'Write a review')]")
    private WebElement writeReview ;
	
	@FindBy(xpath="//label[@for=\"rcm_no\"]")
    private WebElement NoButton ;
	
	@FindBy(xpath="//label[contains(text(),' Yes ')]")
    private WebElement YesButton ;
	
	@FindBy(xpath="//textarea[@name=\"ratingFeedback\"]")
    private WebElement ShareExperience ;
	
	@FindBy(xpath="//button[@id=\"ratingSubmit\"]")
    private WebElement RatingSubmitButton;
	
	@FindBy(xpath="	//a[contains(text(),'All MRF Showrooms')]\r\n")
    private WebElement MRFshowroom;
	
	@FindBy(xpath="//a[contains(text(),'Latest Car Tyres')]")
    private WebElement LatestCarTyres;	

	@FindBy(xpath="(//button[contains(text(),' Check Offers')])[1]")
    private WebElement checkoffers;
	
	
	@FindBy(xpath="//ul[contains(@class, 'thumbnails')]//li")
    private List<WebElement> tyreImages ;
	
	
	public LeadformPage(WebDriver driver) {

	    this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
		

		
	public void WriteReviewMethod() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,6000)");
		js.executeScript("arguments[0].click();", writeReview);	
		js.executeScript("arguments[0].click();", fivefeedbackrating);	
		js.executeScript("arguments[0].click();", NoButton);	
		ShareExperience.sendKeys("Good");
		js.executeScript("arguments[0].click();", RatingSubmitButton);	
        driver.navigate().back();
 	    js.executeScript("window.scrollBy(0,-7000)");
		Thread.sleep(5000);
 	    js.executeScript("window.scrollBy(0,-7000)");
		System.out.println("write review done");
		
	}
	
	
     public void enterDetailsMethod() throws InterruptedException {
    	 

 		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		
    	// enterpincode.click();
    	// enterpincode.sendKeys("110059,New Delhi");
    	 viewcontact.click();
    	 entername.sendKeys("hyguhj");
    	 Thread.sleep(4000);
    	 entermobile.sendKeys("7171717171");
    	 submit.click();
    	 Thread.sleep(4000);
    	 driver.navigate().back();
    	// checkbox.click();
 		System.out.println("enter details done");

	}
	
     
     public void checkOffers() {
    	 
    	 Actions act = new Actions(driver); 	 
    	 checkoffers.click(); 
    	 enterpincode.sendKeys("122003,gurgoan");
    	 enterpincode.sendKeys(Keys.ENTER);
				  	 
     }
    
     
	
     public void clickImage() throws InterruptedException {
    	 
    	 if(tyreImages.size() >= 3) {
    	 
         for(int i=0;i<3; i++){
        	 
        	 tyreImages.get(i).click(); 	
        	 Thread.sleep(2000);
         }
 	 
    }
    	 else {
    	 		 
    		 System.out.println("Less than 3 images found");
    	 }
    	 
     }         
	
}
